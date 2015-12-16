package com.example.rahul.cwv2;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import java.io.File;
import java.io.FileOutputStream;
import java.security.spec.ECField;
import java.util.ArrayList;

public class createList extends Activity {
    //ListView listView;
    String tag = "okay";
    //Button for the save button
    Button save;
    ArrayList<String> addArray = new ArrayList<String>();
    EditText txt;
    ListView show;
    EditText txtID, txtTitle,txtItem;

    public static String titleKey = "titleKey";
    public static String itemKey = "itemKey";
    SharedPreferences sharedPreferences;
    String txtTitle1;
/*the onCreate in this activity contains a lot of information. it contains a back button so you
are able to go to the previous activity and a large part of it is how the EditText is then used
to enter within the listView. this is so when the user input items they are able to add different
items and have them shown below.
* */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_create_list);
            Log.d(tag, "In the onCreate() event");
            txtID = (EditText) findViewById(R.id.userInput);
            txtTitle = (EditText) findViewById(R.id.title);
            txtItem = (EditText) findViewById(R.id.itemAdd);
            sharedPreferences = getSharedPreferences("MysharedPreMain",Context.MODE_PRIVATE);
            if (sharedPreferences.contains(titleKey)) {
                txtTitle.setText(sharedPreferences.getString(titleKey, " "));
            }
            if (sharedPreferences.contains(itemKey)){
                txtItem.setText(sharedPreferences.getString(itemKey," "));
//Button to go to the View of the lists.

            Button backtoLists = (Button) findViewById(R.id.BackBtn);
            backtoLists.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i = new Intent(createList.this, MyLists.class);
                    startActivity(i);
                }
            });
            Intent open = getIntent();

        }

/*This part of the code is where the listView adds user input. if the user inputs the same word as
already in the listView it will not add the item and Toast Item Already Added to the array and if
nothing is inputted it also says input Field is empty.
* */

        txt = (EditText) findViewById(R.id.itemAdd);
        show = (ListView) findViewById(R.id.list);
        save = (Button) findViewById(R.id.Save);
        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String getInput = txt.getText().toString();
                if (addArray.contains(getInput)) {
                    Toast.makeText(getBaseContext(), "Item Already Added to The List", Toast.LENGTH_LONG).show();
                } else {
                    if (getInput == null || getInput.trim().equals("")) {
                        Toast.makeText(getBaseContext(), "Input Field is Empty", Toast.LENGTH_LONG).show();
                    } else {
                        addArray.add(getInput);
                        ArrayAdapter<String> adapter = new ArrayAdapter<String>(createList.this, android.R.layout.simple_list_item_1, addArray);
                        show.setAdapter(adapter);
                        ((EditText) findViewById(R.id.itemAdd)).setText(" ");
                    }
                }
            }
        });

    }}
    /*this method is used to save any item and title that the user inputs.
    the user is also able to see the data is saved as a Toast will appear saying data saved
    * */
    public void save(View v) {
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString(titleKey, txtTitle.getText().toString());
        editor.putString(itemKey,txtItem.getText().toString());
        Toast.makeText(this, "data saved", Toast.LENGTH_SHORT).show();
    }

/*from what the user has inputted this part gets the text and turns it into a string
* then inserts the values into the database.*/
    public void Save(View v){
        String aID = txtID.getText().toString();
        String aTitle = txtTitle.getText().toString();
        String aItem = txtItem.getText().toString();
        DatabaseHandler db = new DatabaseHandler(this);
        db.addItem(new Listsql(aID,aTitle,aItem));
    }
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
    }



//test for the input to be saved

/*    private EditText input;
    private TextView output;
    public void buttonOnClick(View v){
        Button DoneButton = (Button) findViewById(R.id.Done);
        input = (EditText) findViewById(R.id.titleInput);
        output = (TextView) findViewById(R.id.textView4);
        output.setText(input.getText());
    }
*/



