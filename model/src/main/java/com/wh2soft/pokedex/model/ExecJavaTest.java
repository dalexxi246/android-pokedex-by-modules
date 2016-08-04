package com.wh2soft.pokedex.model;

import com.wh2soft.pokedex.model.api.PokeApiClient;
import com.wh2soft.pokedex.model.api.PokeApiService;
import com.wh2soft.pokedex.model.entities.Pokemon;

import java.util.Random;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class ExecJavaTest {

    public static void main(String... args) {
        // DI
        PokeApiClient client = new PokeApiClient();
        PokeApiService service = client.getPokeApiService();

        // Domain (Genera numero random y envia como parametro al Repository)
        // - Cuando el Use Case sea "Detalle de pokemon" se le envia al Repository un ID definido.
        int random = new Random().nextInt(Pokemon.POKEMON_MAX_NUMBER);
        System.out.println(random);

        // Model (Solicitud al API con un ID como parametro)
        Call<Pokemon> call = service.getPokemon(random + "");
        call.enqueue(new Callback<Pokemon>() {
            @Override
            public void onResponse(Call<Pokemon> call, Response<Pokemon> response) {
                Pokemon pokemon = response.body();
                System.out.println(pokemon.toString());
                System.out.println(pokemon.getImageURL());
                System.exit(0);
                // Model (Emitir un evento con los datos obtenidos)
            }

            @Override
            public void onFailure(Call<Pokemon> call, Throwable t) {
                System.out.println(t.getLocalizedMessage());
                System.exit(0);
                // Model (Emitir un evento con el error)
            }
        });
    }

}
