package com.wh2soft.pokedex.ui.gameplay.presenter;

import com.wh2soft.pokedex.common.event.PokemonEvent;
import com.wh2soft.pokedex.domain.nextpokemon.GetNextPokemonCase;
import com.wh2soft.pokedex.lib.base.EventBus;
import com.wh2soft.pokedex.model.entities.Pokemon;
import com.wh2soft.pokedex.ui.gameplay.view.GameModeView;

import org.greenrobot.eventbus.Subscribe;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by wilmer on 14/08/16.
 */
public class GamePresenterForImageModeImpl implements GamePresenter {

    GameModeView view;
    GetNextPokemonCase useCase;
    EventBus eventBus;

    private ArrayList<Pokemon> collectionForUpdateUI;
    private List<Integer> pokemonIDs;

    public GamePresenterForImageModeImpl(GameModeView view, GetNextPokemonCase useCase, EventBus eventBus) {
        this.view = view;
        this.useCase = useCase;
        this.eventBus = eventBus;
        collectionForUpdateUI = new ArrayList<>(GamePresenter.MAX_POKEMON_ON_GAMEPLAY);
    }

    @Override
    public void onCreate() {

    }

    @Override
    public void onDestroy() {

    }

    @Override
    public void onStart() {

    }

    @Override
    public void onStop() {

    }

    @Override
    public void getNextPokemonSet() {
        pokemonIDs = new ArrayList<>(GamePresenter.MAX_POKEMON_ON_GAMEPLAY);
        for (int i = 0; i < pokemonIDs.size(); i++) {
            int randomID;
            do {
                randomID = new Random().nextInt(Pokemon.POKEMON_MAX_NUMBER);
            } while (randomID > 0);
            pokemonIDs.set(i, randomID);
        }
        useCase.execute(pokemonIDs);
    }

    @Override
    public void updatePokemonOnUI(Pokemon pData, int idComponent) {
        switch (idComponent) {
            case 0:
                view.onSetImageURL(pData);
                break;
            default:
                view.onSetPokemonChoice(pData, idComponent);
                break;
        }
    }

    @Subscribe
    @Override
    public void onEventMainThread(PokemonEvent ev) {
        switch (ev.getType()) {
            case PokemonEvent.POKEMON_GET_SUCESSFULLY:
                Pokemon p = ev.getPokemon();
                for (int i = 0; i < pokemonIDs.size(); i++) {
                    if (p.getId() == pokemonIDs.get(i)) {
                        updatePokemonOnUI(p, i);
                        break;
                    }
                }
                break;
            case PokemonEvent.POKEMON_GET_FAILED:
                // TODO Mensaje de error
        }
    }
}
