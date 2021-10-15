package com.example.mj_instagram;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

//extends == subclass
public class ParseApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        // Register your parse models
        ParseObject.registerSubclass(Post.class);

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("aYBQEi6vXwzD6fZfs0x1at3kBO0nrxZkW65Vwhd0")
                .clientKey("CGsQ9d820SSdkpz7XEbB00p3YgwQgxuEVqfAwsuq")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
