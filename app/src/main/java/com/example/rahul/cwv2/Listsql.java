package com.example.rahul.cwv2;

/**
 * Created by Rahul on 14/12/15.
 */

/*
* this is the implementation of the SQLite
* haveing each field set to what kind of data type it will take.*/
public class Listsql {
    private String id;
    private String title;
    private String items;
    public Listsql(String id,String Title, String items){
        this.id = id;
        this.title = Title;
        this.items = items;
    }

    public String getId(){
        return id;
    }
    public void setId(String id){
        this.id = id;
    }
    public String getTitle(){
        return title;
    }
    public void setTitle(String title){
        this.title = title;
    }
    public String getItems(){
        return items;
    }
    public void setItems(String items){
        this.items = items;
    }
}

