package org.example;


import com.scraping.project.module.Database;
import com.scraping.project.module.Rekrute;
import com.scraping.project.repository.ExtractPostInfo;
import com.scraping.project.repository.ExtractPostsLinks;

public class Main {
    public static void main(String[] args) {
//         new ExtractPostInfo();
        Database database = new Database();
        database.myConnect(new Rekrute());

    }
}