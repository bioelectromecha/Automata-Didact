package com.didactapp.automatadidact;

import android.app.Application;

import com.firebase.client.Firebase;

/**
 * Created by roman on 19/04/16.
 */
public class DidactApplication extends Application{
    @Override
    public void onCreate() {
        super.onCreate();
        Firebase.setAndroidContext(this);
    }
}
