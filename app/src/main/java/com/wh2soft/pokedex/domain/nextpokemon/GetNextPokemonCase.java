package com.wh2soft.pokedex.domain.nextpokemon;

import java.util.List;

/**
 * Created by wilmer on 3/08/16.
 */
public interface GetNextPokemonCase {
    @Deprecated
    void execute();

    @Deprecated
    void execute(int PokemonId);

    void execute(List<Integer> PokemonIDs);
}
