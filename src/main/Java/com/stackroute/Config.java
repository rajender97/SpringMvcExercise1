package com.stackroute;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.view.InternalResourceViewResolver;


    @Configuration
    @ComponentScan({"com.stackroute"})
   public class Config {

        @Bean
        public InternalResourceViewResolver viewResolver(){
            InternalResourceViewResolver mv = new InternalResourceViewResolver();
            mv.setSuffix(".jsp");
            return mv;
        }
    }

