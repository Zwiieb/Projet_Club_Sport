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
        this.quotientF = temporaire[1];
        this.nbEnfant = (int) temporaire[0];

    }

    public String getNom() {
        return nom;
    }

    public String getMdp() {
        return mdp;
    }

    public float getQuotientF() {
        return quotientF;
    }

    public int getNbEnfant() {
        return nbEnfant;
    }


}
