package com.wh2soft.pokedex.util.patterns.observer;

import java.util.ArrayList;

public class Sujeto {
    private ArrayList<Observador> observadores;
    private String accion;
    private String lugar;

    public Sujeto() {
        observadores = new ArrayList<>();
    }

    public void registrarObs(Observador o) {
        observadores.add(o);
    }

    public void desregistrarObs(Observador o) {
        observadores.remove(o);
    }

    public void accion1(String a, String l) {
        this.accion = a;
        this.lugar = l;
        notificarObs();
    }

    public void notificarObs() {
        for (Observador o : observadores) {
            o.actualizar(this.accion, this.lugar);
        }
    }

    public void notificarObs(onActionCompleteListener callback) {
        for (Observador o : observadores) {
            o.actualizar(this.accion, this.lugar);
        }
        callback.onActionCompleted();
    }

    public interface onActionCompleteListener {
        void onActionCompleted();
    }
}
