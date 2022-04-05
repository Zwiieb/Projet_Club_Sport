/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author wsi
 */
public class Facture {

    private int montant;
    private String paiement;


    public Facture() {
        super();
        // TODO Auto-generated constructor stub
    }
    public Facture(int montant) {
        super();
        this.montant = montant;
    }
    public int getMontant() {
        return montant;
    }
    public String getPaiement() {
        return paiement;
    }
    public void setPaiement(String paiement) {
        this.paiement = paiement;
    }
    public Facture(String paiement) {
        super();
        this.paiement = paiement;
    }

    public void setMontant(int montant) {
        this.montant = montant;
    }


}