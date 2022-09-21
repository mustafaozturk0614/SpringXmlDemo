package com.bilgeadam.SpringXmlDemo.iocConfig;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;


//@Primary
//@Qualifier("mail")

public class MailCustomerRepository implements ICustomerRepository {

    @Override
    public void sendNotification() {
        System.out.println("Müşteriye mail atıldı");
    }
}
