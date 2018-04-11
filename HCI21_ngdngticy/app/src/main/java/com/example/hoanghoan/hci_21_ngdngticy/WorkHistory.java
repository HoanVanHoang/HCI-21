package com.example.hoanghoan.hci_21_ngdngticy;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.icu.text.SimpleDateFormat;
import android.icu.util.Calendar;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CalendarView;
import android.widget.DatePicker;

public class WorkHistory extends AppCompatActivity {
    CalendarView calender;
    int year, month, dates;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_work_history);
        calender = findViewById(R.id.calendarView);
        calender.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {
            @Override
            public void onSelectedDayChange(@NonNull CalendarView calendarView, int i, int i1, int i2) {
                year = i;
                month = i1;
                dates = i2;
                int[] array = {year, month, dates};
                Intent in = new Intent(WorkHistory.this, DetailHistoryWork.class);
                in.putExtra("array", array);
                startActivity(in);
            }
        });
    }
}
