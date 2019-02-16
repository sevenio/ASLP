package com.example.gangadhar.aslpapp;

import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;
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
import java.util.Locale;

public class SecondActivity extends AppCompatActivity implements View.OnClickListener {
    private static final String ARTICULATON_DATA_ITEMS = "ARTICULATON_DATA_ITEMS";
    private static final String ARTICULATON_DATA_ITEMS_BUNDLE = "ARTICULATON_DATA_ITEMS_BUNDLE";
    private CardView next, playAgain, speak, correct, wrong, status;
    private TextView imageName, cardIndex, correctCountText, wrongCountText;
    private ImageView image;
    private MediaPlayer mediaPlayer = new MediaPlayer();


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
            mediaPlayer = MediaPlayer.create(SecondActivity.this, R.raw.one);
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
                break;
            }
            case R.id.image: {
                onPlay();
                break;
            }
        }
    }
}
