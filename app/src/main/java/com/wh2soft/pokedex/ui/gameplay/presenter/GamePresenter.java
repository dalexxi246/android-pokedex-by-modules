package com.wh2soft.pokedex.ui.gameplay.presenter;

import com.wh2soft.pokedex.common.event.PokemonEvent;
import com.wh2soft.pokedex.model.entities.Pokemon;

/**
 * Created by wilmer on 14/08/16.
 */
public interface GamePresenter {

    int MAX_POKEMON_ON_GAMEPLAY = 4;

    void onCreate();

    void onDestroy();

    void onStart();

    void onStop();

    void getNextPokemonSet();

    void updatePokemonOnUI(Pokemon pData, int idComponent);

    void showErrorMessage(String errorMsg);

    void onEventMainThread(PokemonEvent ev);
}
