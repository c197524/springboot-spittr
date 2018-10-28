package com.liuyisi.springbootspitter.service;

import com.liuyisi.springbootspitter.dao.SpitterDao;
import com.liuyisi.springbootspitter.entity.Spitter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SpitterServiceImp implements SpitterService {

    @Autowired
    private SpitterDao spitterDao;

    @Override
    public void save(Spitter spitter) {
        spitterDao.save(spitter);
    }

    @Override
    public Spitter findByUsername(String username) {
        return spitterDao.findByUsername(username);
    }

    @Override
    public Boolean findUserExistByUsername(String username) {
        return spitterDao.findUserExistByUsername(username);
    }

    @Override
    public boolean validateLogin(Spitter spitter) {
        return spitterDao.validateLogin(spitter);
    }
}
