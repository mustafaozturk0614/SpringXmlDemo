package com.bilgeadam.SpringXmlDemo.firstExample;

public class MailCustomerRepository implements ICustomerRepository {



    public void sendMessage(){

        System.out.println("Müşteriye mail atıldı");
    }

    @Override
    public void sendNotification() {
        System.out.println("Müşteriye mail atıldı");
    }
}
