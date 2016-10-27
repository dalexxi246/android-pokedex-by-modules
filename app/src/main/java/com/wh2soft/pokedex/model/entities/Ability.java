package com.wh2soft.pokedex.model.entities;

import com.google.gson.annotations.SerializedName;

/**
 * Created by wilmer on 26/10/16.
 */

public class Ability {

    @SerializedName("slot")
    private int slot;

    @SerializedName("is_hidden")
    private boolean is_hidden;

    public int getSlot() {
        return slot;
    }

    public void setSlot(int slot) {
        this.slot = slot;
    }

    public boolean is_hidden() {
        return is_hidden;
    }

    public void setIs_hidden(boolean is_hidden) {
        this.is_hidden = is_hidden;
    }

    @Override
    public String toString() {
        return "Ability{" +
                "slot=" + slot +
                ", is_hidden=" + is_hidden +
                '}';
    }
}