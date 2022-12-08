package com.scraping.project.repository;

import com.scraping.project.module.Rekrute;

import java.util.Map;
import java.util.stream.Stream;

public class Split5Info {
    public static void splitInfo(Map<String,String> info, Rekrute rekrute){
        info.entrySet().stream().forEach( e -> {
            if (e.getKey().equals("Type de contrat")){
                rekrute.setContrat(e.getValue());
            }
            if (e.getKey().equals("Niveau d'étude et formation")){
                rekrute.setNiveau(e.getValue());
            }
            if (e.getKey().equals("Région")){
                rekrute.setRegion(e.getValue());
            }
            if (e.getKey().equals("Expérience requise")){
                rekrute.setExpRequise(e.getValue());
            }
            if (e.getKey().equals("Type de contrat")){
                rekrute.setContrat(e.getValue());
            }if (e.getKey().equals("Télétravail")){
                rekrute.setTeletravail(e.getValue());
            }


        });


    }
    public static void diplome(Map<String,String> info){
        info.entrySet().stream().filter(v -> v.getKey().contains("Niveau d'étude et formation")).
                map(s -> s.getValue()).
                map(s -> {
                    String[] dip = s.split("-");
                    try {
                        if (dip.length > 2){
                            return  dip[1].concat(dip[2]) ;
                        }
                        if (dip.length ==2){
                            return  dip[1];
                        }
                        else {
                            return s;
                        }
                    }catch (Exception e){
                        System.out.println(e);
                        return "";
                    }
                }).
                forEach(System.out::println);
    }
}
