package com.example.test_duan;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class MainActivity extends AppCompatActivity {
    // DucSenSei No pro
    //New dev
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.e("ZZZZZ", "Change from new dev" );
        //Add to master

        //New dev to master

        //New master to dev
        Calendar calendar = Calendar.getInstance();
        @SuppressLint("SimpleDateFormat") SimpleDateFormat simpleDateFormat = new SimpleDateFormat( "hh:mm dd/MM/yyyy");
        Log.e("ZZZZ", "onCreate: "+simpleDateFormat.format(calendar.getTime()) );
        
        //Teee
        //Test from Hung 2
    }
}
