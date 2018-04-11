package com.example.hoanghoan.hci_21_ngdngticy;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class DetailHistoryWork extends AppCompatActivity {
       ImageButton back;
       ListView list;
       ArrayList<String> arrayList;
       TextView txt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_history_work);
        back=findViewById(R.id.backdetailhistory);
        list=findViewById(R.id.listview);
        txt=findViewById(R.id.datedetail);
        arrayList=new ArrayList();
        arrayList.add("08:00-10:00 Tưới cây C2");
        arrayList.add("10:30-11:50 Tưới cây B1");
        arrayList.add("14:00-16:30 Tưới cây thư viện Tạ Quang Bửu");
        ArrayAdapter a=new ArrayAdapter(DetailHistoryWork.this,android.R.layout.simple_list_item_1,arrayList);
        list.setAdapter(a);
        Intent in=getIntent();
        int[] aa=in.getIntArrayExtra("array");

        txt.setText(String.valueOf(aa[2])+"/"+String.valueOf(aa[1])+"/"+String.valueOf(aa[0]));
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in=new Intent(DetailHistoryWork.this,WorkHistory.class);
                startActivity(in);
            }
        });
    }
}
