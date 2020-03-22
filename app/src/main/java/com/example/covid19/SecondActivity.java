package com.example.covid19;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
public class SecondActivity extends AppCompatActivity {
    Button map;
    Button statistics;
    TextView nameTextView, studentIDTextView, userIDTextView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);



    }

    public void map(View v) {
        Intent mapIntent = new Intent(SecondActivity.this, MapActivity.class);
        startActivity(mapIntent);

    }
    public void stat(View v) {
        Intent statIntent = new Intent(SecondActivity.this, StatActivity.class);
        startActivity(statIntent);

    }
    public void about(View v) {
        Intent aboutIntent = new Intent(SecondActivity.this, AboutActivity.class);
        startActivity(aboutIntent);

    }
}