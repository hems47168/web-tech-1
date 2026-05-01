package com.example.collegenoticeboard;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class LoginActivity extends AppCompatActivity {

    EditText username, password;
    Button loginBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        username = findViewById(R.id.username);
        password = findViewById(R.id.password);
        loginBtn = findViewById(R.id.loginBtn);

        loginBtn.setOnClickListener(v -> {

            String user = username.getText().toString();
            String pass = password.getText().toString();

            if(user.equals("admin") && pass.equals("1234")) {

                Toast.makeText(this, "Login Success", Toast.LENGTH_SHORT).show();

                // Go to Add Notice page
                startActivity(new Intent(this, AddNoticeActivity.class));
            } else {
                Toast.makeText(this, "Wrong Username or Password", Toast.LENGTH_SHORT).show();
            }
        });
    }
}