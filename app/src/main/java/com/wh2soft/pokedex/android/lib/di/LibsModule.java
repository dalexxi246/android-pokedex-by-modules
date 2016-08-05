package com.wh2soft.pokedex.android.lib.di;

import android.app.Activity;
import android.content.Context;

import com.wh2.wenotes.lib.GlideImageLoader;
import com.wh2.wenotes.lib.GreenRobotEventBus;
import com.wh2.wenotes.lib.base.EventBus;
import com.wh2.wenotes.lib.base.ImageLoader;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Wilmer Hurtado on 05/07/2016.
 */

@Module
public class LibsModule {
    Activity activity;

    public void setActivity(Activity activity) {
        this.activity = activity;
    }

    @Provides
    @Singleton
    EventBus providesEventBus() {
        return new GreenRobotEventBus();
    }

    @Provides
    @Singleton
    ImageLoader providesImageLoader(Context context) {
        GlideImageLoader imageLoader = new GlideImageLoader();
        if (context != null) {
            imageLoader.setLoaderContext(context);
        }
        return imageLoader;
    }

    @Provides
    @Singleton
    Activity providesActivity() {
        return this.activity;
    }
}
