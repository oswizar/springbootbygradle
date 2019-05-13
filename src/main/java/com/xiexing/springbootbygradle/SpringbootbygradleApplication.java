package com.xiexing.springbootbygradle;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
@Slf4j
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class SpringbootbygradleApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootbygradleApplication.class, args);
        log.info("Service Started Successfully");
    }

}
