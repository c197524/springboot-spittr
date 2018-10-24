package com.liuyisi.springbootspitter.dao;

import com.liuyisi.springbootspitter.entity.Spittle;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface SpittleDao {

    List<Spittle> queryAllSpittles();

    Spittle findOne(long spittleId);

}
