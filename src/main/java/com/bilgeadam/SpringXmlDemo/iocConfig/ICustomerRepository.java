package com.bilgeadam.SpringXmlDemo.iocConfig;

import org.springframework.stereotype.Component;

@Component
public interface ICustomerRepository {

    void sendNotification();

}
