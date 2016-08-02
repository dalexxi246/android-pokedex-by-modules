package com.wh2soft.modules.model.users;

import com.wh2soft.modules.common.libs.base.EventBus;
import com.wh2soft.modules.model.users.events.UserEvent;

/**
 * Created by wilmer on 28/07/16.
 */
public class UsersRepositoryImpl implements UsersRepository {

    private EventBus eventBus;

    @Override
    public void subscribe() {

    }

    @Override
    public void unsubscribe() {

    }

    @Override
    public void signUp(String email, String password) {

    }

    @Override
    public void signIn(String email, String password) {

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
}
