package com.example.aadi.myapplication.provider;

import android.net.Uri;
import android.provider.BaseColumns;

/**
 * Created by aadi on 12/8/17.
 */

public class DataContract {
    public static final String CONTENT_AUTHORITY = "com.example.aadi.myapplication.provider";

    public static final Uri BASE_CONTENT_URI = Uri.parse("content://"+ CONTENT_AUTHORITY);

    public static final String PATH_DATA = "data";

    public static final class DataEntry implements BaseColumns {

        public static final Uri CONTENT_URI = BASE_CONTENT_URI.buildUpon().appendPath(PATH_DATA).build();

        /*
         *Table Name and coloumn Name for the database.
         */

        public static final String TABLE_NAME = "data";
        public static final String  COLOUMN_DATA_ID = "dataID";
        public static final String  COLOUMN_DATA_NAME = "dataName";
    }
}