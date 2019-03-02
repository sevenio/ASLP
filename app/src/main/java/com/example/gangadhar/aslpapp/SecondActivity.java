package com.example.gangadhar.aslpapp;

import android.Manifest;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.media.MediaPlayer;
import android.speech.RecognitionListener;
import android.speech.RecognizerIntent;
import android.speech.SpeechRecognizer;
import android.support.annotation.NonNull;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.support.v4.content.res.ResourcesCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class SecondActivity extends AppCompatActivity implements View.OnClickListener {
    private static final String ARTICULATON_DATA_ITEMS = "ARTICULATON_DATA_ITEMS";
    private static final String ARTICULATON_DATA_ITEMS_BUNDLE = "ARTICULATON_DATA_ITEMS_BUNDLE";
    private static final int REQUEST_SPEECH_RECOGNIZER = 123;
    private CardView next, playAgain, speak, correct, wrong, status;
    private TextView imageName, cardIndex, correctCountText, wrongCountText;
    private ImageView image;
    private MediaPlayer mediaPlayer = new MediaPlayer();
    private static final int REQUEST_RECORD_PERMISSION = 100;

    public static Intent createIntent(Context context, ArrayList<ArticulationDataItem> articulationDataItems) {

        Intent intent = new Intent(context, SecondActivity.class);
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList(ARTICULATON_DATA_ITEMS, articulationDataItems);
        intent.putExtra(ARTICULATON_DATA_ITEMS_BUNDLE, bundle);
        return intent;
    }

    private void setupViews() {
        next = findViewById(R.id.next);
        playAgain = findViewById(R.id.play_again);
        speak = findViewById(R.id.speak);
        correct = findViewById(R.id.correct);
        wrong = findViewById(R.id.wrong);
        imageName = findViewById(R.id.image_name);
        image = findViewById(R.id.image);
        status = findViewById(R.id.status);
        cardIndex = findViewById(R.id.card_index);
        correctCountText = findViewById(R.id.correct_count_text);
        wrongCountText = findViewById(R.id.wrong_count_text);
    }

    private int wrongCount = 0, correctCount = 0, cardNumber = 0;

    private void bindView(ArticulationDataItem articulationDataItem) {
        image.setImageResource(articulationDataItem.getmImageId());
        imageName.setText(getResources().getString(articulationDataItem.getmLetterId()));
        cardIndex.setText(String.format(Locale.ENGLISH, "%d/%d", cardNumber + 1, articulationDataItems.size()));
        wrongCountText.setText(String.format(Locale.ENGLISH, "%d", wrongCount));
        correctCountText.setText(String.format(Locale.ENGLISH, "%d", correctCount));

    }

    private ArrayList<ArticulationDataItem> articulationDataItems;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        if (getIntent() != null) {
            articulationDataItems = getIntent().getBundleExtra(ARTICULATON_DATA_ITEMS_BUNDLE).getParcelableArrayList(ARTICULATON_DATA_ITEMS);
        }

        setupViews();
        bindView(articulationDataItems.get(0));
        setOnclickListeners();

    }

    private void setOnclickListeners() {
        correct.setOnClickListener(this);
        wrong.setOnClickListener(this);
        next.setOnClickListener(this);
        playAgain.setOnClickListener(this);
        speak.setOnClickListener(this);
        image.setOnClickListener(this);
    }

    private void onCorrect() {
        if (cardNumber > articulationDataItems.size() - 1) {
            Toast.makeText(SecondActivity.this, "You reached the end of the cards ", Toast.LENGTH_LONG).show();
        } else {
            correctCount += 1;
            onNext();
        }
    }

    private void onWrong() {
        if (cardNumber > articulationDataItems.size() - 1) {
            Toast.makeText(SecondActivity.this, "You reached the end of the cards ", Toast.LENGTH_LONG).show();
        } else {
            wrongCount += 1;
            onNext();
        }

    }

    private void onNext() {
        if (cardNumber > articulationDataItems.size() - 2) {
            Toast.makeText(SecondActivity.this, "You reached the end of the cards ", Toast.LENGTH_LONG).show();
        } else {
            cardNumber = cardNumber + 1;
            bindView(articulationDataItems.get(cardNumber));
        }
    }


    private void onPlay() {
        if (cardNumber > articulationDataItems.size() - 2) {
            Toast.makeText(SecondActivity.this, "You reached the end of the cards ", Toast.LENGTH_LONG).show();
        } else {
            mediaPlayer.stop();
            mediaPlayer = MediaPlayer.create(SecondActivity.this, articulationDataItems.get(cardNumber).getmAudioId());
            mediaPlayer.start();
        }
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.correct: {
                onCorrect();
                break;
            }
            case R.id.wrong: {
                onWrong();
                break;
            }
            case R.id.next: {
                onNext();
                break;
            }
            case R.id.play_again: {
                onPlay();
                break;
            }
            case R.id.speak: {
                SharedPreferences prefs = getSharedPreferences("my_prefs", MODE_PRIVATE);
               if(prefs.getBoolean("isLanguageSupported", false)) {

                   if (checkWriteExternalPermission()) {
                       startSpeechRecognizer();
                   } else {
                       ActivityCompat.requestPermissions
                               (SecondActivity.this,
                                       new String[]{Manifest.permission.RECORD_AUDIO},
                                       REQUEST_RECORD_PERMISSION);
                   }
               }else {
                   Toast.makeText(SecondActivity.this, "Telugu language not supported", Toast.LENGTH_SHORT).show();

               }
                break;
            }
            case R.id.image: {
                onPlay();
                break;
            }
        }
    }


    private boolean checkWriteExternalPermission() {
        String permission = android.Manifest.permission.RECORD_AUDIO;
        int res = checkCallingOrSelfPermission(permission);
        return (res == PackageManager.PERMISSION_GRANTED);
    }
    private void startSpeechRecognizer() {
        Intent intent = new Intent
                (RecognizerIntent.ACTION_RECOGNIZE_SPEECH);
        intent.putExtra(RecognizerIntent.EXTRA_LANGUAGE_MODEL,
                RecognizerIntent.LANGUAGE_MODEL_FREE_FORM);
        intent.putExtra(RecognizerIntent.EXTRA_LANGUAGE, "te_IN");
        startActivityForResult(intent, REQUEST_SPEECH_RECOGNIZER);
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        switch (requestCode) {
            case REQUEST_RECORD_PERMISSION:
                if (grantResults.length > 0 && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                    startSpeechRecognizer();
                } else {
                    Toast.makeText(SecondActivity.this, "Permission Denied!", Toast.LENGTH_SHORT).show();
                }
        }
    }


    @Override
    protected void onActivityResult(int requestCode, int resultCode,
                                    Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (requestCode == REQUEST_SPEECH_RECOGNIZER) {
            if (resultCode == RESULT_OK) {
                List<String> results = data.getStringArrayListExtra
                        (RecognizerIntent.EXTRA_RESULTS);
                Toast.makeText(SecondActivity.this, results.get(0), Toast
                        .LENGTH_SHORT).show();

            }
        }
    }


}
