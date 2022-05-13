package com.hichamch.bookivia;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class categorires extends AppCompatActivity {
    public Button btn_finance_cat, btn_home_profiles,btn_cat_profiles,btn_audio_profiles,btn_ebook_profiles,
            btn_profile_profiles,btn_mystorie_profiles;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_categorires);

        btn_home_profiles=(Button) findViewById(R.id.btn_home_profiles);
        btn_cat_profiles=(Button) findViewById(R.id.btn_cat_profiles);
        btn_audio_profiles=(Button) findViewById(R.id.btn_audio_profiles);
        btn_ebook_profiles=(Button) findViewById(R.id.btn_ebook_profiles);
        btn_profile_profiles=(Button) findViewById(R.id.btn_profile_profiles);
        btn_mystorie_profiles=(Button) findViewById(R.id.btn_mystorie_profiles);

        btn_finance_cat=(Button) findViewById(R.id.btn_finance_cat);

        btn_finance_cat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(categorires.this,hyperlink.class);
                startActivity(intent);
            }
        });

        btn_home_profiles.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(categorires.this,MainActivity.class);
                startActivity(intent);
            }
        });
        btn_audio_profiles.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(categorires.this,audiobook.class);
                startActivity(intent);
            }
        });
        btn_ebook_profiles.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(categorires.this,ebooks.class);
                startActivity(intent);
            }
        });
        btn_mystorie_profiles.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(categorires.this,mystories.class);
                startActivity(intent);
            }
        });
        btn_profile_profiles.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(categorires.this,profiles.class);
                startActivity(intent);
            }
        });
    }
}