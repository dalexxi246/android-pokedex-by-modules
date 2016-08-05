package com.wh2soft.pokedex.android.lib.di;

import com.wh2.wenotes.WENotesAppModule;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by Wilmer Hurtado on 05/07/2016.
 */
@Singleton
@Component(modules = {LibsModule.class, WENotesAppModule.class})
public interface LibsComponent {
}
