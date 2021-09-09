package com.example.SafeStudy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.SafeStudy.R;

public class MainActivity extends AppCompatActivity {

    private EditText Name;
    private EditText Password;
    private Button Login;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Name = (EditText) findViewById(R.id.etName);
        Password = (EditText) findViewById(R.id.etPassword);
        Login = (Button) findViewById(R.id.btnLogin);

        Login.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                if (Name.getText().toString().equals("Admin") && Password.getText().toString().equals("1234")) {
                    Intent act2Intent = new Intent(MainActivity.this, SecondActivity.class);
                    startActivity(act2Intent);
                } else {
                    Password.setError("Invalid credentials.");
                }
            }
        });

/*    private void checkCredentials(){
        if(Name.getText().toString().equals("Admin") && Password.getText().toString().equals("1234")){
            Intent act2Intent = new Intent(MainActivity.this, SecondActivity.class);
            startActivity(act2Intent);
        }else{
            Password.setError("Invalid credentials.");
        }
    }*/
    }
}