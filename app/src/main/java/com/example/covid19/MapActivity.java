package com.example.covid19;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.content.Intent;
import android.widget.Button;

public class MapActivity extends AppCompatActivity implements View.OnClickListener {

    ImageView imgOne,imgTwo,imgThree,imgFour;
    Button back;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_map);
        imgOne=(ImageView)findViewById(R.id.imgOne);
        imgTwo=(ImageView)findViewById(R.id.imgTwo);
        imgThree=(ImageView)findViewById(R.id.imgThree);
        imgFour=(ImageView)findViewById(R.id.imgFour);
        imgOne.setOnClickListener(this);
        imgTwo.setOnClickListener(this);
        imgThree.setOnClickListener(this);
        imgFour.setOnClickListener(this);

        back = (Button) findViewById(R.id.button);
        back.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        int id=v.getId();
        switch (id)
        {
            case R.id.imgOne:
                imgOne.setVisibility(View.GONE);
                imgTwo.setVisibility(View.VISIBLE);
                imgThree.setVisibility(View.GONE);
                imgFour.setVisibility(View.GONE);
                break;
            case R.id.imgTwo:
                imgOne.setVisibility(View.GONE);
                imgTwo.setVisibility(View.GONE);
                imgThree.setVisibility(View.VISIBLE);
                imgFour.setVisibility(View.GONE);
                break;
            case R.id.imgThree:
                imgOne.setVisibility(View.GONE);
                imgTwo.setVisibility(View.GONE);
                imgThree.setVisibility(View.GONE);
                imgFour.setVisibility(View.VISIBLE);
                break;

            case R.id.imgFour:
                imgOne.setVisibility(View.VISIBLE);
                imgTwo.setVisibility(View.GONE);
                imgThree.setVisibility(View.GONE);
                imgFour.setVisibility(View.GONE);
                break;





            case R.id.button:
                Intent selectIntent = new Intent(MapActivity.this, SecondActivity.class);
                startActivity(selectIntent);
                break;

        }


    }
}