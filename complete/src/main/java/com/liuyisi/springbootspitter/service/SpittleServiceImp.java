package com.liuyisi.springbootspitter.service;

import com.liuyisi.springbootspitter.dao.SpittleDao;
import com.liuyisi.springbootspitter.entity.Spittle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SpittleServiceImp implements SpittleService {


    @Autowired
    private SpittleDao spittleDao;

    @Override
    public List<Spittle> queryAllSpittles() {
        return spittleDao.queryAllSpittles();
    }

    @Override
    public Spittle findOne(long spittleId) {
        return spittleDao.findOne(spittleId);
    }
}
