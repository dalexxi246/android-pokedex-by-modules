package com.wh2soft.pokedex.util.patterns.observer;

public class ObservadorImplInformante implements Observador {
    @Override
    public void actualizar(String accion, String lugar) {
        System.out.println("Informando al Jefe, Accion: " + accion + ", Lugar: " + lugar);
    }
}
