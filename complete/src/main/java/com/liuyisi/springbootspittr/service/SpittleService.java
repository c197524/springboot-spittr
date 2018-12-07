package com.liuyisi.springbootspittr.service;

import com.liuyisi.springbootspittr.entity.Spittle;

import java.util.List;

public interface SpittleService {
    List<Spittle> queryAllSpittles();

    Spittle findOne(long spittleId);
}
