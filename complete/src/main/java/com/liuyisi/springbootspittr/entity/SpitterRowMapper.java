package com.liuyisi.springbootspittr.entity;


import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class SpitterRowMapper implements RowMapper<Spitter> {


    @Override
    public Spitter mapRow(ResultSet resultSet, int i) throws SQLException {
        Spitter spitter = new Spitter();
        spitter.setUsername(resultSet.getString("username"));
        spitter.setPassword(resultSet.getString("password"));
        spitter.setFirstname(resultSet.getString("firstname"));
        spitter.setLastname(resultSet.getString("lastname"));
        return spitter;
    }
}
