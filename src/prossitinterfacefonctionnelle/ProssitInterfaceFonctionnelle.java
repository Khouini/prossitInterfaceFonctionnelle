/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prossitinterfacefonctionnelle;

import java.util.ArrayList;

/**
 *
 * @author Trunks
 */
public class ProssitInterfaceFonctionnelle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Etudiant> ListeEtudiant;
        ListeEtudiant = new ArrayList<>();
        ListeEtudiant.add(new Etudiant(6, "Yacine", 20));
        ListeEtudiant.add(new Etudiant(1, "Aacine", 10));
        ListeEtudiant.add(new Etudiant(2, "Tacine", 50));
        ListeEtudiant.add(new Etudiant(4, "Bacine", 400));

        ListEtudiant G = new ListEtudiant();
        System.out.println("Liste des etudiants");
        G.afficherEtudiants(ListeEtudiant, (e) -> System.out.println(e));
        System.out.println("age > 20");
        G.afficherEtudiantSelonFiltre(ListeEtudiant, (e) -> e.getAge() > 20, (e) -> System.out.println(e));
        System.out.println("affichage des nom des etudiants");
        System.err.println(G.afficherNomEtudiant(ListeEtudiant, (e)-> e.getNom()));
        
    }

}
