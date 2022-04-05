package Controleurs;

import java.util.Vector;

import Model.Personne;

public class Controleur {
	
	public static Vector<Personne> listPers = new Vector <Personne>();
    
    
	  //getter liste Personnes
	    public Vector<Personne> recuplist(){
	    	return listPers;
	    }
}
