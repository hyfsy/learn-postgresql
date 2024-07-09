package com.hyf.postgresql;

import com.hyf.postgresql.mapper.UserMapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * @author baB_hyf
 * @date 2022/09/13
 */
@MapperScan("com.hyf.postgresql.mapper")
@SpringBootApplication
public class PostgreSQLApplication {
    public static void main(String[] args) {
        SpringApplication.run(PostgreSQLApplication.class, args);
    }

    @Component
    public static class UserQuery implements CommandLineRunner {

        @Resource
        private UserMapper userMapper;

        @Override
        public void run(String... args) throws Exception {
            System.out.println(userMapper.queryAll());
        }
    }
}
