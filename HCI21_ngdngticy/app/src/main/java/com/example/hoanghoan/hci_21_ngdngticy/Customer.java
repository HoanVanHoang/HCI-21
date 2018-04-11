package com.example.hoanghoan.hci_21_ngdngticy;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class Customer extends AppCompatActivity {
     Button find;
     ImageButton back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_customer);
        back=findViewById(R.id.backcustomer);
        find=findViewById(R.id.findroad2);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in =new Intent(Customer.this,MainActivity.class);
                startActivity(in);
            }
        });
        find.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in=new Intent(Customer.this,MainFunction.class);
                startActivity(in);
            }
        });
    }
}
