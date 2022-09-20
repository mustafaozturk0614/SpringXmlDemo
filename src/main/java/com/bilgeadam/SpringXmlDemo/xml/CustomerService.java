package com.bilgeadam.SpringXmlDemo.xml;

public class CustomerService {

    ICustomerRepository iCustomerRepository;

    public CustomerService(ICustomerRepository iCustomerRepository) {

        this.iCustomerRepository = iCustomerRepository;

    }

    public void sendNotification(){

        iCustomerRepository.sendNotification();
    }




}
