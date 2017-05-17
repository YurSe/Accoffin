package com.accoffin.yurse.application;

import android.database.sqlite.SQLiteDatabase;

import com.accoffin.yurse.application.db.DbHelper;

public class Application extends  android.app.Application {

    public Application() {
        final DbHelper dbHelper = new DbHelper(this, 1);
        final SQLiteDatabase database = dbHelper.getWritableDatabase();
        new StringBuilder();
    }

    @Override
    public void onCreate() {
        super.onCreate();



    }
}
