package com.projects.sharathnagendra.soundboard;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    int buttonClicked =0;

    MediaPlayer mediaPlayer;

        public void makeSound (View view)
        {
            buttonClicked = 1;
            int id = view.getId();
            String myId = view.getResources().getResourceEntryName(id);
            int resID = getResources().getIdentifier(myId, "raw", "com.projects.sharathnagendra.soundboard");
            mediaPlayer = MediaPlayer.create(this, resID);
            Log.i("data", myId);
            mediaPlayer.start();
            if (buttonClicked == 1)
                return;

        }

        public void stopSound(View view)
        {
            int id = view.getId();
            String myId = view.getResources().getResourceEntryName(id);
            int resID = getResources().getIdentifier(myId, "raw", "com.projects.sharathnagendra.soundboard");
            mediaPlayer = MediaPlayer.create(this, resID);
            Log.i("data", myId);
            mediaPlayer.pause();
        }




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



    }

}