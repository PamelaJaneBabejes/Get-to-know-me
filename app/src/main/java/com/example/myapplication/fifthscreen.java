package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class fifthscreen extends AppCompatActivity {
    private Button EndButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fifthscreen);

        EndButton = (Button) findViewById(R.id.end_button);
        EndButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openDialog();
            }
        });
    }
    public void openDialog() {
        thankyou_Dialog exampleDialog = new thankyou_Dialog();
        exampleDialog.show(getSupportFragmentManager(), "Thank You");
    }
}