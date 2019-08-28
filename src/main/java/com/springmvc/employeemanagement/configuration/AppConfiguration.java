package com.springmvc.employeemanagement.configuration;

import javax.activation.DataSource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class AppConfiguration {
	
	//bean to set a h2 in-memory database
	@Bean
    public DriverManagerDataSource dataSource(
    		@Value("${driver_class_name}") String driverClassName,
    		@Value("${db_url}") String dbUrl,
    		@Value("${db_username}") String dbUsername,
    		@Value("${db_password}") String dbPassword
    		) {
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName(driverClassName);
        dataSource.setUrl(dbUrl);
        dataSource.setUsername(dbUsername);
        dataSource.setPassword(dbPassword);
 
        return dataSource;
    }
}
