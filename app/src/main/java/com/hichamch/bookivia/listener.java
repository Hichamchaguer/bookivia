package com.hichamch.bookivia;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.TextView;

import java.util.ArrayList;

public class listener extends AppCompatActivity {
Button btn_play2_listener,btn_play_listener;
 MediaPlayer player ;
  SeekBar seekbar;
  Handler handler = new Handler();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listener);
        btn_play2_listener = findViewById(R.id.btn_play2_listener);
        btn_play_listener = findViewById(R.id.btn_play_listener);
        seekbar = findViewById(R.id.seekBar);


    }



    public void play(View v){
        if(player == null)
        {
            btn_play_listener.setBackgroundResource(R.drawable.pauseicon2);
            btn_play2_listener.setBackgroundResource(R.drawable.ic_pause);
            player = MediaPlayer.create(this,R.raw.loseyouself);
            player.start();
        }

        else
        {
            btn_play_listener.setBackgroundResource(R.drawable.playicon);
            btn_play2_listener.setBackgroundResource(R.drawable.ic_play);
            player.pause();
        }

    }


}