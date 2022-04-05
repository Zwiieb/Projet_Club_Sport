/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.Vector;

/**
 *
 * @author wsi
 */
public class Mairie {
	// liste des sports
	private  Vector<Sport> listSports = new Vector <Sport>();
	
	// liste des personnes inscrites
	public static Vector<Personne> listPers = new Vector <Personne>();
	
	
	
	 
	// getters / setters
	public float get_prix_sport(String nom) throws Exception {
		for (Sport sport : listSports) {
			if (sport.getNom().equals(nom)) {
				return sport.getPrix();
			}
		}
		throw new Exception("Pas de Sport correspondant");
	}

	public static Vector<Personne> getListPers() {
		return listPers;
	}
	
	
}
