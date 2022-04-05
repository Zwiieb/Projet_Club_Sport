package Controleurs;

import java.util.Vector;

import Model.Personne;

public class Controleur {
	
	public static Vector<Personne> listPers = new Vector <Personne>();
	public static Float prixSport;
    
	  //getter liste Personnes
	    public Vector<Personne> recuplist(){
	    	return listPers;
	    }
	    
}
