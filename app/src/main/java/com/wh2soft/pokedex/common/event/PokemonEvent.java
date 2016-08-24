package com.wh2soft.pokedex.common.event;

import com.wh2soft.pokedex.model.entities.Pokemon;

/**
 * Created by wilmer on 3/08/16.
 */
public class PokemonEvent {

    public static final int POKEMON_GET_SUCESSFULLY = 966;
    public static final int POKEMON_GET_FAILED = 724;

    int type;
    Pokemon pokemon;
    String error;

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public Pokemon getPokemon() {
        return pokemon;
    }

    public void setPokemon(Pokemon pokemon) {
        this.pokemon = pokemon;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }
}
