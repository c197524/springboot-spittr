package com.liuyisi.springbootspittr.dao;

import com.liuyisi.springbootspittr.entity.Spittle;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface SpittleDao {

    List<Spittle> queryAllSpittles();

    Spittle findOne(long spittleId);

}
