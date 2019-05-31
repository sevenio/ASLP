package com.therapy.speech.telugu;


import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.speech.RecognizerIntent;

import java.util.ArrayList;
import java.util.List;

import static android.content.Context.MODE_PRIVATE;

public class LanguageDetailsReceiver extends BroadcastReceiver {
    List<String> mLanguages;
    private Context context;

    public LanguageDetailsReceiver(Context context) {
        this.context = context;
        mLanguages= new ArrayList<String>();
    }

    @Override
    public void onReceive(Context context, Intent intent)
    {
        Bundle extras = getResultExtras(true);
        mLanguages = extras.getStringArrayList
                (RecognizerIntent.EXTRA_SUPPORTED_LANGUAGES);
        if (mLanguages == null) {
            SharedPreferences.Editor editor = context.getSharedPreferences("my_prefs", MODE_PRIVATE).edit();
            editor.putBoolean("isLanguageSupported", false);
            editor.apply();

        } else {

            for (int i = 0; i < mLanguages.size(); i++) {
                if(  mLanguages.get(i).equals("te-IN")){
                    SharedPreferences.Editor editor = context.getSharedPreferences("my_prefs", MODE_PRIVATE).edit();
                    editor.putBoolean("isLanguageSupported", true);
                    editor.apply();
                }
            }

        }
    }
}