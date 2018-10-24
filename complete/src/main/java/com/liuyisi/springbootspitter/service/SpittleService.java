package com.liuyisi.springbootspitter.service;

import com.liuyisi.springbootspitter.entity.Spittle;

import java.util.List;

public interface SpittleService {
    List<Spittle> queryAllSpittles();

    Spittle findOne(long spittleId);
}
