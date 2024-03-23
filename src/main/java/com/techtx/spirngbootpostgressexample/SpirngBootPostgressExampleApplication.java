package com.techtx.spirngbootpostgressexample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController("/")
public class SpirngBootPostgressExampleApplication {

    @Autowired
    JdbcTemplate jdbcTemplate;

    public static void main(String[] args) {
        SpringApplication.run(SpirngBootPostgressExampleApplication.class, args);
    }


    @RequestMapping("/api")
    public String getResponse()
    {
        String date = jdbcTemplate.queryForObject("select current_date", String.class);
        return date;
    }
}
