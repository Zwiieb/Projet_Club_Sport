/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.HashMap;
import java.util.Map;
import java.util.Vector;

import Model.Personne;

/**
 *
 * @author wsi
 */

public class Accueil {
    //dictionnaire des sports
    private static Map<String, Sport> listeSports = new HashMap<String, Sport>();

    public Accueil() {
        new Sport("Natation", 15, " ProfN");
        new Sport("Dance", 15, " ProfB");
        new Sport("Fitness", 20, " ProfF");
        new Sport("FootBall", 10, " ProfN");
        Personne pers =  new Personne("a","a","a","a","a","a","a","a")  ;
                 Mairie.getListPers().add(pers)    ;
         /*
        for (String listeSports : this.listeSports) {
            String name = listeSports.get(name);

            System.out.println("Phone Number: " + phoneNumber + " ==> Name: " + name);
            System.out.println(Natation.getPrix());
        }
        */
    }

    public static Map<String, Sport> getListeSports() {
        return listeSports;
    }
}
