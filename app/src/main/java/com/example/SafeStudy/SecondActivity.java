package com.example.SafeStudy;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.SafeStudy.R;

public class SecondActivity extends AppCompatActivity {

    private CardView Profile;
    private CardView Search;
    private CardView CheckIn;
    private CardView Create;
    private CardView Chat;
    private CardView Map;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Profile = (CardView) findViewById(R.id.card_profile);
        Search = (CardView) findViewById(R.id.card_search);
        CheckIn = (CardView) findViewById(R.id.card_check);
        Create = (CardView) findViewById(R.id.card_create);
        Chat = (CardView) findViewById(R.id.card_chat);
        Map = (CardView) findViewById(R.id.card_map);

        Profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent profileIntent = new Intent(SecondActivity.this, ProfileActivity.class);
                startActivity(profileIntent);
            }
        });

        Search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent searchIntent = new Intent(SecondActivity.this, SearchActivity.class);
                startActivity(searchIntent);
            }
        });

        Create.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent createIntent = new Intent(SecondActivity.this, CreateActivity.class);
                startActivity(createIntent);
            }
        });

        Chat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent chatIntent = new Intent(SecondActivity.this, ChatActivity.class);
                startActivity(chatIntent);
            }
        });

        Map.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent mapIntent = new Intent(SecondActivity.this, MapActivity.class);
                startActivity(mapIntent);
            }
        });
    }
}