package com.accoffin.yurse.application.db;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DbHelper extends SQLiteOpenHelper {

    private static final String STATISTICS = "Statistics";
    private static final String ID = "ID";
    private static final String NAME = "Name";
    private static final String COST = "Cost";

    public DbHelper(Context context, int version) {
        super(context, STATISTICS, null, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("CREATE TABLE 'products'( id INTEGER PRIMARY KEY AUTOINCREMENT, name TEXT, cost FLOAT) ");

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }

}

