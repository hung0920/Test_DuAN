package com.example.test_duan;

import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class MainActivity extends AppCompatActivity {

    //New dev
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.e("ZZZZZ", "Change from new dev" );
        //Add to master

        //New dev to master

        //New master to dev


        //Lấy thời gian
        Calendar calendar = Calendar.getInstance();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat( "hh:mm dd/MM/yyyy");
        Log.e("ZZZZ", "onCreate: "+simpleDateFormat.format(calendar.getTime()) );
    }
}
