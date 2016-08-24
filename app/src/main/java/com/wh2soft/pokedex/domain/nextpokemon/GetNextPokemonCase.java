package com.wh2soft.pokedex.domain.nextpokemon;

import java.util.List;

/**
 * Created by wilmer on 3/08/16.
 */
public interface GetNextPokemonCase {
    void execute();

    void execute(int PokemonId);

    void execute(List<Integer> PokemonIDs);
}
