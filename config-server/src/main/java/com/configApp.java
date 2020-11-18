package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * @创建人：京城川少
 * @创建时间：2020/11/17
 * @描述
 */
@SpringBootApplication
@EnableConfigServer
public class configApp {
    public static void main(String[] args) {
        SpringApplication.run(configApp.class);
    }
}
