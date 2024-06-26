package com.ollie.clouddentistbackend;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.ollie.clouddentistbackend.mapper")
@SpringBootApplication
public class CloudDentistBackendApplication {

    public static void main(String[] args) {
        SpringApplication.run(CloudDentistBackendApplication.class, args);
    }

}
