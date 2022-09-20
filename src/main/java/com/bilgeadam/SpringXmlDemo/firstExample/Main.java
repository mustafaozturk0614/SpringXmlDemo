package com.bilgeadam.SpringXmlDemo.firstExample;


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
        // 1.kısım
//        CustomerService customerService=new CustomerService();
//        customerService.sendMessage();
//        customerService.sendMessage2(2);

        //2 kısım
           ICustomerRepository iCustomerRepository=new MessaggeCustomerRepository();
           CustomerService customerService=new CustomerService(iCustomerRepository);
           customerService.sendNotification();
    }





}
