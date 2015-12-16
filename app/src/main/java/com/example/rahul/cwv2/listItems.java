package com.example.rahul.cwv2;

import java.util.List;

/**
 * Created by Rahul on 14/12/15.
 */
public class listItems {
    private String listName;
    private String items;

    public listItems(String listName, String items) {
        this.listName = listName;
        this.items = items;
    }
    
public String getListName(){
    return listName;
}
public void setListName(String listName){
    this.listName = listName;
}
public String getItems(){
    return items;
}
public void setItems(String items){
    this.items = items;
}}