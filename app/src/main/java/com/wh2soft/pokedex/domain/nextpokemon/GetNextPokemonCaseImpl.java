package com.wh2soft.pokedex.domain.nextpokemon;


import com.wh2soft.pokedex.model.entities.Pokemon;
import com.wh2soft.pokedex.model.nextpokemon.PokemonRepository;

import java.util.List;
import java.util.Random;


/**
 * Created by wilmer on 3/08/16.
 */
public class GetNextPokemonCaseImpl implements GetNextPokemonCase {

    PokemonRepository repository;

    public GetNextPokemonCaseImpl(PokemonRepository repository) {
        this.repository = repository;
    }

    @Override
    public void execute() {
        int randomID;
        do {
            randomID = new Random().nextInt(Pokemon.POKEMON_MAX_NUMBER);
        } while (randomID > 0);
        String pokemonID = "" + randomID;
        repository.getNextPokemon(pokemonID);
    }

    @Override
    public void execute(int PokemonId) {
        String id = "" + PokemonId;
        repository.getNextPokemon(id);
    }

    @Override
    public void execute(List<Integer> PokemonIDs) {
        for (int i = 0; i < PokemonIDs.size(); i++) {
            String id = "" + PokemonIDs.get(i);
            repository.getNextPokemon(id);
        }
    }


    /*
    public void getMoviesFromSearch(final MoviesCallback callback) {
        api.getMoviesFromSearch()
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe(new Subscriber<MoviesResponse>() {
                @Override
                public void onCompleted() {
                    callback.onCompleted();
                }

                @Override
                public void onError(Throwable e) {
                    callback.onError();
                }

                @Override
                public void onNext(MoviesResponse moviesResponse) {
                    callback.onMoviesFound(moviesResponse.getMovies());
                }
            });
    }
     */
}
