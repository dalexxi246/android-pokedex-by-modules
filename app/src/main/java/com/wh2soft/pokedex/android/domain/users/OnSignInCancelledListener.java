package com.wh2soft.pokedex.android.domain.users;

/**
 * Created by wilmer on 27/07/16.
 */
public interface OnSignInCancelledListener {

    int ERROR_EMPTY_EMAIL_FIELD = 688;
    int ERROR_EMPTY_PASSWORD_FIELD = 847;
    int ERROR_MALFORMED_EMAIL_FIELD = 77;
    int ERROR_MALFORMED_PASSWORD = 289;

    void onError(int errorCode);

}
