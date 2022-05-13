package com.hichamch.bookivia;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.auth.api.signin.GoogleSignIn;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInClient;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;

public class profiles extends AppCompatActivity {
    public Button btn_home_profiles,btn_cat_profiles,btn_audio_profiles,btn_ebook_profiles,btn_profile_profiles,btn_mystorie_profiles,btn_resetpass_profiles;
    private TextView textName_profile,name,email;
    public static final String PROFILE = "PROFILE";
    private String profile;

    FirebaseAuth mAuth;

    GoogleSignInOptions gso;
    GoogleSignInClient gsc;
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
        name = findViewById(R.id.txt_username_profiles);
        email = findViewById(R.id.txt_email_profiles);
        Button btn_signout_profiles = findViewById(R.id.btn_signout_profiles);
        btn_resetpass_profiles = findViewById(R.id.btn_resetpassword_profile);
        mAuth = FirebaseAuth.getInstance();

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

        gso = new GoogleSignInOptions.Builder(GoogleSignInOptions.DEFAULT_SIGN_IN)
                .requestEmail()
                .build();
        gsc = GoogleSignIn.getClient(this,gso);

        GoogleSignInAccount account=GoogleSignIn.getLastSignedInAccount(this);
        if (account!=null){
            String Name=account.getDisplayName();
            String Mail= account.getEmail();

            name.setText(Name);
            email.setText(Mail);
            textName_profile.setText(Name);
        }

        btn_signout_profiles.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                logout();
            }
        });




    }

    private void logout() {
        gsc.signOut().addOnCompleteListener(new OnCompleteListener<Void>() {
            @Override
            public void onComplete(@NonNull Task<Void> task) {
                finish();
                startActivity(new Intent(getApplicationContext(),login.class));
            }
        });
    }
}