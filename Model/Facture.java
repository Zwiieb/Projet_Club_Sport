/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import javax.swing.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

/**
 * @author wsi
 */
public class Facture {
    public static Sport SportTemp;
    private String paiement;
    private Personne personneConnectee;
    private String facture = "";

    public Facture(String methode, Personne personneConnectee) {
        super();
        this.paiement = methode;
        this.personneConnectee = personneConnectee;

        // ajout de la date
        Date p = Calendar.getInstance().getTime();
        DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss", Locale.FRENCH);
        String resume = dateFormat.format(p) + "\n \n";

        // ajout du sport
        this.facture += "Sport: " + Facture.SportTemp.getNom() + "\n";

        // ajout du prix
        this.facture += "Prix: " + Facture.SportTemp.getPrix() / this.personneConnectee.getQuotientF() + "\n";

        // ajout du nom
        this.facture += "Mr/Mme: " + this.personneConnectee.getNom() + "\n";

        //ajout nombre enfants
        this.facture += "Nombre Enfants: " + this.personneConnectee.getNbEnfant() + "\n";

        //ajout quotient familial
        this.facture += "Quotient Familial: " + this.personneConnectee.getQuotientF() + "\n";

        // ajout de la méthode de paiement
        this.facture += "Méthode: " + methode + "\n";
    }

    public void Ticket() {
        JOptionPane.showMessageDialog(null, this.facture, "Facture", JOptionPane.PLAIN_MESSAGE);
    }


}