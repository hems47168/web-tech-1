package com.example.collegenoticeboard;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class AddNoticeActivity extends AppCompatActivity {

    EditText noticeInput;
    Button addBtn;

    // 📢 Default + Faculty notices stored here
    public static ArrayList<String> noticeList = new ArrayList<>();

    // 📌 Default notices (shown always)
    static {
        noticeList.add("📢 Gandhi Jayanti Holiday");
        noticeList.add("📢 Exam Timetable Released");
        noticeList.add("📢 Bus Timing Changed");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_notice);

        noticeInput = findViewById(R.id.noticeInput);
        addBtn = findViewById(R.id.addBtn);

        addBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String notice = noticeInput.getText().toString();

                if (!notice.isEmpty()) {
                    noticeList.add("📢 " + notice);
                }

                // Go to Student page
                startActivity(new Intent(AddNoticeActivity.this, StudentActivity.class));
            }
        });
    }
}