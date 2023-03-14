package org.twl;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("org.twl.dao")
public class YkApplication {

    public static void main(String[] args) {
        SpringApplication.run(YkApplication.class, args);
    }

}
