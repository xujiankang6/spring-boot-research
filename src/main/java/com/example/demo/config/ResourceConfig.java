package com.example.demo.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * Resource
 *
 * @author jiankang.xu
 * @date 2021/8/28
 */
@Configuration
@ConfigurationProperties(prefix = "com")
@PropertySource(value="classpath:resource.properties")
public class ResourceConfig {


    @Value("${name:jiankang}")
    private String name;

    @Value("${phone:111}")
    private String phone;

    @Value("${language:python}")
    private String language;

    @Value("${address:chinese}")
    private String address;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getAddress() {
        return address;
    }
}
