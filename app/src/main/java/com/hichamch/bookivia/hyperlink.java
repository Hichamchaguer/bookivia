package com.hichamch.bookivia;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;

public class hyperlink extends AppCompatActivity {
    TextView Linkhper1,Linkhper2,Linkhper3 ,Linkhper4,Linkhper5,Linkhper6,Linkhper7,Linkhper8,Linkhper9,Linkhper10;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hyperlink);

        Linkhper1=findViewById(R.id.textView20);
        Linkhper1.setMovementMethod(LinkMovementMethod.getInstance());

        Linkhper2=findViewById(R.id.textView21);
        Linkhper2.setMovementMethod(LinkMovementMethod.getInstance());

        Linkhper3=findViewById(R.id.textView22);
        Linkhper3.setMovementMethod(LinkMovementMethod.getInstance());

        Linkhper4=findViewById(R.id.textView23);
        Linkhper4.setMovementMethod(LinkMovementMethod.getInstance());

        Linkhper5=findViewById(R.id.textView24);
        Linkhper5.setMovementMethod(LinkMovementMethod.getInstance());

        Linkhper6=findViewById(R.id.textView25);
        Linkhper6.setMovementMethod(LinkMovementMethod.getInstance());

        Linkhper7=findViewById(R.id.textView26);
        Linkhper7.setMovementMethod(LinkMovementMethod.getInstance());

        Linkhper8=findViewById(R.id.textView27);
        Linkhper8.setMovementMethod(LinkMovementMethod.getInstance());

        Linkhper9=findViewById(R.id.textView28);
        Linkhper9.setMovementMethod(LinkMovementMethod.getInstance());

        Linkhper10=findViewById(R.id.textView29);
        Linkhper10.setMovementMethod(LinkMovementMethod.getInstance());
    }
}