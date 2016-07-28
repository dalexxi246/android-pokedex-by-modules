package com.wh2soft.modules.model.users;

import com.wh2soft.modules.model.users.events.UserEvent;

/**
 * Created by wilmer on 27/07/16.
 */
public interface UsersRepository {

    void subscribe();

    void unsubscribe();

    void signUp(String email, String password);

    void signIn(String email, String password);

    void connectWithProvider(int providerCode);

    void post(UserEvent event);
}
