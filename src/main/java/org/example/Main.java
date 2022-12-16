package org.example;


import com.scraping.project.module.Database;
import com.scraping.project.module.Rekrute;
import com.scraping.project.module.SqlDataBase;
import com.scraping.project.repository.ExtractPostInfo;
import com.scraping.project.repository.ExtractPostsLinks;

public class Main {
    public static void main(String[] args) {
         new ExtractPostInfo();


    }
    public static void savePostInfo(Rekrute rekrute){
//        Database database = new Database();
//        database.myConnect(rekrute);
        SqlDataBase sqlDataBase = new SqlDataBase();
        sqlDataBase.myConnect(rekrute);
    }
}