package com.wh2soft.pokedex.model.api;

import com.wh2soft.pokedex.model.entities.Pokemon;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import rx.Observable;

/**
 * Created by wilmer on 1/08/16.
 */
public interface PokeApiService {
    @GET("pokemon/{id}/")
    Call<Pokemon> getPokemon(@Path("id") String id);

    @GET("pokemon/{id}/")
    Observable<Pokemon> getRxPokemon(@Path("id") String id);
}
