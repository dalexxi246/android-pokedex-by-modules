package com.wh2soft.pokedex.ui.gameplay.view;

import com.wh2soft.pokedex.model.entities.Pokemon;

/**
 * Created by wilmer on 14/08/16.
 */
public interface GameModeView {
    @Deprecated
    void addChoiceButtons();
    void beforeStartGame();

    void updateCountdown();
    void showLoading();
    void hideLoading();

    void showError(String errorMsg);

    void hideError();
    void getNextPokemonSet();
    void onSetImageURL(Pokemon p);
    void onSetPokemonChoice(Pokemon p, int position);
}
