package com.wh2soft.modules.model.users.events;

import com.wh2soft.modules.model.entities.User;

/**
 * Created by wilmer on 27/07/16.
 */
public class UserEvent {

    public static final int LOGIN_SUCESSFULL = 837;
    public static final int LOGIN_FAILED = 653;
    public static final int LOGIN_FAILED_EMAIL_INVALID_USER = 774;
    public static final int LOGIN_FAILED_EMAIL_INVALID_PASSWORD = 721;
    public static final int LOGIN_CANCELLED = 347;
    public static final int LOGIN_NEEDED = 832;

    private int type;
    private User user;
    private int errorCode;

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public int getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(int errorCode) {
        this.errorCode = errorCode;
    }
}
