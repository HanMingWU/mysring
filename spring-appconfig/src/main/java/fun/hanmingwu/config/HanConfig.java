package fun.hanmingwu.config;

import fun.hanmingwu.pojo.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
@ComponentScan(value = "fun.hanmingwu.pojo")
@Configuration
public class HanConfig {
    @Bean
    public User getUser(){
        return new User();
    }
}
