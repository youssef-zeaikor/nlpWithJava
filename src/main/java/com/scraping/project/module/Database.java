package com.scraping.project.module;

import java.sql.*;
import java.time.ZoneId;
import java.util.Set;

public class Database {
    public static final String SAVE_REKRUTE_SQL =
            "INSERT INTO PEOPLE (URL_POST,DATE_PUBLICATION,DATE_POSTLUER" +
                    ",TITLE,SECTEUR,NOM_ENT,TELETRAVAIL,CONTRAT,NIVEAU,REGION,EXP_REQUISE," +
                    "TRAIS_PERSONNALITE,DESCRIPTION_ENT,POST_DESC,PROFIL_RECH,ADDRESS)" +
            " VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";

    private Connection connection;
    public void myConnect(Rekrute rekrute){
        try {
            connection = DriverManager.getConnection("jdbc:h2:~/peopletest".replace("~", System.getProperty("user.home")));
            connection.setAutoCommit(false);//don't register this changes in database
            System.out.println("------------");
        } catch (
                SQLException e) {
            if(connection == null){
                System.out.println("-----------------error------------------");

            }
            throw new RuntimeException(e);
        }
        try {
            //PreparedStatement we can bind values to thes question mark
            PreparedStatement ps = connection.prepareStatement(SAVE_REKRUTE_SQL, Statement.RETURN_GENERATED_KEYS);
            //setString take two parameters index 1 => means first question mark
            ps.setString(1,rekrute.getUrlPost());
            ps.setString(2,rekrute.getDatePublication());
            ps.setString(3,rekrute.getDatePostuler());
            ps.setString(4,rekrute.getTitle());
            ps.setString(5,rekrute.getSecteurActivite());
            ps.setString(6,rekrute.getNomEntreprise());
            ps.setString(8,rekrute.getTeletravail());
            ps.setString(9,rekrute.getContrat());
            ps.setString(10,rekrute.getNiveau());
            ps.setString(11,rekrute.getRegion());
            ps.setString(13,rekrute.getExpRequise());
            ps.setString(14,rekrute.getTraitsPersonnalite());
            ps.setString(15,rekrute.getDescriptionEntreprise());
            ps.setString(16,rekrute.getPostDesc());
            ps.setString(17,rekrute.getProfilRecherche());
            ps.setString(18,rekrute.getAddress());
            int recordsEffected= ps.executeUpdate();
            System.out.println(recordsEffected);
            //Think of a result set as a two dimension array
            ResultSet rs = ps.getGeneratedKeys();
            while (rs.next()){
                long id = rs.getLong(1);
                p.setId(id);
                System.out.println(p);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }


}
