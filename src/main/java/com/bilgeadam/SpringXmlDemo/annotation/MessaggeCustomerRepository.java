package com.bilgeadam.SpringXmlDemo.annotation;


import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Qualifier("message")
public class MessaggeCustomerRepository implements ICustomerRepository {


    @Override
    public void sendNotification() {

        System.out.println("Müşteriye msj atıldı");

    }
}
