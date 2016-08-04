package com.wh2soft.pokedex.common.libs.base;

/**
 * Created by wilmer on 27/07/16.
 */
public interface EventBus {
    // TODO Realizar DI de librerias.
    void register(Object subscriber);
    void unregister(Object subscriber);
    void post(Object event);
}