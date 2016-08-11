package com.wh2soft.pokedex.android.util.patterns;

import com.wh2soft.pokedex.android.util.patterns.observer.Observador;
import com.wh2soft.pokedex.android.util.patterns.observer.ObservadorImplAuditor;
import com.wh2soft.pokedex.android.util.patterns.observer.ObservadorImplCorreo;
import com.wh2soft.pokedex.android.util.patterns.observer.ObservadorImplInformante;
import com.wh2soft.pokedex.android.util.patterns.observer.Sujeto;

import java.util.Scanner;

public class ObserverTest {

    Sujeto sujeto;
    Observador correo;
    Observador auditor;
    Observador informante;

    public static void main(String... args) {
        ObserverTest test = new ObserverTest();
        test.ejecutarPrueba();
    }

    public void ejecutarPrueba() {
        sujeto = new Sujeto();
        correo = new ObservadorImplCorreo();
        auditor = new ObservadorImplAuditor();
        informante = new ObservadorImplInformante();
        String accion = "", lugar = "";
        int opAccion;

        Scanner sc = new Scanner(System.in);

        do {
            escribeMenu();
            opAccion = sc.nextInt();
            sc = new Scanner(System.in);
            switch (opAccion) {
                case 1:
                    System.out.println("Escribe la Accion");
                    accion = sc.nextLine();
                    System.out.println("Escribe el lugar");
                    lugar = sc.nextLine();
                    sujeto.accion1(accion, lugar);
                    break;
                case 2:
                    escribeSeleccion();
                    agregaObservador(sc.nextInt());
                    break;
                case 3:
                    escribeSeleccion();
                    retiraObservador(sc.nextInt());
                    break;
                case 0:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opcion Errada !!!");
            }
        } while (opAccion != 0);
    }

    public void agregaObservador(int o) {
        boolean ok = true;
        switch (o) {
            case 1:
                sujeto.registrarObs(correo);
                break;
            case 2:
                sujeto.registrarObs(auditor);
                break;
            case 3:
                sujeto.registrarObs(informante);
                break;
            default:
                ok = false;
                System.out.println("Opcion Errada!!!");
        }
        if (ok) System.out.println("Observador agregado");
    }

    public void retiraObservador(int o) {
        boolean ok = true;
        switch (o) {
            case 1:
                sujeto.desregistrarObs(correo);
                break;
            case 2:
                sujeto.desregistrarObs(auditor);
                break;
            case 3:
                sujeto.desregistrarObs(informante);
                break;
            default:
                ok = false;
                System.out.println("Opcion Errada!!!");
        }
        if (ok) System.out.println("Observador retirado.");
    }

    public void escribeMenu() {
        System.out.println("***************************");
        System.out.println("* Escoge una opcion       *");
        System.out.println("* 1. Realizar accion.     *");
        System.out.println("* 2. Agregar observador.  *");
        System.out.println("* 3. Retirar observador.  *");
        System.out.println("* 0. Salir.               *");
        System.out.println("***************************");
    }

    public void escribeSeleccion() {
        System.out.println("***************************");
        System.out.println("* Escoge una opcion       *");
        System.out.println("* 1. Enviar Correo.       *");
        System.out.println("* 2. Registrar Auditoria. *");
        System.out.println("* 3. Informar al Jefe.    *");
        System.out.println("***************************");
    }
}
