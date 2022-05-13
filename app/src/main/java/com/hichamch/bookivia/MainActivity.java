package com.hichamch.bookivia;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Environment;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;

import java.io.File;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
 public Button btn_home_profiles,btn_cat_profiles,btn_audio_profiles,btn_ebook_profiles,btn_profile_profiles,btn_mystorie_profiles,
         btn_richdad_home,btn_dune_home,btn_fourh_home;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_home_profiles=(Button) findViewById(R.id.btn_home_profiles);
        btn_cat_profiles=(Button) findViewById(R.id.btn_cat_profiles);
        btn_audio_profiles=(Button) findViewById(R.id.btn_audio_profiles);
        btn_ebook_profiles=(Button) findViewById(R.id.btn_ebook_profiles);
        btn_profile_profiles=(Button) findViewById(R.id.btn_profile_profiles);
        btn_mystorie_profiles=(Button) findViewById(R.id.btn_mystorie_profiles);
        btn_richdad_home = findViewById(R.id.btn_richdad_home);
        btn_dune_home = findViewById(R.id.btn_dune_home);
        btn_fourh_home = findViewById(R.id.btn_fourh_home);



       btn_cat_profiles.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               Intent intent = new Intent(MainActivity.this,categorires.class);
               startActivity(intent);
           }
       });
        btn_audio_profiles.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,audiobook.class);
                startActivity(intent);
            }
        });
        btn_ebook_profiles.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,ebooks.class);
                startActivity(intent);
            }
        });
        btn_mystorie_profiles.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,mystories.class);
                startActivity(intent);
            }
        });
        btn_profile_profiles.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,profiles.class);
                startActivity(intent);
            }
        });

        btn_richdad_home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,hyperlink.class);
                startActivity(intent);
            }
        });

        btn_dune_home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,hyperlink.class);
                startActivity(intent);
            }
        });
        btn_fourh_home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,hyperlink.class);
                startActivity(intent);
            }
        });
    }


}

