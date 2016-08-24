package com.wh2soft.pokedex.ui.pokemon_detail.presenter;

import com.wh2soft.pokedex.common.event.PokemonEvent;

/**
 * Created by wilmer on 14/08/16.
 */
public interface PokemonDetailPresenter {

    int MAX_POKEMON_ON_GAMEPLAY = 4;

    void onCreate();

    void onDestroy();

    void onStart();

    void onStop();

    void getNextPokemonSet();

    void onEventMainThread(PokemonEvent ev);
}
