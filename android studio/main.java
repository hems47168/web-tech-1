package com.example.collegenoticeboard;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    Button btnStudent, btnFaculty;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnStudent = findViewById(R.id.btnStudent);
        btnFaculty = findViewById(R.id.btnFaculty);

        btnStudent.setOnClickListener(v ->
                startActivity(new Intent(this, StudentActivity.class)));

        btnFaculty.setOnClickListener(v ->
                startActivity(new Intent(this, LoginActivity.class)));
    }
}