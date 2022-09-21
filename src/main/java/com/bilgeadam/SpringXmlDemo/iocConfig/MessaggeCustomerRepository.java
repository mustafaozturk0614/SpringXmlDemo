package com.bilgeadam.SpringXmlDemo.iocConfig;


import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;


//@Qualifier("message")
public class MessaggeCustomerRepository implements ICustomerRepository {


    @Override
    public void sendNotification() {

        System.out.println("Müşteriye msj atıldı");

    }
}
