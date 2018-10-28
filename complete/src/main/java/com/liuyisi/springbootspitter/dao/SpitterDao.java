package com.liuyisi.springbootspitter.dao;

import com.liuyisi.springbootspitter.entity.Spitter;

public interface SpitterDao {
    void save(Spitter spitter);

    Spitter findByUsername(String username);

    Boolean findUserExistByUsername(String username);

    boolean validateLogin(Spitter spitter);
}
