package com.liuyisi.springbootspitter.service;

import com.liuyisi.springbootspitter.entity.Spitter;

public interface SpitterService {
    void save(Spitter spitter);

    Spitter findByUsername(String username);

    Boolean findUserExistByUsername(String username);
}
