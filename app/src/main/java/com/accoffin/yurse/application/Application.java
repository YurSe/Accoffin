package com.accoffin.yurse.application;

import com.accoffin.yurse.application.db.DbHelper;

public class Application extends  android.app.Application {

    @Override
    public void onCreate() {
        super.onCreate();
        final DbHelper dbHelper = new DbHelper(this, 1);


    }
}
