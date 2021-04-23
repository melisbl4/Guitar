package com.example.guitar;

import androidx.appcompat.app.AppCompatActivity;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import android.gesture.Gesture;
import android.gesture.GestureLibraries;
import android.gesture.GestureLibrary;
import android.gesture.GestureOverlayView;
import android.gesture.GestureOverlayView.OnGesturePerformedListener;
import android.gesture.Prediction;

import java.util.ArrayList;

public class MainActivity2 extends AppCompatActivity {

    private MediaPlayer a, b, c, d, e, f;
    private int zeroLad = 0;
    private GestureLibrary gestureLib;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_not_main);

        GestureOverlayView gestureview = (GestureOverlayView) findViewById(R.id.gestures1);

        gestureLib = GestureLibraries.fromRawResource(this, R.raw.gesture);
        if (!gestureLib.load()) {
            finish();
        }

        gestureview.addOnGesturePerformedListener(handleGestureListener);
    }

    private OnGesturePerformedListener handleGestureListener = new OnGesturePerformedListener() {
        public void onGesturePerformed(GestureOverlayView gestureView,
                                       Gesture gesture) {

            ArrayList<Prediction> predictions = gestureLib.recognize(gesture);

            if (predictions.size() > 0) {
                Prediction prediction = predictions.get(0);
                if (prediction.score > 1.0) {
                    Toast.makeText(MainActivity2.this, "Ваш жест : " + prediction.name, Toast.LENGTH_LONG).show();
                }
            }

        }
    };

    public void soundPlay(MediaPlayer sound) {
        sound.seekTo(0);
        sound.start();
    }

    @Override
    protected void onResume() {
        super.onResume();

    }

    @Override
    protected void onPause() {
        super.onPause();

    }
}