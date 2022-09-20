package com.bilgeadam.SpringXmlDemo.xml;

public class MailCustomerRepository implements ICustomerRepository {



    @Override
    public void sendNotification() {
        System.out.println("Müşteriye mail atıldı");
    }
}
