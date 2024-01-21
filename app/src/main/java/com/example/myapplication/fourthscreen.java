package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class fourthscreen extends AppCompatActivity {

    ImageButton Next3Button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourthscreen);

        Next3Button = (ImageButton) findViewById(R.id.fourth_act);
        Next3Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentLoadfifth = new Intent(fourthscreen.this, fifthscreen.class);
                startActivity(intentLoadfifth);
            }
        });

    }
}