package com.example.SafeStudy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.SafeStudy.R;

public class SearchActivity extends AppCompatActivity {

    private Button Chemistry;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);

        Chemistry = (Button) findViewById(R.id.button);

        Chemistry.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent chemistryIntent = new Intent(SearchActivity.this, GroupActivity.class);
                startActivity(chemistryIntent);
            }
        });
    }

}