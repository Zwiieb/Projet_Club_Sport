/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

public class Personne {
    private String nom;
    private String prenom;
    private String adresse;
    private String adresse_mail;
    private String tel;
    private String prenom_eleve;
    private String niveau;
    private String mdp;
    private float quotientF;
    private int nbEnfant;


    public Personne(String nom, String prenom, String adresse, String adresse_mail, String tel, String prenom_eleve,
                    String niveau, String mdp) {
        this.nom = nom;
        this.prenom = prenom;
        this.adresse = adresse;
        this.adresse_mail = adresse_mail;
        this.tel = tel;
        this.prenom_eleve = prenom_eleve;
        this.niveau = niveau;
        this.mdp = mdp;
        float[] temporaire = Model.Mairie.simulationFamille();
        this.quotientF = temporaire[0];
        this.nbEnfant = (int) temporaire[1];

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

    public float getQuotientF() {
        return quotientF;
    }

    public int getNbEnfant() {
        return nbEnfant;
    }


}
