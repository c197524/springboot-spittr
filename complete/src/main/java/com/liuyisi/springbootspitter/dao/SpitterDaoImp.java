package com.liuyisi.springbootspitter.dao;

import com.liuyisi.springbootspitter.entity.Spitter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;


@Repository
public class SpitterDaoImp implements SpitterDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Autowired
    private RowMapper<Spitter> spitterRowMapper;


    public void save(Spitter spitter) {
        String sql = "insert into spitter(username,password,firstname,lastname) value(?,?,?,?)";
        jdbcTemplate.update(sql, spitter.getUsername(), spitter.getPassword(), spitter.getFirstname(), spitter.getLastname());
    }

    @Override
    public Spitter findByUsername(String username) {
        String sql = "select * from spitter where username=?";
        return jdbcTemplate.queryForObject(sql, spitterRowMapper, username);
    }

    @Override
    public Boolean findUserExistByUsername(String username) {
        String sql = "select count(*) from spitter where username=?";
        return jdbcTemplate.queryForObject(sql, Long.class, username) > 0 ? true : false;
    }


}
