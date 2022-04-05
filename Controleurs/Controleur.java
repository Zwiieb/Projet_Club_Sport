package Controleurs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import Model.Mairie;
import Model.Personne;
import Vues.VueAccueil;
import Vues.VueFacture;
import Vues.VueInscription;
import Vues.VueLogin;
import Vues.VueMairie;
import Vues.VueSport;


public class Controleur {
	private Mairie mairie;
	Map<String, JFrame> listePages = new HashMap<String, JFrame>();
	
	public Controleur() {
		this.mairie = new Mairie();
		this.listePages = new HashMap<>();
	}

	public void methode(String Sport) throws Exception {
		float prix = mairie.get_prix_sport(Sport);
	}
	
	public void lancement_inscription(JFrame actuel) {
    	actuel.setVisible(false);
    	VueInscription g= new VueInscription(this);
        g.setVisible(true);
	}

	public void lancement_connexion(JFrame actuel) {
		actuel.setVisible(false);
    	VueLogin l= new VueLogin(this);
        l.setVisible(true);    
	}

	public void testConnexion(JFrame actuel,String itemSelected, String mdp) {
		boolean persExist = false;
    	boolean log_bon = false;
    	for (var pers : Mairie.getListPers()){
			System.out.println(pers.nom);
			
			if (pers.nom.equals(itemSelected)) {
				persExist=true;
				if(pers.mdp.equals(mdp)) {
					log_bon = true;
				}
			}
		}
    	if(persExist && log_bon){
			actuel.setVisible(false);
        	VueSport l= new VueSport(this);
            l.setVisible(true);
    	}else {
    		if(!persExist) {
    			JOptionPane.showMessageDialog(null, "Ce parent n'existe pas", "Erreur", JOptionPane.WARNING_MESSAGE);
    		}else {
    			if(!log_bon) {
    				JOptionPane.showMessageDialog(null, "Mot de passe incorrect", "Erreur", JOptionPane.WARNING_MESSAGE);
    			}
    		}
    	}
    	
      
		
	}

	public void Inscription(VueInscription vueInscription,String nom,String prenom,String adresse,String mail,String tel,String eleve,String niveau, String mdp) {
		
		 if(nom.length() != 0 && prenom.length()!=0 && adresse.length()!=0 && mail.length()!=0 && tel.length()!=0 && eleve.length()!=0 && niveau.length()!=0 && mdp.length()!=0) {
	        	Mairie.listPers.add(new Personne(nom,prenom,adresse,mail,tel,eleve,niveau,mdp));
	        	// affiche la prochaine fenetre
	        	vueInscription.setVisible(false); 
	        	VueLogin s= new VueLogin(this);
	            s.setVisible(true); 
	        }else {
	        	// affiche un message d'erreur
	        	JOptionPane.showMessageDialog(null, "Veuillez entrer tous les champs", "Erreur", JOptionPane.WARNING_MESSAGE);
	        }
		
	}

	
	public void retourAcceuil(JFrame actuel) {
		actuel.setVisible(false); 
    	JFrame l= listePages.get("VueAccueil");
        l.setVisible(true);  
		
	}

	public Map<String, JFrame> getListePages() {
		return listePages;
	}

	public void lancement_sport(VueFacture vueFacture) {

		vueFacture.setVisible(false);
    	VueSport l= new VueSport(this);
        l.setVisible(true);
		
	}

	public void lancement_facture(VueMairie vueMairie) {
		vueMairie.setVisible(false);
    	VueFacture g= new VueFacture(this);
        g.setVisible(true); 
		
	}

	    
}
