/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.Vector;



public class Personne {
    public String nom;
    public String prenom;
    public String adresse;
    public String adresse_mail;
    public String tel;
    public String prenom_eleve;
    public String niveau;
    public String mdp;

    public Personne(String nom, String prenom, String adresse, String adresse_mail, String tel, String prenom_eleve,
            String niveau, String mdp) {
        super();
        this.nom = nom;
        this.prenom = prenom;
        this.adresse = adresse;
        this.adresse_mail = adresse_mail;
        this.tel = tel;
        this.prenom_eleve = prenom_eleve;
        this.niveau = niveau;
        this.mdp = mdp;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getAdresse_mail() {
        return adresse_mail;
    }

    public void setAdresse_mail(String adresse_mail) {
        this.adresse_mail = adresse_mail;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getPrenom_eleve() {
        return prenom_eleve;
    }

    public void setPrenom_eleve(String prenom_eleve) {
        this.prenom_eleve = prenom_eleve;
    }

    public String getNiveau() {
        return niveau;
    }

    public void setNiveau(String niveau) {
        this.niveau = niveau;
    }

    public String getMdp() {
        return mdp;
    }

    public void setMdp(String mdp) {
        this.mdp = mdp;
    }


}
