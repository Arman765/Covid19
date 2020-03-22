package com.example.covid19;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AboutActivity extends AppCompatActivity implements View.OnClickListener {
    Button back;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);


        back = (Button) findViewById(R.id.button);
        back.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        Intent selectIntent = new Intent(AboutActivity.this, SecondActivity.class);
        startActivity(selectIntent);

    }
}
