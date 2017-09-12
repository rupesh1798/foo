package com.example.aadi.myapplication;

import java.util.ArrayList;

/**
 * Created by aadi on 11/8/17.
 */

public class data {

    private static final String TAG = data.class.getSimpleName();

    public static String source[] = new String[]{"Ram", "Shyam", "Sita", "Geeta", "Ramesh", "Suresh"};


    public static ArrayList<ItemData> getData() {
        ArrayList<ItemData> data = new ArrayList<>();

        for (int i = 0; i < source.length; i++) {
            ItemData itemData = new ItemData();
            itemData.setTitle(source[i]);
            data.add(itemData);


        }
        return data;
    }


}
