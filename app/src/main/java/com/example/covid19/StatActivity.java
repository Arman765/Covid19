package com.example.covid19;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;

public class StatActivity extends AppCompatActivity implements View.OnClickListener {


    Button back;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stat);
        back = (Button) findViewById(R.id.button);
        back.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent selectIntent = new Intent(StatActivity.this, SecondActivity.class);
        startActivity(selectIntent);

    }
}
