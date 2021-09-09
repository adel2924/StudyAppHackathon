package com.example.SafeStudy;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.SafeStudy.R;

public class CheckInActivity extends AppCompatActivity implements View.OnClickListener{

    private Button CheckIn1;
    private Button CheckIn2;
    private Button CheckIn3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check_in);

        CheckIn1 = (Button) findViewById(R.id.button3);
        CheckIn2 = (Button) findViewById(R.id.button4);
        CheckIn3 = (Button) findViewById(R.id.button5);

        CheckIn1.setOnClickListener(this);
        CheckIn2.setOnClickListener(this);
        CheckIn3.setOnClickListener(this);
    }

    public void onClick(View v) {
        AlertDialog.Builder alertBuilder = new AlertDialog.Builder(CheckInActivity.this);
        alertBuilder.setMessage("Do you want to check in?");
        alertBuilder.setNegativeButton("No", null);
        switch (v.getId()) {
            case R.id.button3:
                alertBuilder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        CheckIn1.setEnabled(false);
                        CheckIn1.setText("Checked in");
                    }
                });
                break;
            case R.id.button4:
                alertBuilder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        CheckIn2.setEnabled(false);
                        CheckIn2.setText("Checked in");
                    }
                });
                break;
            case R.id.button5:
                alertBuilder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        CheckIn3.setEnabled(false);
                        CheckIn3.setText("Checked in");
                    }
                });
                break;
        }
        alertBuilder.show();
    }
}

