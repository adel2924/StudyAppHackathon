package com.example.hackathon2021;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.PopupMenu;

public class ProfileActivity extends AppCompatActivity {

    private Button Friends;
    private Button Groups;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        Friends = (Button) findViewById(R.id.btnFriends);
        Groups = (Button) findViewById(R.id.btnGroups);

        Friends.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                PopupMenu popup = new PopupMenu(ProfileActivity.this, Friends);
                popup.inflate(R.menu.popup_friends);
                popup.show();
            }
        });

        Groups.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                PopupMenu popup = new PopupMenu(ProfileActivity.this, Groups);
                popup.inflate(R.menu.popup_groups);
                popup.show();
            }
        });
    }

/*    public void showPopup(View v){
        PopupMenu popup = new PopupMenu(this, v);
        popup.inflate(R.menu.popup_friends);
        popup.show();
    }*/

}