package com.hichamch.bookivia;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class login extends AppCompatActivity {
    private  EditText txt_email_login;
    private String profile;
    EditText txt_password_login;
    Button btn_signup_login;
    Button btn_login_login;
    FirebaseAuth mAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        txt_email_login = findViewById(R.id.txt_email_login);
        txt_password_login = findViewById(R.id.txt_password_login);
        btn_signup_login = findViewById(R.id.btn_signup_login);
        btn_login_login = findViewById(R.id.btn_login_login);


        mAuth = FirebaseAuth.getInstance();

        btn_login_login.setOnClickListener(view -> {
            loginuser();
          /*profile = txt_email_login.getText().toString().trim();
            Intent i = new Intent(login.this,profiles.class);
            i.putExtra(profiles.PROFILE,profile);
            startActivity(i);*/
        });

        btn_signup_login.setOnClickListener(view -> {
            startActivity(new Intent(login.this, sign_up.class));
        });
    }


    private void loginuser(){
        String email = txt_email_login.getText().toString();
        String password = txt_password_login.getText().toString();


        if (TextUtils.isEmpty(email)){
            txt_email_login.setError("This Field Cannot Be Empty");
            txt_email_login.requestFocus();
        }else if (TextUtils.isEmpty(password)) {
            txt_password_login.setError("This Field Cannot Be Empty");
            txt_password_login.requestFocus();
        }else{
            mAuth.signInWithEmailAndPassword(email, password).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                @Override
                public void onComplete(@NonNull Task<AuthResult> task) {
                    if(task.isSuccessful()){
                        Toast.makeText(login.this,"Welcome "+email,Toast.LENGTH_SHORT).show();
                        startActivity(new Intent(login.this, MainActivity.class));
                    }else{
                        Toast.makeText(login.this,"Email or Password Is Incorrect",Toast.LENGTH_SHORT).show();
                    }
                }
            });
        }
    }
}