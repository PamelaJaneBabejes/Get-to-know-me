package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class secondscreen extends AppCompatActivity {
    ImageButton NextButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secondscreen);

        NextButton = (ImageButton) findViewById(R.id.acts);

        NextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentLoadthird = new Intent (secondscreen.this, thirdscreen.class);
                startActivity(intentLoadthird);
            }

        });
    }
}
