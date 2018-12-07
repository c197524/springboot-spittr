package com.liuyisi.springbootspittr.service;

import com.liuyisi.springbootspittr.entity.Spitter;

public interface SpitterService {
    void save(Spitter spitter);

    Spitter findByUsername(String username);

    Boolean findUserExistByUsername(String username);

    boolean validateLogin(Spitter spitter);
}
