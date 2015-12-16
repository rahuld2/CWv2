package com.example.rahul.cwv2;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

/**
 * Created by Rahul on 14/12/15.
 */

/*this is how the database is managed and this is also when the database accepts the correct values
* the addItem function is where the values are collected and inputted when the lists are created.
* there is also a part of the code where if the values are imput the user are informed and if the
* if it fails they also know.*/
public class DatabaseHandler extends SQLiteOpenHelper {
    public DatabaseHandler(Context context){
        super(context, "testDB",null,1);
    }

    public void onCreate(SQLiteDatabase db){
        db.execSQL("CREATE TABLE itemTable(colID,colTitle,colItems");
    }
    public void onUpgrade(SQLiteDatabase db,int oldVersion,int newVersion){

    }
    public void addItem(Listsql contact){
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put("colID",contact.getId());
        values.put("colTitle",contact.getTitle());
        values.put("colItems",contact.getItems());
        long result = db.insert("itemTable",null,values);
        if (result > 0){
            Log.d("dbhelper","inserted complete");
        }else{
            Log.d("dbhelper","failed insert");
        }
        db.close();
    }
}
