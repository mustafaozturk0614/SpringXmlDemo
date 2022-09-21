package com.bilgeadam.SpringXmlDemo.iocConfigWithAnnotation;

import org.springframework.stereotype.Component;

@Component
public interface ICustomerRepository {

    void sendNotification();

}
