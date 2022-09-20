package com.bilgeadam.SpringXmlDemo.annotation;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
//@Primary
@Qualifier("mail")

public class MailCustomerRepository implements ICustomerRepository {

    @Override
    public void sendNotification() {
        System.out.println("Müşteriye mail atıldı");
    }
}
