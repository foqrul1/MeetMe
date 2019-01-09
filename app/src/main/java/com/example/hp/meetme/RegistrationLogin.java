package com.example.hp.meetme;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class RegistrationLogin extends AppCompatActivity {
    private Button mLogin, mRegistration;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration_login);
        mLogin = findViewById(R.id.loginButton);
        mRegistration = findViewById(R.id.regButton);

        mLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(RegistrationLogin.this, LoginActivity.class);
                startActivity(intent);
                finish();
                return;

            }
        });
        mRegistration.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(RegistrationLogin.this, registrationActivity.class);
                startActivity(intent);
                finish();
                return;
            }
        });
    }
}
