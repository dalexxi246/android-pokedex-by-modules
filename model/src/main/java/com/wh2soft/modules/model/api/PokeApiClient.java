package com.wh2soft.modules.model.api;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by wilmer on 1/08/16.
 */
public class PokeApiClient {
    private static final String API_BASE_URL = "https://pokeapi.co/api/v2/";
    private Retrofit retrofit;

    public PokeApiClient() {
        this.retrofit = new Retrofit.Builder()
                .baseUrl(API_BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }

    public PokeApiService getPokeApiService() {
        return retrofit.create(PokeApiService.class);
    }
}
