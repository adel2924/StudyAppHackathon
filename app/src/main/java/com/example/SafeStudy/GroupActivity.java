package com.example.SafeStudy;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class GroupActivity extends AppCompatActivity {

    private Button Join;
    private Button Leave;

    private ImageView Profilepic;
    private TextView Name;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_group);

        Join = (Button) findViewById(R.id.button14);
        Leave = (Button) findViewById(R.id.button15);
        Profilepic = (ImageView) findViewById(R.id.imageView6);
        Name = (TextView) findViewById(R.id.textView10);

        Join.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Join.setVisibility(View.INVISIBLE);
                Leave.setVisibility(View.VISIBLE);
                Profilepic.setVisibility(View.VISIBLE);
                Name.setVisibility(View.VISIBLE);
            }
        });

        Leave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder alertBuilder = new AlertDialog.Builder(GroupActivity.this);
                alertBuilder.setMessage("Do you want to leave this group?");
                alertBuilder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Leave.setVisibility(View.INVISIBLE);
                        Profilepic.setVisibility(View.INVISIBLE);
                        Name.setVisibility(View.INVISIBLE);
                        Join.setVisibility(View.VISIBLE);
                    }
                });
                alertBuilder.setNegativeButton("No", null);
                alertBuilder.show();

            }
        });
    }
}