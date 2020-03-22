package com.example.covid19;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements
        View.OnClickListener{
    Button enterNewActivityButton;
    EditText sendUserIDText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        enterNewActivityButton = (Button) findViewById(R.id.loginButton);
        enterNewActivityButton.setOnClickListener(this);
        sendUserIDText = (EditText) findViewById(R.id.userIdText);
    }
    @Override
    public void onClick(View v) {

        String userIDStr = sendUserIDText.getText().toString();
        Intent loginIntent = new Intent(MainActivity.this, SecondActivity.class);
        loginIntent.putExtra("creator","Mohammad Arman");
        loginIntent.putExtra("studentId","18.01.04.151");
        loginIntent.putExtra("user",userIDStr);
        startActivity(loginIntent);

    }
}