package com.example.hoanghoan.hci_21_ngdngticy;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class WorkTimeDay extends AppCompatActivity {
    ImageButton back;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_work_time_day);
        back=findViewById(R.id.backtimeday);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in=new Intent(WorkTimeDay.this,WorkTime.class);
                startActivity(in);
            }
        });
    }
}
