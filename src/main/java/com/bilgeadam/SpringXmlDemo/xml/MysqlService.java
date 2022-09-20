package com.bilgeadam.SpringXmlDemo.xml;

public class MysqlService {


    IDatabaseRepository databaseRepository;


    public MysqlService(IDatabaseRepository databaseRepository) {
        this.databaseRepository = databaseRepository;
    }



    public void  logToDatabase(){

        databaseRepository.logToDatabase();
    }


}
