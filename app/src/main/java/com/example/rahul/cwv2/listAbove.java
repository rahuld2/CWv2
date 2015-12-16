package com.example.rahul.cwv2;


import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * this is a fragement and all the programming was done on the XML file
 * this along with the buttonBelow creates the createList activity
 */
public class listAbove extends Fragment {


    public listAbove() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_list_above, container, false);
    }


}
