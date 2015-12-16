package com.example.rahul.cwv2;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class MainActivity extends AppCompatActivity {
    String tag = "Lifestyle";
/*the onCreate function has a button for the app to progress to the next activity
when it is pressed
* */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button Lists = (Button) findViewById(R.id.buttonToList);
        Lists.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,MyLists.class);
                startActivity(intent);

            }
        });
        }


    @Override
    public void onStart(){
        super.onStart();
        Log.d(tag, "In the onStart() event");
    }
    @Override
    public void onRestart(){
        super.onRestart();
        Log.d(tag,"In the onRestart() event");
    }
    @Override
    public void onResume(){
        super.onResume();
        Log.d(tag,"In the onResume() event");
    }
    @Override
    public void onPause(){
        super.onPause();
        Log.d(tag,"In the onPause() event");
    }
    @Override
    public void onStop(){
        super.onStop();
        Log.d(tag,"In the onStop() event");
    }
    @Override
    public void onDestroy(){
        super.onDestroy();
        Log.d(tag,"In the onDestroy() event");
    }}
