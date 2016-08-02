package com.wh2soft.modules.model.api;

import com.wh2soft.modules.model.entities.Pokemon;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

/**
 * Created by wilmer on 1/08/16.
 */
public interface PokeApiService {
    @GET("pokemon/{id}/")
    Call<Pokemon> getPokemon(@Path("id") String id);

}
