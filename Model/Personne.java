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

	//constructeur
    public Personne(String nom,String prenom, String adresse, String adresse_mail, String tel,String prenom_eleve,String niveau,String mdp) {
    	this.nom = nom ;
        this.prenom = prenom ;
        this.adresse = adresse ;
        this.adresse_mail = adresse_mail ;
        this.tel = tel ;
        this.prenom_eleve = prenom_eleve;
        this.niveau = niveau;
        this.mdp = mdp;
    } 
}
