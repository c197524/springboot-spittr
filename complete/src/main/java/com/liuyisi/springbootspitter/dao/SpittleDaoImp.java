package com.liuyisi.springbootspitter.dao;

import com.liuyisi.springbootspitter.entity.Spittle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class SpittleDaoImp implements SpittleDao {


    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Autowired
    private RowMapper<Spittle> spittleRowMapper;

    @Override
    public List<Spittle> queryAllSpittles() {
        String sql = "select * from spittle";
        System.out.println(jdbcTemplate);
        return jdbcTemplate.query(sql, spittleRowMapper);
    }

    @Override
    public Spittle findOne(long spittleId) {
        String sql = "select * from spittle where id=?";
        return jdbcTemplate.queryForObject(sql, spittleRowMapper, spittleId);
    }


}
