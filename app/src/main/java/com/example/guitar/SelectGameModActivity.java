package com.example.guitar;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.MediaController;
import android.widget.Toast;
import android.widget.VideoView;

public class SelectGameModActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_select_game_mod);
    }

    @Override
    protected void onStart() {
        super.onStart();

        VideoView tap = (VideoView)findViewById(R.id.videoView3);
        VideoView swipe = (VideoView)findViewById(R.id.videoView2);
        tap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                swipe.rel
                tap.setVideoURI(Uri.parse("android.resource://" + getPackageName() +"/"+R.raw.tapmod));
                tap.setMediaController(new MediaController(getApplicationContext()));
                tap.requestFocus();
                tap.start();
            }
        });
        swipe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                swipe.setVideoURI(Uri.parse("android.resource://" + getPackageName() +"/"+R.raw.swipemod));
                swipe.requestFocus();
                swipe.setMediaController(new MediaController(getApplicationContext()));
                swipe.start();
            }
        });

        /*View.OnClickListener videoListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch(v.getId()){
                    case R.id.videoView3:
                        tap.start(); break;
                    case R.id.videoView2:
                        swipe.start(); break;
                }
            }
        };
        tap.setOnClickListener(videoListener);
        swipe.setOnClickListener(videoListener);*/
        CheckBox tapMode = (CheckBox)findViewById(R.id.checkBox2);
        CheckBox swipeMode = (CheckBox)findViewById(R.id.checkBox);
        Button confirm = (Button)findViewById(R.id.button6);
        confirm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(tapMode.isChecked()&&!swipeMode.isChecked()){
                    Intent intent = new Intent(SelectGameModActivity.this, MainActivity.class);
                    startActivity(intent);
                    SelectGameModActivity.this.finish();
                }
                if(swipeMode.isChecked()&&!tapMode.isChecked()){
                    Intent intent = new Intent(SelectGameModActivity.this, MainActivity2.class);
                    startActivity(intent);
                    SelectGameModActivity.this.finish();
                }
                if(!swipeMode.isChecked()&&!tapMode.isChecked()){
                    Toast.makeText(getApplicationContext(), "Выберите режим игры", Toast.LENGTH_LONG).show();
                }
                if(tapMode.isChecked()&&swipeMode.isChecked()){
                    Toast.makeText(getApplicationContext(), "Выберите какой-то один режим игры", Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}