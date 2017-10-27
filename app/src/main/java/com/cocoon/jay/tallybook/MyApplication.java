package com.cocoon.jay.tallybook;

import android.app.Application;
import android.content.Context;

/**
 * Created by Administrator on 2017/10/23 0023.
 */

public class MyApplication extends Application {

    public static MyApplication application;
    private static Context context;

    @Override
    public void onCreate() {
        super.onCreate();
        application = this;
        context = getApplicationContext();
    }
}
