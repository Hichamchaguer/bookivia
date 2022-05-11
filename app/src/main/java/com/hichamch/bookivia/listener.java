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
import android.widget.Toast;

import java.util.ArrayList;

public class listener extends AppCompatActivity {
Button btn_play2_listener,btn_play_listener;
MediaPlayer player;
SeekBar seekBar;
Handler handler = new Handler();
TextView txtStart_listener,txt_end_listener;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listener);
        btn_play2_listener = findViewById(R.id.btn_play2_listener);
        btn_play_listener = findViewById(R.id.btn_play_listener);
        seekBar = findViewById(R.id.seekBar);
        player = MediaPlayer.create(this,R.raw.loseyouself);
        seekBar.setMax(player.getDuration());
        txtStart_listener = findViewById(R.id.txtStart_listener);
        txt_end_listener = findViewById(R.id.txt_end_listener);


        String endTime = createTime(player.getDuration());
        txt_end_listener.setText(endTime);

        final Handler handler = new Handler();
        final int delay = 1000;

        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                String currentTime = createTime(player.getCurrentPosition());
                txtStart_listener.setText(currentTime);
                handler.postDelayed(this, delay);
            }
        },delay);
    }

    public class updateSeekbar implements Runnable{

        @Override
        public void run(){
            seekBar.setProgress(player.getCurrentPosition());
            handler.postDelayed(this,1000);
        }
    }
    public void play (View v){

            player.start();
            btn_play2_listener.setBackgroundResource(R.drawable.ic_pause);
            btn_play_listener.setBackgroundResource(R.drawable.pauseicon2);
            updateSeekbar updateSeekbar = new updateSeekbar();
            handler.post(updateSeekbar);

    }
    public void pause(View v)
    {
        player.pause();
        btn_play2_listener.setBackgroundResource(R.drawable.ic_play);
        btn_play_listener.setBackgroundResource(R.drawable.playicon);
    }

    public String createTime(int duration)
    {
        String time = "";
        int min = duration/1000/60;
        int sec = duration/1000%60;

        time+=min+":";

        if (sec<10)
        {
            time+="0";
        }
        time+=sec;
        return time;
    }

}