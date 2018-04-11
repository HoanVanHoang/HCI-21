package com.example.hoanghoan.hci_21_ngdngticy;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class DetailMap extends AppCompatActivity {
    ImageButton simple,back;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_map);
        simple=findViewById(R.id.simple);
        back=findViewById(R.id.backdetail);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in =new Intent(DetailMap.this,MainFunction.class);
                startActivity(in);
            }
        });
        simple.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in=new Intent(DetailMap.this,TreeDetail.class);
                startActivity(in);
            }
        });

    }
}
