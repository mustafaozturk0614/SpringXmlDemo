package com.bilgeadam.SpringXmlDemo.xml;


import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 1kısım
 * Başlangıçta CustomerRepository  CustomerService ve Main sınıflarımızı  Oluşturuyoruz
 * customerRepositorye sendMessage() isimli fonksiyon ekliyoruz ve içine  çıktı olarak
 * Müsteriye msj atıldı çıktısını verecek komutu yazıyoruz
 * Daha sonra CustomerService  bir sendMessage() fonksiyonu yazıp
 * CustomerRepositorydeki sendMessage() fonksiyonunu burada çağırıyoruz
 * Daha sonra Main Clasımızın main metoduna CustomerService clasımızdan sendMessage() metodunu çalıştıryoruz
 *2 kısım
 * * Yeni Seneryomuz mail desteğimiz de olsun bazı musterilerimz mail bazıları msj olarak bildrim
 *  biz ikisinde desteklemek istiyoruz
 *  buna uygun bir bir int type  alan vere type göre 2 çıktıdan bieini veren yeni bir sendMessage fonksiyonu yazınız
 *
 *
 *
 */

public class Main {


    public static void main(String[] args) {

        ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext(
                "applicationContext.xml");

//        MysqlService mysqlService=new MysqlService
//                (context.getBean("database",IDatabaseRepository.class));
//
//        mysqlService.logToDatabase();

//        CustomerService customerService=new CustomerService
//                ( context.getBean("notification",ICustomerRepository.class));
//            customerService.sendNotification();

         CustomerService customerService1=context.getBean("customerservice",CustomerService.class);
            customerService1.sendNotification();




    }





}
