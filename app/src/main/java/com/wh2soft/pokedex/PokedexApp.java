package com.wh2soft.pokedex;

import android.app.Application;
import android.content.Context;

/**
 * Created by wilmer on 4/08/16.
 */
public class PokedexApp extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
    }

    public Context getContext() {
        return getApplicationContext();
    }
}
