package com.example.guitar;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

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