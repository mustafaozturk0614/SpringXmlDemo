package com.bilgeadam.SpringXmlDemo.xml;

public class MySqlRepository implements IDatabaseRepository {


    @Override
    public void logToDatabase() {
        System.out.println("MySql'e loglandı");
    }
}
