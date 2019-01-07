package com.example.andrew.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Details extends AppCompatActivity {
    private TextView val;
    private TextView timestamp;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);
        Bundle bundle = getIntent().getExtras();
        if (bundle == null) { return; } // get data via the key
        String value = bundle.getString("value");

        val = (TextView) findViewById(R.id.detailPagex);
        val.setText("Clicked Values:  "+ value);



        // Convert from timestamp to Date and time
        // timestamp.setText(convertTimestamp(getTimestamp()));


    }

    public void clickHome(View view) {
        Intent intent = new Intent(Details.this, Home.class);
        startActivity(intent);
    }

    public void button10(View view) {
        Intent intent = new Intent(Details.this, History.class);
        startActivity(intent);
    }

    private String convertTimestamp(String timestamp){

        long yourSeconds = Long.valueOf(timestamp);
        Date mDate = new Date(yourSeconds * 1000);
        DateFormat df = new SimpleDateFormat("dd MMM yyyy hh:mm:ss");
        return df.format(mDate);
    }

}