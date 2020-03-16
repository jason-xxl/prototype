package com.prototype.mvp.configuration;

import javax.sql.DataSource;

import org.jooq.DSLContext;
import org.jooq.SQLDialect;
import org.jooq.impl.DSL;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.jdbc.core.JdbcTemplate;

@Configuration
public class DatabaseSourceConfig {
    @Bean(name = "dbMvp")
    @ConfigurationProperties(prefix = "spring.dbMvp")
    @Primary
    public DataSource createMvpDataSource() {
        return DataSourceBuilder.create().build();
    }

    @Bean(name = "jdbcMvp")
    @Autowired
    public JdbcTemplate createJdbcTemplateMvp(@Qualifier("dbMvp") DataSource dbMvp) {
        return new JdbcTemplate(dbMvp);
    }

    @Bean(name = "dslMvp")
    @Autowired
    public DSLContext createDslContext(@Qualifier("dbMvp") DataSource dbMvp) {
        return DSL.using(dbMvp, SQLDialect.POSTGRES);
    }
}