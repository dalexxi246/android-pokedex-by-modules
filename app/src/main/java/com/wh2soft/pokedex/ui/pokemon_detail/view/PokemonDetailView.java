package com.wh2soft.pokedex.ui.pokemon_detail.view;

import com.wh2soft.pokedex.model.entities.Pokemon;

/**
 * Created by wilmer on 14/08/16.
 */
public interface PokemonDetailView {
    void addChoiceButtons();

    void beforeStartGame();

    void showLoading();

    void hideLoading();

    void getNextPokemonSet();

    void onSetImageURL(Pokemon p);

    void onSetPokemonChoice(Pokemon p, int position);
}
