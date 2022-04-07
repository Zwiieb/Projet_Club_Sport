/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.HashMap;
import java.util.Map;

import javax.swing.JFrame;

public class Sport {
	
	private	String nom;
	private	float prix;
	private String prof;

	
	public Sport(String nom, float prix, String prof) {
		this.nom = nom;
		this.prix = prix;
		this.prof = prof;
		Accueil.getListeSports().put(this.nom,this);
		System.out.println("ajout de : \""+Accueil.getListeSports().get(this.nom).getNom()+"\" dans le dictionnaire.");

	}



	public String getNom() {
		return nom;
	}


	public float getPrix() {
		return prix;
	}


	public String getProf() {
		return prof;
	}
	
	
	
}
