/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prossitinterfacefonctionnelle;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

/**
 *
 * @author Trunks
 */
public class ListEtudiant implements GestionEtudiant {

    @Override
    public void afficherEtudiants(List<Etudiant> etudiants, Consumer<Etudiant> consumer) {
        etudiants.forEach((e) -> {
            consumer.accept(e);
        });
    }

    @Override
    public void afficherEtudiantSelonFiltre(List<Etudiant> etudiants, Predicate<Etudiant> predicate, Consumer<Etudiant> cons) {
        etudiants.forEach((e) -> {
            if (predicate.test(e)) {
                cons.accept(e);
            }

        });
    }

    @Override
    public String afficherNomEtudiant(List<Etudiant> etudiants, Function<Etudiant, String> f) {
        String res = "";
        for (Etudiant e : etudiants) {
            res += f.apply(e);
            res += "\n";
        }
        return res;
    }

    @Override
    public Etudiant creeEtudiant(Supplier<Etudiant> supp) {
        return supp.get();
    }

}
