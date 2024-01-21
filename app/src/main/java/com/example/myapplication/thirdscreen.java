package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class thirdscreen extends AppCompatActivity {
    ImageButton Next2Button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thirdscreen);

        Next2Button = (ImageButton) findViewById(R.id.third_act);
        Next2Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentLoadfourth = new Intent(thirdscreen.this, fourthscreen.class);
                startActivity(intentLoadfourth);
            }
        });

    }
}