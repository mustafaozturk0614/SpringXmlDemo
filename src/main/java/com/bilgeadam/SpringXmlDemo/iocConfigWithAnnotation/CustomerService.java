package com.bilgeadam.SpringXmlDemo.iocConfigWithAnnotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class CustomerService {
    @Autowired
    @Qualifier("mail")
    ICustomerRepository iCustomerRepository;

    // constructor injection
//    public CustomerService(ICustomerRepository iCustomerRepository) {
//
//        this.iCustomerRepository = iCustomerRepository;
//
//    }

    public void sendNotification(){

        iCustomerRepository.sendNotification();
    }




}
