package com.liuyisi.springbootspittr.entity;


import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;

public class SpittleRowMapper implements RowMapper<Spittle> {


    @Override
    public Spittle mapRow(ResultSet resultSet, int i) throws SQLException {
        String message = resultSet.getString("message");
        Date time = resultSet.getDate("time");
        Double latitude = resultSet.getDouble("latitude");
        Double longtitude = resultSet.getDouble("longtitude");
        return new Spittle(message, time, latitude, longtitude);
    }
}
