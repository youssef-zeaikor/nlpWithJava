package org.example;


import com.scraping.project.module.emploi.DataBaseEmploi;
import com.scraping.project.module.emploi.EmploiModule;
import com.scraping.project.module.rekrute.Database;
import com.scraping.project.module.rekrute.Rekrute;
import com.scraping.project.module.rekrute.SqlDataBase;
import com.scraping.project.repository.emploi.ExtractPostInfoEmp;
import com.scraping.project.repository.rekrute.ExtractPostInfo;

public class Main {
    public static void main(String[] args) {
//         getDataFromEmp();
         getDataFromRecr();


    }
    public static void saveRekrutePostInfo(Rekrute rekrute){
//        Database database = new Database();
//        database.myConnect(rekrute);
        SqlDataBase sqlDataBase = new SqlDataBase();
        sqlDataBase.myConnect(rekrute);
    }
    public static void saveEmploiPostInfo(EmploiModule emploiModule){
        DataBaseEmploi dataBaseEmploi = new DataBaseEmploi();
        dataBaseEmploi.myConnect(emploiModule);
    }
    public static void getDataFromEmp(){
       new ExtractPostInfoEmp();

    }
    public static void getDataFromRecr(){
        new ExtractPostInfo();
    }
}