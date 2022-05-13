package com.hichamch.bookivia;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class audiobook extends AppCompatActivity {
    public Button btn_home_profiles,btn_cat_profiles,btn_audio_profiles,btn_ebook_profiles,btn_profile_profiles,
            btn_mystorie_profiles,btn_richdad_audio,btn_money_audio;
 MediaPlayer player;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_audiobook);

        btn_home_profiles=(Button) findViewById(R.id.btn_home_profiles);
        btn_cat_profiles=(Button) findViewById(R.id.btn_cat_profiles);
        btn_audio_profiles=(Button) findViewById(R.id.btn_audio_profiles);
        btn_ebook_profiles=(Button) findViewById(R.id.btn_ebook_profiles);
        btn_profile_profiles=(Button) findViewById(R.id.btn_profile_profiles);
        btn_mystorie_profiles=(Button) findViewById(R.id.btn_mystorie_profiles);
        btn_richdad_audio = findViewById(R.id.btn_richdad_audio);
        btn_money_audio = findViewById(R.id.btn_money_audio);

        btn_home_profiles.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(audiobook.this,MainActivity.class);
                startActivity(intent);
            }
        });

        btn_cat_profiles.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(audiobook.this,categorires.class);
                startActivity(intent);
            }
        });

        btn_ebook_profiles.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(audiobook.this,ebooks.class);
                startActivity(intent);
            }
        });

        btn_mystorie_profiles.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(audiobook.this,mystories.class);
                startActivity(intent);
            }
        });
        btn_profile_profiles.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(audiobook.this,profiles.class);
                startActivity(intent);
            }
        });

        btn_richdad_audio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(audiobook.this,listener.class);
                startActivity(intent);

            }
        });
        btn_richdad_audio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(audiobook.this,listener.class);
                intent.putExtra("my_image",R.drawable.richdad);
                startActivity(intent);

            }
        });
        btn_money_audio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(audiobook.this,listener.class);
                intent.putExtra("my_image",R.drawable.pom);
                startActivity(intent);

            }
        });

    }
}