package com.example.hoanghoan.hci_21_ngdngticy;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class TreeDetail extends AppCompatActivity {
     Button grow,die,inform,treenearest;
     public static final int died=0;
     public static final int life=1;
     ImageButton back;
     int key=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tree_detail);
        grow=findViewById(R.id.grow);
        inform=findViewById(R.id.information);
        die=findViewById(R.id.die);
        back=findViewById(R.id.backdetailtree);
        die.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in=new Intent(TreeDetail.this,DetailMap.class);
                in.putExtra("died",died);
                startActivity(in);
            }
        });

        grow .setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(key==0)
                {
                    key=1;
                }
            }
        });
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in=new Intent(TreeDetail.this,DetailMap.class);
                startActivity(in);
            }
        });

    }
}
