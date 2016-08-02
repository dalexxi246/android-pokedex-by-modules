package com.wh2soft.modules.domain;

import com.wh2soft.modules.domain.users.OnSignInCancelledListener;
import com.wh2soft.modules.domain.users.SignInCase;
import com.wh2soft.modules.domain.users.SignInCaseImpl;
import com.wh2soft.modules.model.users.UsersRepository;
import com.wh2soft.modules.model.users.events.UserEvent;

public class Main {

    private SignInCase signInCase;
    private UsersRepository repository;

    public static void main(String... Args){
        System.out.println("Prueba de un Modulo independiente");
        UsersRepository usersRepository = new UsersRepository() {
            @Override
            public void subscribe() {

            }

            @Override
            public void unsubscribe() {

            }

            @Override
            public void signUp(String email, String password) {
                throw new UnsupportedOperationException("WARNING!!! ... Not yet implemented");
                /*
                if (email.equals("walex6hh@gmail.com")){
                    System.out.println("PASO 1 CORRECTO... validando Password");
                    if (password.equals("themixer246")){
                        System.out.println("PASO 2 CORRECTO... Creando Usuario");
                    } else {
                        System.out.println("PASSWORD INCORRECTO");
                    }
                } else {
                    System.out.println("EMAIL INCORRECTO");
                }
                */
            }

            @Override
            public void signIn(String email, String password) {
                if (email.equals("walex6hh@gmail.com")){
                    System.out.println("PASO 1 CORRECTO... validando Password");
                    if (password.equals("themixer246")){
                        System.out.println("PASO 2 CORRECTO... Creando Usuario");
                    } else {
                        System.out.println("PASSWORD INCORRECTO");
                    }
                } else {
                    System.out.println("EMAIL INCORRECTO");
                }
            }

            @Override
            public void connectWithFacebook() {

            }

            @Override
            public void connectWithGoogle() {

            }

            @Override
            public void post(UserEvent event) {

            }
        };
        SignInCase signInCase = new SignInCaseImpl(usersRepository);
        signInCase.performSignIn("walex6hh@gmail.com", "themixer246", new OnSignInCancelledListener() {
            @Override
            public void onError(int errorCode) {
                switch (errorCode){
                    case OnSignInCancelledListener.ERROR_EMPTY_EMAIL_FIELD:
                        System.out.println("Error: Email no ingresado");
                        break;
                    case OnSignInCancelledListener.ERROR_EMPTY_PASSWORD_FIELD:
                        System.out.println("Error: Password no ingresado");
                        break;
                    case OnSignInCancelledListener.ERROR_MALFORMED_EMAIL_FIELD:
                        System.out.println("Error: No es un email valido");
                        break;
                    case OnSignInCancelledListener.ERROR_MALFORMED_PASSWORD:
                        System.out.println("Error: Password no cumple con rango de caracteres");
                }
            }
        });
    }
}
