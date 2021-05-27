package com.example.guitar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
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
import java.util.concurrent.TimeUnit;

public class SwipeMod extends AppCompatActivity {

    private MediaPlayer a, b, c, d, e, f;
    private int zeroLad = 0;
    private GestureLibrary gestureLib;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_swipe_mod);

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
                    switch (prediction.name){
                        case "swipeDown":
                            soundPlay(a);
                            try {
                                TimeUnit.MILLISECONDS.sleep(50);
                            } catch (InterruptedException interruptedException) {
                                interruptedException.printStackTrace();
                            }
                            soundPlay(b);
                            try {
                                TimeUnit.MILLISECONDS.sleep(50);
                            } catch (InterruptedException interruptedException) {
                                interruptedException.printStackTrace();
                            }
                            soundPlay(c);
                            try {
                                TimeUnit.MILLISECONDS.sleep(50);
                            } catch (InterruptedException interruptedException) {
                                interruptedException.printStackTrace();
                            }
                            soundPlay(d);
                            try {
                                TimeUnit.MILLISECONDS.sleep(50);
                            } catch (InterruptedException interruptedException) {
                                interruptedException.printStackTrace();
                            }
                            soundPlay(e);
                            try {
                                TimeUnit.MILLISECONDS.sleep(50);
                            } catch (InterruptedException interruptedException) {
                                interruptedException.printStackTrace();
                            }
                            soundPlay(f);
                            break;
                        case "swipeUp":
                            soundPlay(f);
                            try {
                                TimeUnit.MILLISECONDS.sleep(50);
                            } catch (InterruptedException interruptedException) {
                                interruptedException.printStackTrace();
                            }
                            soundPlay(e);
                            try {
                                TimeUnit.MILLISECONDS.sleep(50);
                            } catch (InterruptedException interruptedException) {
                                interruptedException.printStackTrace();
                            }
                            soundPlay(d);
                            try {
                                TimeUnit.MILLISECONDS.sleep(50);
                            } catch (InterruptedException interruptedException) {
                                interruptedException.printStackTrace();
                            }
                            soundPlay(c);
                            try {
                                TimeUnit.MILLISECONDS.sleep(50);
                            } catch (InterruptedException interruptedException) {
                                interruptedException.printStackTrace();
                            }
                            soundPlay(b);
                            try {
                                TimeUnit.MILLISECONDS.sleep(50);
                            } catch (InterruptedException interruptedException) {
                                interruptedException.printStackTrace();
                            }
                            soundPlay(a);
                            break;
                    }
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
        Toast.makeText(getApplicationContext(), "Swipe mod activated", Toast.LENGTH_LONG).show();

        a = MediaPlayer.create(this, R.raw.a0);
        b = MediaPlayer.create(this, R.raw.b0);
        c = MediaPlayer.create(this, R.raw.c0);
        d = MediaPlayer.create(this, R.raw.d0);
        e = MediaPlayer.create(this, R.raw.e0);
        f = MediaPlayer.create(this, R.raw.f0);

        TextView one = (TextView) findViewById(R.id.textView6);
        TextView two = (TextView) findViewById(R.id.textView5);
        TextView three = (TextView) findViewById(R.id.textView4);
        TextView four = (TextView) findViewById(R.id.textView3);
        TextView five = (TextView) findViewById(R.id.textView2);

        ImageView krug1 = (ImageView) findViewById(R.id.imageView101); krug1.setAlpha(0);
        ImageView krug2 = (ImageView) findViewById(R.id.imageView102); krug2.setAlpha(0);
        ImageView krug3 = (ImageView) findViewById(R.id.imageView103); krug3.setAlpha(255);
        ImageView krug4 = (ImageView) findViewById(R.id.imageView104); krug4.setAlpha(0);
        ImageView krug5 = (ImageView) findViewById(R.id.imageView105); krug5.setAlpha(255);

        View.OnTouchListener stringA = new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if (event.getAction() == MotionEvent.ACTION_DOWN) {
                    a.release();
                    switch (v.getId()){
                        case R.id.buttonA1:
                            switch (zeroLad){
                                case 0: a = MediaPlayer.create(getApplicationContext(), R.raw.a1);break;
                                case 1: a = MediaPlayer.create(getApplicationContext(), R.raw.a2);break;
                                case 2: a = MediaPlayer.create(getApplicationContext(), R.raw.a3);break;
                                case 3: a = MediaPlayer.create(getApplicationContext(), R.raw.a4);break;
                            }
                            break;
                        case R.id.buttonA2:
                            switch (zeroLad){
                                case 0: a = MediaPlayer.create(getApplicationContext(), R.raw.a2);break;
                                case 1: a = MediaPlayer.create(getApplicationContext(), R.raw.a3);break;
                                case 2: a = MediaPlayer.create(getApplicationContext(), R.raw.a4);break;
                                case 3: a = MediaPlayer.create(getApplicationContext(), R.raw.a5);break;
                            }
                            Button button1 = (Button) findViewById(R.id.buttonA1); button1.setEnabled(false);
                            break;
                        case R.id.buttonA3:
                            switch (zeroLad){
                                case 0: a = MediaPlayer.create(getApplicationContext(), R.raw.a3);break;
                                case 1: a = MediaPlayer.create(getApplicationContext(), R.raw.a4);break;
                                case 2: a = MediaPlayer.create(getApplicationContext(), R.raw.a5);break;
                                case 3: a = MediaPlayer.create(getApplicationContext(), R.raw.a6);break;
                            }
                            Button button11 = (Button) findViewById(R.id.buttonA1); button11.setEnabled(false);
                            Button button2 = (Button) findViewById(R.id.buttonA2); button2.setEnabled(false);
                            break;
                        case R.id.buttonA4:
                            switch (zeroLad){
                                case 0: a = MediaPlayer.create(getApplicationContext(), R.raw.a4);break;
                                case 1: a = MediaPlayer.create(getApplicationContext(), R.raw.a5);break;
                                case 2: a = MediaPlayer.create(getApplicationContext(), R.raw.a6);break;
                                case 3: a = MediaPlayer.create(getApplicationContext(), R.raw.a7);break;
                            }
                            Button button111 = (Button) findViewById(R.id.buttonA1); button111.setEnabled(false);
                            Button button22 = (Button) findViewById(R.id.buttonA2); button22.setEnabled(false);
                            Button button3 = (Button) findViewById(R.id.buttonA3); button3.setEnabled(false);
                            break;
                        case R.id.buttonA5:
                            switch (zeroLad){
                                case 0: a = MediaPlayer.create(getApplicationContext(), R.raw.a5);break;
                                case 1: a = MediaPlayer.create(getApplicationContext(), R.raw.a6);break;
                                case 2: a = MediaPlayer.create(getApplicationContext(), R.raw.a7);break;
                                case 3: a = MediaPlayer.create(getApplicationContext(), R.raw.a8);break;
                            }
                            Button button1111 = (Button) findViewById(R.id.buttonA1); button1111.setEnabled(false);
                            Button button222 = (Button) findViewById(R.id.buttonA2); button222.setEnabled(false);
                            Button button33 = (Button) findViewById(R.id.buttonA3); button33.setEnabled(false);
                            Button button4 = (Button) findViewById(R.id.buttonA4); button4.setEnabled(false);
                            break;
                    }
                }
                if (event.getAction() == MotionEvent.ACTION_UP){
                    a.release();
                    a = MediaPlayer.create(getApplicationContext(), R.raw.a0);
                    Button button1 = (Button) findViewById(R.id.buttonA1); button1.setEnabled(true);
                    Button button2 = (Button) findViewById(R.id.buttonA2); button2.setEnabled(true);
                    Button button3 = (Button) findViewById(R.id.buttonA3); button3.setEnabled(true);
                    Button button4 = (Button) findViewById(R.id.buttonA4); button4.setEnabled(true);
                }
                return false;
            }
        };

        View.OnTouchListener stringB = new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if (event.getAction() == MotionEvent.ACTION_DOWN) {
                    b.release();
                    switch (v.getId()){
                        case R.id.buttonB1:
                            switch (zeroLad){
                                case 0: b = MediaPlayer.create(getApplicationContext(), R.raw.b1);break;
                                case 1: b = MediaPlayer.create(getApplicationContext(), R.raw.b2);break;
                                case 2: b = MediaPlayer.create(getApplicationContext(), R.raw.b3);break;
                                case 3: b = MediaPlayer.create(getApplicationContext(), R.raw.b4);break;
                            }
                            break;
                        case R.id.buttonB2:
                            switch (zeroLad){
                                case 0: b = MediaPlayer.create(getApplicationContext(), R.raw.b2);break;
                                case 1: b = MediaPlayer.create(getApplicationContext(), R.raw.b3);break;
                                case 2: b = MediaPlayer.create(getApplicationContext(), R.raw.b4);break;
                                case 3: b = MediaPlayer.create(getApplicationContext(), R.raw.b5);break;
                            }
                            Button button1 = (Button) findViewById(R.id.buttonB1); button1.setEnabled(false);
                            break;
                        case R.id.buttonB3:
                            switch (zeroLad){
                                case 0: b = MediaPlayer.create(getApplicationContext(), R.raw.b3);break;
                                case 1: b = MediaPlayer.create(getApplicationContext(), R.raw.b4);break;
                                case 2: b = MediaPlayer.create(getApplicationContext(), R.raw.b5);break;
                                case 3: b = MediaPlayer.create(getApplicationContext(), R.raw.b6);break;
                            }
                            Button button11 = (Button) findViewById(R.id.buttonB1); button11.setEnabled(false);
                            Button button2 = (Button) findViewById(R.id.buttonB2); button2.setEnabled(false);
                            break;
                        case R.id.buttonB4:
                            switch (zeroLad){
                                case 0: b = MediaPlayer.create(getApplicationContext(), R.raw.b4);break;
                                case 1: b = MediaPlayer.create(getApplicationContext(), R.raw.b5);break;
                                case 2: b = MediaPlayer.create(getApplicationContext(), R.raw.b6);break;
                                case 3: b = MediaPlayer.create(getApplicationContext(), R.raw.b7);break;
                            }
                            Button button111 = (Button) findViewById(R.id.buttonB1); button111.setEnabled(false);
                            Button button22 = (Button) findViewById(R.id.buttonB2); button22.setEnabled(false);
                            Button button3 = (Button) findViewById(R.id.buttonB3); button3.setEnabled(false);
                            break;
                        case R.id.buttonB5:
                            switch (zeroLad){
                                case 0: b = MediaPlayer.create(getApplicationContext(), R.raw.b5);break;
                                case 1: b = MediaPlayer.create(getApplicationContext(), R.raw.b6);break;
                                case 2: b = MediaPlayer.create(getApplicationContext(), R.raw.b7);break;
                                case 3: b = MediaPlayer.create(getApplicationContext(), R.raw.b8);break;
                            }
                            Button button1111 = (Button) findViewById(R.id.buttonB1); button1111.setEnabled(false);
                            Button button222 = (Button) findViewById(R.id.buttonB2); button222.setEnabled(false);
                            Button button33 = (Button) findViewById(R.id.buttonB3); button33.setEnabled(false);
                            Button button4 = (Button) findViewById(R.id.buttonB4); button4.setEnabled(false);
                            break;
                    }
                }
                if (event.getAction() == MotionEvent.ACTION_UP){
                    b.release();
                    b = MediaPlayer.create(getApplicationContext(), R.raw.b0);
                    Button button1 = (Button) findViewById(R.id.buttonB1); button1.setEnabled(true);
                    Button button2 = (Button) findViewById(R.id.buttonB2); button2.setEnabled(true);
                    Button button3 = (Button) findViewById(R.id.buttonB3); button3.setEnabled(true);
                    Button button4 = (Button) findViewById(R.id.buttonB4); button4.setEnabled(true);
                }
                return false;
            }
        };

        View.OnTouchListener stringC = new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if (event.getAction() == MotionEvent.ACTION_DOWN) {
                    c.release();
                    switch (v.getId()){
                        case R.id.buttonC1:
                            switch (zeroLad){
                                case 0: c = MediaPlayer.create(getApplicationContext(), R.raw.c1);break;
                                case 1: c = MediaPlayer.create(getApplicationContext(), R.raw.c2);break;
                                case 2: c = MediaPlayer.create(getApplicationContext(), R.raw.c3);break;
                                case 3: c = MediaPlayer.create(getApplicationContext(), R.raw.c4);break;
                            }
                            break;
                        case R.id.buttonC2:
                            switch (zeroLad){
                                case 0: c = MediaPlayer.create(getApplicationContext(), R.raw.c2);break;
                                case 1: c = MediaPlayer.create(getApplicationContext(), R.raw.c3);break;
                                case 2: c = MediaPlayer.create(getApplicationContext(), R.raw.c4);break;
                                case 3: c = MediaPlayer.create(getApplicationContext(), R.raw.c5);break;
                            }
                            Button button1 = (Button) findViewById(R.id.buttonC1); button1.setEnabled(false);
                            break;
                        case R.id.buttonC3:
                            switch (zeroLad){
                                case 0: c = MediaPlayer.create(getApplicationContext(), R.raw.c3);break;
                                case 1: c = MediaPlayer.create(getApplicationContext(), R.raw.c4);break;
                                case 2: c = MediaPlayer.create(getApplicationContext(), R.raw.c5);break;
                                case 3: c = MediaPlayer.create(getApplicationContext(), R.raw.c6);break;
                            }
                            Button button11 = (Button) findViewById(R.id.buttonC1); button11.setEnabled(false);
                            Button button2 = (Button) findViewById(R.id.buttonC2); button2.setEnabled(false);
                            break;
                        case R.id.buttonC4:
                            switch (zeroLad){
                                case 0: c = MediaPlayer.create(getApplicationContext(), R.raw.c4);break;
                                case 1: c = MediaPlayer.create(getApplicationContext(), R.raw.c5);break;
                                case 2: c = MediaPlayer.create(getApplicationContext(), R.raw.c6);break;
                                case 3: c = MediaPlayer.create(getApplicationContext(), R.raw.c7);break;
                            }
                            Button button111 = (Button) findViewById(R.id.buttonC1); button111.setEnabled(false);
                            Button button22 = (Button) findViewById(R.id.buttonC2); button22.setEnabled(false);
                            Button button3 = (Button) findViewById(R.id.buttonC3); button3.setEnabled(false);
                            break;
                        case R.id.buttonC5:
                            switch (zeroLad){
                                case 0: c = MediaPlayer.create(getApplicationContext(), R.raw.c5);break;
                                case 1: c = MediaPlayer.create(getApplicationContext(), R.raw.c6);break;
                                case 2: c = MediaPlayer.create(getApplicationContext(), R.raw.c7);break;
                                case 3: c = MediaPlayer.create(getApplicationContext(), R.raw.c8);break;
                            }
                            Button button1111 = (Button) findViewById(R.id.buttonC1); button1111.setEnabled(false);
                            Button button222 = (Button) findViewById(R.id.buttonC2); button222.setEnabled(false);
                            Button button33 = (Button) findViewById(R.id.buttonC3); button33.setEnabled(false);
                            Button button4 = (Button) findViewById(R.id.buttonC4); button4.setEnabled(false);
                            break;
                    }
                }
                if (event.getAction() == MotionEvent.ACTION_UP){
                    c.release();
                    c = MediaPlayer.create(getApplicationContext(), R.raw.c0);
                    Button button1 = (Button) findViewById(R.id.buttonC1); button1.setEnabled(true);
                    Button button2 = (Button) findViewById(R.id.buttonC2); button2.setEnabled(true);
                    Button button3 = (Button) findViewById(R.id.buttonC3); button3.setEnabled(true);
                    Button button4 = (Button) findViewById(R.id.buttonC4); button4.setEnabled(true);
                }
                return false;
            }
        };

        View.OnTouchListener stringD = new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if (event.getAction() == MotionEvent.ACTION_DOWN) {
                    d.release();
                    switch (v.getId()){
                        case R.id.buttonD1:
                            switch (zeroLad){
                                case 0: d = MediaPlayer.create(getApplicationContext(), R.raw.d1);break;
                                case 1: d = MediaPlayer.create(getApplicationContext(), R.raw.d2);break;
                                case 2: d = MediaPlayer.create(getApplicationContext(), R.raw.d3);break;
                                case 3: d = MediaPlayer.create(getApplicationContext(), R.raw.d4);break;
                            }
                            break;
                        case R.id.buttonD2:
                            switch (zeroLad){
                                case 0: d = MediaPlayer.create(getApplicationContext(), R.raw.d2);break;
                                case 1: d = MediaPlayer.create(getApplicationContext(), R.raw.d3);break;
                                case 2: d = MediaPlayer.create(getApplicationContext(), R.raw.d4);break;
                                case 3: d = MediaPlayer.create(getApplicationContext(), R.raw.d5);break;
                            }
                            Button button1 = (Button) findViewById(R.id.buttonD1); button1.setEnabled(false);
                            break;
                        case R.id.buttonD3:
                            switch (zeroLad){
                                case 0: d = MediaPlayer.create(getApplicationContext(), R.raw.d3);break;
                                case 1: d = MediaPlayer.create(getApplicationContext(), R.raw.d4);break;
                                case 2: d = MediaPlayer.create(getApplicationContext(), R.raw.d5);break;
                                case 3: d = MediaPlayer.create(getApplicationContext(), R.raw.d6);break;
                            }
                            Button button11 = (Button) findViewById(R.id.buttonD1); button11.setEnabled(false);
                            Button button2 = (Button) findViewById(R.id.buttonD2); button2.setEnabled(false);
                            break;
                        case R.id.buttonD4:
                            switch (zeroLad){
                                case 0: d = MediaPlayer.create(getApplicationContext(), R.raw.d4);break;
                                case 1: d = MediaPlayer.create(getApplicationContext(), R.raw.d5);break;
                                case 2: d = MediaPlayer.create(getApplicationContext(), R.raw.d6);break;
                                case 3: d = MediaPlayer.create(getApplicationContext(), R.raw.d7);break;
                            }
                            Button button111 = (Button) findViewById(R.id.buttonD1); button111.setEnabled(false);
                            Button button22 = (Button) findViewById(R.id.buttonD2); button22.setEnabled(false);
                            Button button3 = (Button) findViewById(R.id.buttonD3); button3.setEnabled(false);
                            break;
                        case R.id.buttonD5:
                            switch (zeroLad){
                                case 0: d = MediaPlayer.create(getApplicationContext(), R.raw.d5);break;
                                case 1: d = MediaPlayer.create(getApplicationContext(), R.raw.d6);break;
                                case 2: d = MediaPlayer.create(getApplicationContext(), R.raw.d7);break;
                                case 3: d = MediaPlayer.create(getApplicationContext(), R.raw.d8);break;
                            }
                            Button button1111 = (Button) findViewById(R.id.buttonD1); button1111.setEnabled(false);
                            Button button222 = (Button) findViewById(R.id.buttonD2); button222.setEnabled(false);
                            Button button33 = (Button) findViewById(R.id.buttonD3); button33.setEnabled(false);
                            Button button4 = (Button) findViewById(R.id.buttonD4); button4.setEnabled(false);
                            break;
                    }
                }
                if (event.getAction() == MotionEvent.ACTION_UP){
                    d.release();
                    d = MediaPlayer.create(getApplicationContext(), R.raw.d0);
                    Button button1 = (Button) findViewById(R.id.buttonD1); button1.setEnabled(true);
                    Button button2 = (Button) findViewById(R.id.buttonD2); button2.setEnabled(true);
                    Button button3 = (Button) findViewById(R.id.buttonD3); button3.setEnabled(true);
                    Button button4 = (Button) findViewById(R.id.buttonD4); button4.setEnabled(true);
                }
                return false;
            }
        };

        View.OnTouchListener stringE = new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if (event.getAction() == MotionEvent.ACTION_DOWN) {
                    e.release();
                    switch (v.getId()){
                        case R.id.buttonE1:
                            switch (zeroLad){
                                case 0: e = MediaPlayer.create(getApplicationContext(), R.raw.e1);break;
                                case 1: e = MediaPlayer.create(getApplicationContext(), R.raw.e2);break;
                                case 2: e = MediaPlayer.create(getApplicationContext(), R.raw.e3);break;
                                case 3: e = MediaPlayer.create(getApplicationContext(), R.raw.e4);break;
                            }
                            break;
                        case R.id.buttonE2:
                            switch (zeroLad){
                                case 0: e = MediaPlayer.create(getApplicationContext(), R.raw.e2);break;
                                case 1: e = MediaPlayer.create(getApplicationContext(), R.raw.e3);break;
                                case 2: e = MediaPlayer.create(getApplicationContext(), R.raw.e4);break;
                                case 3: e = MediaPlayer.create(getApplicationContext(), R.raw.e5);break;
                            }
                            Button button1 = (Button) findViewById(R.id.buttonE1); button1.setEnabled(false);
                            break;
                        case R.id.buttonE3:
                            switch (zeroLad){
                                case 0: e = MediaPlayer.create(getApplicationContext(), R.raw.e3);break;
                                case 1: e = MediaPlayer.create(getApplicationContext(), R.raw.e4);break;
                                case 2: e = MediaPlayer.create(getApplicationContext(), R.raw.e5);break;
                                case 3: e = MediaPlayer.create(getApplicationContext(), R.raw.e6);break;
                            }
                            Button button11 = (Button) findViewById(R.id.buttonE1); button11.setEnabled(false);
                            Button button2 = (Button) findViewById(R.id.buttonE2); button2.setEnabled(false);
                            break;
                        case R.id.buttonE4:
                            switch (zeroLad){
                                case 0: e = MediaPlayer.create(getApplicationContext(), R.raw.e4);break;
                                case 1: e = MediaPlayer.create(getApplicationContext(), R.raw.e5);break;
                                case 2: e = MediaPlayer.create(getApplicationContext(), R.raw.e6);break;
                                case 3: e = MediaPlayer.create(getApplicationContext(), R.raw.e7);break;
                            }
                            Button button111 = (Button) findViewById(R.id.buttonE1); button111.setEnabled(false);
                            Button button22 = (Button) findViewById(R.id.buttonE2); button22.setEnabled(false);
                            Button button3 = (Button) findViewById(R.id.buttonE3); button3.setEnabled(false);
                            break;
                        case R.id.buttonE5:
                            switch (zeroLad){
                                case 0: e = MediaPlayer.create(getApplicationContext(), R.raw.e5);break;
                                case 1: e = MediaPlayer.create(getApplicationContext(), R.raw.e6);break;
                                case 2: e = MediaPlayer.create(getApplicationContext(), R.raw.e7);break;
                                case 3: e = MediaPlayer.create(getApplicationContext(), R.raw.e8);break;
                            }
                            Button button1111 = (Button) findViewById(R.id.buttonE1); button1111.setEnabled(false);
                            Button button222 = (Button) findViewById(R.id.buttonE2); button222.setEnabled(false);
                            Button button33 = (Button) findViewById(R.id.buttonE3); button33.setEnabled(false);
                            Button button4 = (Button) findViewById(R.id.buttonE4); button4.setEnabled(false);
                            break;
                    }
                }
                if (event.getAction() == MotionEvent.ACTION_UP){
                    e.release();
                    e = MediaPlayer.create(getApplicationContext(), R.raw.e0);
                    Button button1 = (Button) findViewById(R.id.buttonE1); button1.setEnabled(true);
                    Button button2 = (Button) findViewById(R.id.buttonE2); button2.setEnabled(true);
                    Button button3 = (Button) findViewById(R.id.buttonE3); button3.setEnabled(true);
                    Button button4 = (Button) findViewById(R.id.buttonE4); button4.setEnabled(true);
                }
                return false;
            }
        };

        View.OnTouchListener stringF = new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if (event.getAction() == MotionEvent.ACTION_DOWN) {
                    f.release();
                    switch (v.getId()){
                        case R.id.buttonF1:
                            switch (zeroLad){
                                case 0: f = MediaPlayer.create(getApplicationContext(), R.raw.f1);break;
                                case 1: f = MediaPlayer.create(getApplicationContext(), R.raw.f2);break;
                                case 2: f = MediaPlayer.create(getApplicationContext(), R.raw.f3);break;
                                case 3: f = MediaPlayer.create(getApplicationContext(), R.raw.f4);break;
                            }
                            break;
                        case R.id.buttonF2:
                            switch (zeroLad){
                                case 0: f = MediaPlayer.create(getApplicationContext(), R.raw.f2);break;
                                case 1: f = MediaPlayer.create(getApplicationContext(), R.raw.f3);break;
                                case 2: f = MediaPlayer.create(getApplicationContext(), R.raw.f4);break;
                                case 3: f = MediaPlayer.create(getApplicationContext(), R.raw.f5);break;
                            }
                            Button button1 = (Button) findViewById(R.id.buttonF1); button1.setEnabled(false);
                            break;
                        case R.id.buttonF3:
                            switch (zeroLad){
                                case 0: f = MediaPlayer.create(getApplicationContext(), R.raw.f3);break;
                                case 1: f = MediaPlayer.create(getApplicationContext(), R.raw.f4);break;
                                case 2: f = MediaPlayer.create(getApplicationContext(), R.raw.f5);break;
                                case 3: f = MediaPlayer.create(getApplicationContext(), R.raw.f6);break;
                            }
                            Button button11 = (Button) findViewById(R.id.buttonF1); button11.setEnabled(false);
                            Button button2 = (Button) findViewById(R.id.buttonF2); button2.setEnabled(false);
                            break;
                        case R.id.buttonF4:
                            switch (zeroLad){
                                case 0: f = MediaPlayer.create(getApplicationContext(), R.raw.f4);break;
                                case 1: f = MediaPlayer.create(getApplicationContext(), R.raw.f5);break;
                                case 2: f = MediaPlayer.create(getApplicationContext(), R.raw.f6);break;
                                case 3: f = MediaPlayer.create(getApplicationContext(), R.raw.f7);break;
                            }
                            Button button111 = (Button) findViewById(R.id.buttonF1); button111.setEnabled(false);
                            Button button22 = (Button) findViewById(R.id.buttonF2); button22.setEnabled(false);
                            Button button3 = (Button) findViewById(R.id.buttonF3); button3.setEnabled(false);
                            break;
                        case R.id.buttonF5:
                            switch (zeroLad){
                                case 0: f = MediaPlayer.create(getApplicationContext(), R.raw.f5);break;
                                case 1: f = MediaPlayer.create(getApplicationContext(), R.raw.f6);break;
                                case 2: f = MediaPlayer.create(getApplicationContext(), R.raw.f7);break;
                                case 3: f = MediaPlayer.create(getApplicationContext(), R.raw.f8);break;
                            }
                            Button button1111 = (Button) findViewById(R.id.buttonF1); button1111.setEnabled(false);
                            Button button222 = (Button) findViewById(R.id.buttonF2); button222.setEnabled(false);
                            Button button33 = (Button) findViewById(R.id.buttonF3); button33.setEnabled(false);
                            Button button4 = (Button) findViewById(R.id.buttonF4); button4.setEnabled(false);
                            break;
                    }
                }
                if (event.getAction() == MotionEvent.ACTION_UP){
                    f.release();
                    f = MediaPlayer.create(getApplicationContext(), R.raw.f0);
                    Button button1 = (Button) findViewById(R.id.buttonF1); button1.setEnabled(true);
                    Button button2 = (Button) findViewById(R.id.buttonF2); button2.setEnabled(true);
                    Button button3 = (Button) findViewById(R.id.buttonF3); button3.setEnabled(true);
                    Button button4 = (Button) findViewById(R.id.buttonF4); button4.setEnabled(true);
                }
                return false;
            }
        };

        View.OnClickListener forwardBackClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (v.getId()) {
                    case R.id.imageButtonPlus:
                        if(zeroLad<3){
                            zeroLad++;
                        }
                        else {
                            Toast.makeText(getApplicationContext(), "Остальные лады в разработке...", Toast.LENGTH_LONG).show();break;
                        }
                        break;
                    case R.id.imageButtonMinus:
                        if(zeroLad>0){
                            zeroLad--;
                        }
                        else{
                            Toast.makeText(getApplicationContext(), "А меньше некуда...", Toast.LENGTH_LONG).show();break;
                        }
                        break;
                }
                one.setText(String.valueOf(1+zeroLad));
                two.setText(String.valueOf(2+zeroLad));
                three.setText(String.valueOf(3+zeroLad));
                four.setText(String.valueOf(4+zeroLad));
                five.setText(String.valueOf(5+zeroLad));
                if(zeroLad==0){
                    krug1.setAlpha(0);
                    krug2.setAlpha(0);
                    krug3.setAlpha(255);
                    krug4.setAlpha(0);
                    krug5.setAlpha(255);
                }
                if(zeroLad==1||zeroLad==3){
                    krug1.setAlpha(0);
                    krug2.setAlpha(255);
                    krug3.setAlpha(0);
                    krug4.setAlpha(255);
                    krug5.setAlpha(0);
                }
                if(zeroLad==2){
                    krug1.setAlpha(255);
                    krug2.setAlpha(0);
                    krug3.setAlpha(255);
                    krug4.setAlpha(0);
                    krug5.setAlpha(255);
                }
            }
        };
        Button buttonA1 = (Button) findViewById(R.id.buttonA1);buttonA1.setOnTouchListener(stringA);
        Button buttonA2 = (Button) findViewById(R.id.buttonA2);buttonA2.setOnTouchListener(stringA);
        Button buttonA3 = (Button) findViewById(R.id.buttonA3);buttonA3.setOnTouchListener(stringA);
        Button buttonA4 = (Button) findViewById(R.id.buttonA4);buttonA4.setOnTouchListener(stringA);
        Button buttonA5 = (Button) findViewById(R.id.buttonA5);buttonA5.setOnTouchListener(stringA);
        Button buttonB1 = (Button) findViewById(R.id.buttonB1);buttonB1.setOnTouchListener(stringB);
        Button buttonB2 = (Button) findViewById(R.id.buttonB2);buttonB2.setOnTouchListener(stringB);
        Button buttonB3 = (Button) findViewById(R.id.buttonB3);buttonB3.setOnTouchListener(stringB);
        Button buttonB4 = (Button) findViewById(R.id.buttonB4);buttonB4.setOnTouchListener(stringB);
        Button buttonB5 = (Button) findViewById(R.id.buttonB5);buttonB5.setOnTouchListener(stringB);
        Button buttonC1 = (Button) findViewById(R.id.buttonC1);buttonC1.setOnTouchListener(stringC);
        Button buttonC2 = (Button) findViewById(R.id.buttonC2);buttonC2.setOnTouchListener(stringC);
        Button buttonC3 = (Button) findViewById(R.id.buttonC3);buttonC3.setOnTouchListener(stringC);
        Button buttonC4 = (Button) findViewById(R.id.buttonC4);buttonC4.setOnTouchListener(stringC);
        Button buttonC5 = (Button) findViewById(R.id.buttonC5);buttonC5.setOnTouchListener(stringC);
        Button buttonD1 = (Button) findViewById(R.id.buttonD1);buttonD1.setOnTouchListener(stringD);
        Button buttonD2 = (Button) findViewById(R.id.buttonD2);buttonD2.setOnTouchListener(stringD);
        Button buttonD3 = (Button) findViewById(R.id.buttonD3);buttonD3.setOnTouchListener(stringD);
        Button buttonD4 = (Button) findViewById(R.id.buttonD4);buttonD4.setOnTouchListener(stringD);
        Button buttonD5 = (Button) findViewById(R.id.buttonD5);buttonD5.setOnTouchListener(stringD);
        Button buttonE1 = (Button) findViewById(R.id.buttonE1);buttonE1.setOnTouchListener(stringE);
        Button buttonE2 = (Button) findViewById(R.id.buttonE2);buttonE2.setOnTouchListener(stringE);
        Button buttonE3 = (Button) findViewById(R.id.buttonE3);buttonE3.setOnTouchListener(stringE);
        Button buttonE4 = (Button) findViewById(R.id.buttonE4);buttonE4.setOnTouchListener(stringE);
        Button buttonE5 = (Button) findViewById(R.id.buttonE5);buttonE5.setOnTouchListener(stringE);
        Button buttonF1 = (Button) findViewById(R.id.buttonF1);buttonF1.setOnTouchListener(stringF);
        Button buttonF2 = (Button) findViewById(R.id.buttonF2);buttonF2.setOnTouchListener(stringF);
        Button buttonF3 = (Button) findViewById(R.id.buttonF3);buttonF3.setOnTouchListener(stringF);
        Button buttonF4 = (Button) findViewById(R.id.buttonF4);buttonF4.setOnTouchListener(stringF);
        Button buttonF5 = (Button) findViewById(R.id.buttonF5);buttonF5.setOnTouchListener(stringF);

        ImageButton plusLads = (ImageButton) findViewById(R.id.imageButtonPlus);
        plusLads.setOnClickListener(forwardBackClickListener);
        ImageButton minusLads = (ImageButton) findViewById(R.id.imageButtonMinus);
        minusLads.setOnClickListener(forwardBackClickListener);

        Button menu = (Button)findViewById(R.id.button5); menu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SwipeMod.this, Menu.class);
                startActivity(intent);
                SwipeMod.this.finish();
            }
        });

        Button switchMod = (Button)findViewById(R.id.button7); switchMod.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SwipeMod.this, TapMod.class);
                startActivity(intent);
                SwipeMod.this.finish();
            }
        });

    }

    @Override
    protected void onPause() {
        super.onPause();

        a.release();
        b.release();
        c.release();
        d.release();
        e.release();
        f.release();
    }
}