package com.example.hoanghoan.hci_21_ngdngticy;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class WorkTime extends AppCompatActivity {
       Button time,hist;
       ImageButton back;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_work_time);
        time=findViewById(R.id.worktime);
        hist=findViewById(R.id.workhistory);
        back=findViewById(R.id.backworktime);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in=new Intent(WorkTime.this,Client.class);
            }
        });
        time=findViewById( R.id.worktime);
        time.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in=new Intent(WorkTime.this,WorkTimeDay.class);
                startActivity(in);
            }
        }));
        hist=findViewById(R.id.workhistory);
        hist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in=new Intent(WorkTime.this,WorkHistory.class);
                startActivity(in);
            }
        });

    }
}
