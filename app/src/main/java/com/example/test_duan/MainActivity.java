package com.example.test_duan;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.e("ZZZZZ", "Change from new dev" );

        Calendar calendar = Calendar.getInstance();
        @SuppressLint("SimpleDateFormat") SimpleDateFormat simpleDateFormat = new SimpleDateFormat( "hh:mm dd/MM/yyyy");
        String text = simpleDateFormat.format(calendar.getTime());
        Log.e("ZZZZ", "onCreate: "+ text);
        
        //Lấy thời gian cho sql date
        java.util.Date now = new java.util.Date();
            java.sql.Date date = new java.sql.Date(now.getTime());

    }
}
