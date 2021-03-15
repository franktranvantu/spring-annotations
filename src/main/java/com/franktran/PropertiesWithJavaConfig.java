package com.franktran;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;

@Configuration
//@PropertySource("classpath:foo.properties")
//@PropertySource("classpath:bar.properties")
//@PropertySources({
//        @PropertySource("classpath:foo.properties"),
//        @PropertySource("classpath:bar.properties")
//})
@PropertySource({"classpath:persistence-${envTarget:mysql}.properties"})
public class PropertiesWithJavaConfig {

    @Value("${db-name}")
    private String dbName;

    @Override
    public String toString() {
        return "PropertiesWithJavaConfig{" +
                "dbName='" + dbName + '\'' +
                '}';
    }
}
