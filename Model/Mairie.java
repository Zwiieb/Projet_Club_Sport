/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.Vector;

/**
 * @author wsi
 */
public class Mairie {

    // liste des personnes inscrites
    public static Vector<Personne> listPers = new Vector<Personne>();

    public static float[] simulationFamille() {
        int couple = (int) (Math.random() * 1);
        int nbEnfants = (int) ((Math.random() * 5));
        float[] reponse = new float[2];
        reponse[0] = nbEnfants;
        if (couple == 0) {
            reponse[1] = calculQuotientF(false, nbEnfants);
        } else {
            reponse[1] = calculQuotientF(true, nbEnfants);
        }
        return reponse;

    }

    public static float calculQuotientF(boolean couple, int nbEnfants) {

        int nb;
        if (couple) {
            nb = 2;
        } else {
            nb = 1;
        }
        if (nbEnfants == 1) {
            return nb + 0.5F;
        } else {
            return nb + nbEnfants;
        }
    }


    public static Vector<Personne> getListPers() {
        return listPers;
    }


}
