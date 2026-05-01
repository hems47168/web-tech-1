package com.example.collegenoticeboard;

import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class StudentActivity extends AppCompatActivity {

    TextView noticeText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student);

        noticeText = findViewById(R.id.noticeText);

        StringBuilder allNotices = new StringBuilder();

        if (AddNoticeActivity.noticeList.isEmpty()) {
            allNotices.append("No notices yet 📭");
        } else {
            for (String n : AddNoticeActivity.noticeList) {
                allNotices.append(n).append("\n\n");
            }
        }

        noticeText.setText(allNotices.toString());
    }
}
