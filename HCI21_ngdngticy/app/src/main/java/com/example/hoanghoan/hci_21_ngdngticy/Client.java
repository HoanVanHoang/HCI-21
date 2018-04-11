package com.example.hoanghoan.hci_21_ngdngticy;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class Client extends AppCompatActivity {
      TextView hell;
      Button find,infor,work;
      ImageButton back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_client);
        hell=findViewById(R.id.hello);
        find=findViewById(R.id.findroad);
        infor=findViewById(R.id.informa);
        work=findViewById(R.id.worktime);
        back=findViewById(R.id.backclient);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in=new Intent(Client.this,MainActivity.class);
                startActivity(in);
            }
        });
        find.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in =new Intent(Client.this,MainFunction.class);
                startActivity(in);
            }
        });
        infor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in=new Intent(Client.this,Information.class);
                startActivity(in);
            }
        });
        work.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in=new Intent(Client.this,WorkTime.class);
                startActivity(in);
            }

        });


    }
}
