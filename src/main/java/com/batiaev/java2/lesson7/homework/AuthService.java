package com.batiaev.java2.lesson7.homework;

/**
 * AuthService
 *
 * @author anton
 * @since 06/11/17
 */
public interface AuthService {

    String getNick(String login, String pass);

    boolean login(String login, String pass);

    boolean contains(String userName);
}
