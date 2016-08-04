package com.wh2soft.pokedex.model.nextpokemon;

import com.wh2soft.pokedex.common.libs.base.EventBus;
import com.wh2soft.pokedex.model.api.PokeApiService;
import com.wh2soft.pokedex.model.entities.Pokemon;
import com.wh2soft.pokedex.model.nextpokemon.event.PokemonEvent;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by wilmer on 3/08/16.
 */
public class PokemonRepositoryImpl implements PokemonRepository {

    PokeApiService service;
    EventBus eventBus;

    public PokemonRepositoryImpl(PokeApiService service, EventBus eventBus) {
        this.service = service;
        this.eventBus = eventBus;
    }

    @Override
    public void getNextPokemon(String pokemonID) {
        Call<Pokemon> call = service.getPokemon(pokemonID);
        call.enqueue(new Callback<Pokemon>() {
            @Override
            public void onResponse(Call<Pokemon> call, Response<Pokemon> response) {
                Pokemon p = response.body();
                if (p != null) {
                    post(p);
                } else {
                    post();
                }
            }

            @Override
            public void onFailure(Call<Pokemon> call, Throwable t) {
                post(t.getLocalizedMessage());
            }
        });
    }

    private void post() {
        PokemonEvent event = new PokemonEvent();
        event.setType(PokemonEvent.POKEMON_GET_FAILED);
        event.setError(null);
        eventBus.post(event);
    }

    public void post(Pokemon response) {
        PokemonEvent event = new PokemonEvent();
        event.setType(PokemonEvent.POKEMON_GET_SUCESSFULLY);
        event.setPokemon(response);
        eventBus.post(event);
    }

    public void post(String errorMsg) {
        PokemonEvent event = new PokemonEvent();
        event.setType(PokemonEvent.POKEMON_GET_FAILED);
        event.setError(errorMsg);
        eventBus.post(event);
    }
}
