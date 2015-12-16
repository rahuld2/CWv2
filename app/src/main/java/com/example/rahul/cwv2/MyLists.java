package com.example.rahul.cwv2;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MyLists extends AppCompatActivity {
    String tag = "okay";


//this is where we create all the methods and on click listeners
//for example buttons onclicklisteners are put in here and also intents
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_lists);
        Button ViewList = (Button) findViewById(R.id.button3);
        Button ViewList1 = (Button) findViewById(R.id.button4);
        Log.d(tag, "The onCreate() event");

        ViewList.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent open = new Intent(MyLists.this, createList.class);
                startActivity(open);

            }
        });
        ViewList1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent open2 = new Intent(MyLists.this, createList.class);
                startActivity(open2);
            }
        });
    }
//    for any progress that the user has inputted the app will then keep that activity
    /*onStart is for when the user opens the app
    onRestart and onResume is when the app is closed(soft and hard) it will reappear
    onPause is when you are in the app but are checking other things such as
    notification centre as a example.
    * */
    @Override
    protected void onStart() {
        super.onStart();
        Log.d(tag, "The onStart() event");
    }
    @Override
    public void onRestart() {
        super.onRestart();
        Log.d(tag, "The onRestart() event");
    }
    @Override
    protected void onResume() {
        super.onResume();
        Log.d(tag, "The onResume() event");
    }
    @Override
    protected void onPause() {
        super.onPause();
        Log.d(tag, "The onPause() event");
    }
    @Override
    protected void onStop() {
        super.onStop();
        Log.d(tag, "The onStop() event");
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(tag, "The onDestroy() event");

        }}
