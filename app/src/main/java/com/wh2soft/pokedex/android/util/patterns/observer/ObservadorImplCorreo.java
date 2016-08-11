package com.wh2soft.pokedex.android.util.patterns.observer;

public class ObservadorImplCorreo implements Observador {
    @Override
    public void actualizar(String accion, String lugar) {
        System.out.println("Enviando Correo, Accion: " + accion + ", Lugar: " + lugar);
    }
}
