package com.netology.android122;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.widget.TextViewCompat;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ImageView droid = (ImageView) findViewById(R.id.droid);
        Button forward = (Button) findViewById(R.id.buttonForward);
        Button backward = (Button) findViewById(R.id.buttonBackward);
        final TextView linkOnPhoto = (TextView) findViewById(R.id.linkOnPhoto);
        int rndNumber = (int) (Math.round(Math.random() * 100) + 1);


        linkOnPhoto.setText(getString(R.string.linkOnPhoto, rndNumber));

        forward.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("ResourceType")
            @Override
            public void onClick(View v) {
                Intent nextScreen = new Intent(MainActivity.this, MainActivity.class);
                startActivity(nextScreen);
            }
        });

        backward.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

    }
}
