package com.wh2soft.pokedex.model.nextpokemon;

/**
 * Created by wilmer on 26/10/16.
 */

public class TestRetrofit {

    public static void main(String[] args) {
        PokemonRepositoryImpl repository = new PokemonRepositoryImpl();
        repository.getNextPokemon("500");
    }

}
