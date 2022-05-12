package com.hichamch.bookivia;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.auth.api.signin.GoogleSignIn;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInClient;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class sign_up extends AppCompatActivity {
    EditText txt_email_signup;
    EditText txt_password_signup;
    EditText txt_confirme_signup;
    Button  btn_signup_signup;
    Button btn_login_signup;
    Button btn_google_signup;

    FirebaseAuth mAuth;
    GoogleSignInOptions gso;
    GoogleSignInClient gsc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        txt_email_signup = findViewById(R.id.txt_email_signup);
        txt_password_signup = findViewById(R.id.txt_password_signup);
        txt_confirme_signup = findViewById(R.id.txt_confirme_signup);
        btn_login_signup = findViewById(R.id.btn_login_signup);
        btn_signup_signup = findViewById(R.id.btn_signup_signup);
        btn_google_signup = findViewById(R.id.btn_google_signup);

        mAuth = FirebaseAuth.getInstance();

        btn_signup_signup.setOnClickListener(view -> {
            createuser();
        });

        btn_login_signup.setOnClickListener(view -> {
            startActivity(new Intent(sign_up.this, login.class));
        });

        gso = new GoogleSignInOptions.Builder(GoogleSignInOptions.DEFAULT_SIGN_IN)
                .requestEmail()
                .build();
        gsc = GoogleSignIn.getClient(this,gso);
        btn_google_signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                signin();
            }
        });


    }
    private void signin(){
        Intent intent=gsc.getSignInIntent();
        startActivityForResult(intent, 100);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == 100){
            Task<GoogleSignInAccount> task=GoogleSignIn.getSignedInAccountFromIntent(data);
            try {
                task.getResult(ApiException.class);
                MainActivity();
            } catch (ApiException e){
                Toast.makeText(this ,"Error",Toast.LENGTH_SHORT).show();
            }
        }
    }

    private void MainActivity() {
        finish();
        Intent intent=new Intent(getApplicationContext(),MainActivity.class);
        startActivity(intent);
    }


    private void createuser(){
        String email = txt_email_signup.getText().toString();
        String password = txt_password_signup.getText().toString();
        String cfrmpass = txt_confirme_signup.getText().toString();

        if (TextUtils.isEmpty(email)){
            txt_email_signup.setError("This Field Cannot Be Empty");
            txt_email_signup.requestFocus();
        }else if (TextUtils.isEmpty(password)){
            txt_password_signup.setError("This Field Cannot Be Empty");
            txt_password_signup.requestFocus();
        }else if (password.equals(cfrmpass)){
            mAuth.createUserWithEmailAndPassword(email,password).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                @Override
                public void onComplete(@NonNull Task<AuthResult> task) {
                    if (task.isSuccessful()){
                        Toast.makeText(sign_up.this,"User Registred Seccessfully",Toast.LENGTH_SHORT).show();
                        startActivity(new Intent(sign_up.this, login.class));
                    }else{
                        Toast.makeText(sign_up.this,"User Registred Failed",Toast.LENGTH_SHORT).show();
                    }
                }
            });
        }
         else {
            txt_confirme_signup.setError("Password Does Not Match");
            txt_confirme_signup.requestFocus();

        }
    }

}