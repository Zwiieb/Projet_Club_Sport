package Controleurs;


import Model.*;
import Vues.VueFacture;
import Vues.VueInscription;
import Vues.VueLogin;
import Vues.VueSport;

import javax.swing.*;
import java.util.HashMap;
import java.util.Map;


public class Controleur {

    private Personne PersonneConnectee;
    private Mairie mairie;
    Map<String, JFrame> listePages = new HashMap<String, JFrame>();

    public Controleur() {
        this.mairie = new Mairie();
        this.listePages = new HashMap<>();
    }


    public void lancement_inscription(JFrame actuel) {
        // rend invisible la a fenêt actuelle et ouvre celle voulue
        actuel.setVisible(false);
        VueInscription g = new VueInscription(this);
        g.setVisible(true);
    }

    public void lancement_connexion(JFrame actuel) {
        // rend invisible la a fenêt actuelle et ouvre celle voulue
        actuel.setVisible(false);
        VueLogin l = new VueLogin(this);
        l.setVisible(true);
    }

    public void testConnexion(JFrame actuel, String itemSelected, String mdp) {
        boolean persExist = false;
        boolean log_bon = false;
        for (var pers : Mairie.getListPers()) {
            System.out.println(pers.getNom());

            if (pers.getNom().equals(itemSelected)) {
                persExist = true;
                if (pers.getMdp().equals(mdp)) {
                    log_bon = true;
                    this.PersonneConnectee = pers;
                }
            }
        }
        if (persExist && log_bon) {
            // rend invisible la a fenêt actuelle et ouvre celle voulue
            actuel.setVisible(false);
            VueSport l = new VueSport(this);
            l.setVisible(true);
        } else {
            if (!persExist) {
                JOptionPane.showMessageDialog(null, "Ce parent n'existe pas", "Erreur", JOptionPane.WARNING_MESSAGE);
            } else {
                if (!log_bon) {
                    JOptionPane.showMessageDialog(null, "Mot de passe incorrect", "Erreur", JOptionPane.WARNING_MESSAGE);
                }
            }
        }


    }


    public void Inscription(VueInscription vueInscription, String nom, String prenom, String adresse, String mail, String tel, String eleve, String niveau, String mdp) {

        if (nom.length() != 0 && prenom.length() != 0 && adresse.length() != 0 && mail.length() != 0 && tel.length() != 0 && eleve.length() != 0 && niveau.length() != 0 && mdp.length() != 0) {
            Mairie.listPers.add(new Personne(nom, prenom, adresse, mail, tel, eleve, niveau, mdp));
            // affiche la prochaine a fenêt
            vueInscription.setVisible(false);
            VueLogin s = new VueLogin(this);
            s.setVisible(true);
        } else {
            // affiche un message d'erreur
            JOptionPane.showMessageDialog(null, "Veuillez entrer tous les champs", "Erreur", JOptionPane.WARNING_MESSAGE);
        }

    }

    public void retourVers(JFrame actuel, String cible, String name) {
        // rend invisible la fenêtre actuelle et ouvre celle voulue

        actuel.setVisible(false);
        JFrame l = listePages.get(cible);
        l.setVisible(true);
        listePages.remove(name);
        System.out.println(listePages);
    }

    public Map<String, JFrame> getListePages() {
        return listePages;
    }

    public void ajouter_sport(VueSport VueSport, String nomSport) {
        // on crée la page facture
        VueFacture vue = new VueFacture(this, nomSport);

        // on récupère le sport dans le dictionnaire
        Sport sport = Accueil.getListeSports().get(nomSport);

        // on entre le prix du sport dans une zone de texte de la page facture
        VueFacture.getMontantField().setText(String.valueOf(sport.getPrix() / this.PersonneConnectee.getQuotientF()));
        Facture.SportTemp = sport;
        // rend invisible la fenêtre actuelle et ouvre celle voulue
        VueSport.setVisible(false);
        vue.setVisible(true);


    }


    public void payer() {


        if (VueFacture.getjRadioButton3().isSelected() || VueFacture.getjRadioButton4().isSelected()) {
            String methode;
            if (VueFacture.getjRadioButton3().isSelected())
                methode = "Carte Bancaire";
            else
                methode = "Espèce";
            Facture facture = new Facture(methode, this.PersonneConnectee);
            facture.Ticket();

        } else {
            JOptionPane.showMessageDialog(null, "veuillez séléctionner 1 choix de paiement ", "Erreur", JOptionPane.WARNING_MESSAGE);
        }
    }

}
