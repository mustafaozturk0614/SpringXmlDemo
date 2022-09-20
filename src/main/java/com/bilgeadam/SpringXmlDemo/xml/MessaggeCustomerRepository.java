package com.bilgeadam.SpringXmlDemo.xml;

public class MessaggeCustomerRepository implements ICustomerRepository {


    @Override
    public void sendNotification() {

        System.out.println("Müşteriye msj atıldı");

    }
}
