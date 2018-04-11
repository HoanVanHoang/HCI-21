package com.example.hoanghoan.hci_21_ngdngticy;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Layout;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.RelativeLayout;

public class MainFunction extends AppCompatActivity {
   ImageButton back,water;
   Button detail;
   RelativeLayout layout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_function);
        back=findViewById(R.id.backmainfunction);
        detail=findViewById(R.id.treearea);
        water=findViewById(R.id.waterarea);
        layout=findViewById(R.id.layoutchild);
        water.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                layout.setBackgroundResource(R.drawable.maphust2);
            }
        });
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in=new Intent(MainFunction.this,Client.class);
                startActivity(in);
            }
        });
        detail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in=new Intent(MainFunction.this,DetailMap.class);
                startActivity(in);
            }
        });
    }
}
