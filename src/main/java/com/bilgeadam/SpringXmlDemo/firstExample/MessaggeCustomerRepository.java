package com.bilgeadam.SpringXmlDemo.firstExample;

public class MessaggeCustomerRepository implements ICustomerRepository {



// 1 Kısım
public void sendMessage(){

    System.out.println("Müşteriye msj atıldı");

}

    public void sendMessage2(int type){
        if (type==1){

            System.out.println("Müşteriye msj atıldı");
        }else {

            System.out.println("Müşteriye mail atıldı");
        }

    }


    @Override
    public void sendNotification() {

        System.out.println("Müşteriye msj atıldı");

    }
}
