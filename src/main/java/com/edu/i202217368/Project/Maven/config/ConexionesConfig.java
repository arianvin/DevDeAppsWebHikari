package com.edu.i202217368.Project.Maven.config;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConexionesConfig {

    @Value("${DB_SAKILA_URL}")
    private String dbSakilaUrl;
    @Value("${DB_SAKILA_USER}")
    private String dbSakilaUser;
    @Value("${DB_SAKILA_PASS}")
    private String dbSakilaPass;
    @Value("${DB_SAKILA_DRIVER}")
    private String dbSakilaDriver;


    @Bean
    public HikariDataSource hikariDataSource(){

        HikariConfig config = new HikariConfig();

        //Configurando conexion a BD
        config.setJdbcUrl(dbSakilaUrl);
        config.setUsername(dbSakilaUser);
        config.setPassword(dbSakilaPass);
        config.setDriverClassName(dbSakilaDriver);

        //configuracion hikaricp
        config.setMaximumPoolSize(30);  //número maximo de conexiones
        config.setMinimumIdle(4);       //número minimo de conexiones
        config.setIdleTimeout(240000); //4 minutos
        config.setConnectionTimeout(45000); //45 segundos pool espera conexion antes de lanzar exception

        System.out.println("###### HikariCP initialized ######");
        return new HikariDataSource(config);
    }


}
