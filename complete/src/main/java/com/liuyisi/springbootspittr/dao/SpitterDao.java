package com.liuyisi.springbootspittr.dao;

import com.liuyisi.springbootspittr.entity.Spitter;

public interface SpitterDao {
    void save(Spitter spitter);

    Spitter findByUsername(String username);

    Boolean findUserExistByUsername(String username);

    boolean validateLogin(Spitter spitter);
}
