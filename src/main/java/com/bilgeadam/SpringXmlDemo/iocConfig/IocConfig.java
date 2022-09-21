package com.bilgeadam.SpringXmlDemo.iocConfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.bilgeadam.SpringXmlDemo.iocConfig")
public class IocConfig {

    @Bean
    public  ICustomerRepository notification(){
        return  new MessaggeCustomerRepository();
    }
    @Bean
    public  CustomerService service(){
        return  new CustomerService(notification());
    }


}
