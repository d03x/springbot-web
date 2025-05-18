package com.dadandev.app.repository;

import org.springframework.stereotype.Repository;
import org.springframework.jdbc.core.JdbcTemplate;

@Repository
public class SchoolRepository {
    private final JdbcTemplate jdbctemplate;
}
