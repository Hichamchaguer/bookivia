package com.hichamch.bookivia;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class profiles extends AppCompatActivity {
    public Button btn_home_profiles,btn_cat_profiles,btn_audio_profiles,btn_ebook_profiles,btn_profile_profiles,btn_mystorie_profiles;
    private TextView textName_profile;
    public static final String PROFILE = "PROFILE";
    private String profile;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profiles);

        btn_home_profiles=(Button) findViewById(R.id.btn_home_profiles);
        btn_cat_profiles=(Button) findViewById(R.id.btn_cat_profiles);
        btn_audio_profiles=(Button) findViewById(R.id.btn_audio_profiles);
        btn_ebook_profiles=(Button) findViewById(R.id.btn_ebook_profiles);
        btn_profile_profiles=(Button) findViewById(R.id.btn_profile_profiles);
        btn_mystorie_profiles=(Button) findViewById(R.id.btn_mystorie_profiles);
        textName_profile = findViewById(R.id.textName_profile);

       /*Intent i = getIntent();
        profile = i.getStringExtra(PROFILE);
        textName_profile.setText(profile);*/

        btn_home_profiles.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(profiles.this,MainActivity.class);
                startActivity(intent);
            }
        });

        btn_cat_profiles.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(profiles.this,categorires.class);
                startActivity(intent);
            }
        });

        btn_ebook_profiles.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(profiles.this,ebooks.class);
                startActivity(intent);
            }
        });

        btn_audio_profiles.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(profiles.this,audiobook.class);
                startActivity(intent);
            }
        });

        btn_mystorie_profiles.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(profiles.this,mystories.class);
                startActivity(intent);
            }
        });


    }
}