package com.bilgeadam.SpringXmlDemo.firstExample;

public class CustomerService {


// 1 kısım
//    MessaggeCustomerRepository customerRepository;
    ICustomerRepository iCustomerRepository;

    public CustomerService(ICustomerRepository iCustomerRepository) {

        this.iCustomerRepository = iCustomerRepository;

    }

    public void sendNotification(){

        iCustomerRepository.sendNotification();
    }

//    public void sendMessage(){
//        customerRepository=new MessaggeCustomerRepository();
//        customerRepository.sendMessage();
//    }


//    public void sendMessage2(int type){
//        customerRepository=new MessaggeCustomerRepository();
//        customerRepository.sendMessage2(type);
//
//    }

    // 2.kısım interface ekledikten sonra




}
