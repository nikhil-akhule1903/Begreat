package com.example.begrateful;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.firebase.auth.FirebaseAuth;

public class Homescreen extends AppCompatActivity {
    Button nextbtn;
    private FirebaseAuth.AuthStateListener mState;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homescreen);
        nextbtn=(Button)findViewById(R.id.btnlog);

        nextbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent( Homescreen.this,Secondm.class));
            }
        });

    }
}