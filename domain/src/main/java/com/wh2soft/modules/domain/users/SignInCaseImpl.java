package com.wh2soft.modules.domain.users;

import com.wh2soft.modules.common.util.ValidateStrings;
import com.wh2soft.modules.model.users.UsersRepository;

/**
 * Created by wilmer on 27/07/16.
 */
public class SignInCaseImpl implements SignInCase {

    UsersRepository repository;

    public SignInCaseImpl(UsersRepository repository) {
        this.repository = repository;
    }

    @Override
    public void performSignIn(String email, String password, OnSignInCancelledListener callback) {
        boolean validated = true;

        if (email.isEmpty()) {
            validated = false;
            callback.onError(OnSignInCancelledListener.ERROR_EMPTY_EMAIL_FIELD);
        }

        if (validated) {
            if (password.isEmpty()) {
                validated = false;
                callback.onError(OnSignInCancelledListener.ERROR_EMPTY_PASSWORD_FIELD);
            }
        }

        if (validated) {
            if (!ValidateStrings.isValidPassword(password, 3, 12)) {
                validated = false;
                callback.onError(OnSignInCancelledListener.ERROR_MALFORMED_PASSWORD);
            }
        }

        if (validated) {
            if (!ValidateStrings.isValidEmailAddress(email)) {
                validated = false;
                callback.onError(OnSignInCancelledListener.ERROR_MALFORMED_EMAIL_FIELD);
            }
        }

        if (validated) {
            repository.signIn(email, password);
        }
    }

    @Override
    public void performSignIn(int providerCode, OnSignInCancelledListener callback) {

    }
}
