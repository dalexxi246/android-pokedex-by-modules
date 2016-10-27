package com.wh2soft.pokedex.model.entities;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

/**
 * Created by wilmer on 1/08/16.
 */
public class Pokemon {
    public static final String POKEMON_IMAGE_URL_BASE = "https://s3-eu-west-1.amazonaws.com/calpaterson-pokemon/";
    public static final String POKEMON_IMAGE_URL_FILE_EXT = ".jpeg";
    public static final int POKEMON_MAX_NUMBER = 721;

    @SerializedName("id")
    private int id;

    @SerializedName("name")
    private String name;

    @SerializedName("abilities")
    private ArrayList<Ability> abilities;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Ability> getAbilities() {
        return abilities;
    }

    public void setAbilities(ArrayList<Ability> abilities) {
        this.abilities = abilities;
    }

    public String getImageURL() {
        return POKEMON_IMAGE_URL_BASE + id + POKEMON_IMAGE_URL_FILE_EXT;
    }

    @Override
    public String toString() {
        return "Pokemon{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", abilities=" + abilities +
                '}';
    }
}
