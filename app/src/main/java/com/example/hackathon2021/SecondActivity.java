package com.example.hackathon2021;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SecondActivity extends AppCompatActivity {

    private Button Profile;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Profile = (Button) findViewById(R.id.btnProfile);

        Profile.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent act3Intent = new Intent(SecondActivity.this, ProfileActivity.class);
                startActivity(act3Intent);
            }
        });
    }
}