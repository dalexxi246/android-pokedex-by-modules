package com.wh2soft.pokedex.android.util.patterns.observer;

public class ObservadorImplAuditor implements Observador {

    // TODO: Aqui notificaria mediante EventBus el evento "Elemento actualizado"
    // TODO: Un tipo de observador concreto seria para los botones de respuesta, y otro para la imagen del Pokemon
    @Override
    public void actualizar(String accion, String lugar) {
        System.out.println("Guardando en la BD, Accion: " + accion + ", Lugar: " + lugar);
    }
}
