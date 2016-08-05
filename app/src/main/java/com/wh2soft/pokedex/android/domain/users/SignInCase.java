package com.wh2soft.pokedex.android.domain.users;

/**
 * Created by wilmer on 26/07/16.
 */
public interface SignInCase {

    int PROVIDER_GOOGLE = 447;
    int PROVIDER_FACEBOOK = 413;

    void performSignIn(String email, String password, OnSignInCancelledListener callback);
    void performSignIn(int providerCode, OnSignInCancelledListener callback);
    
}
