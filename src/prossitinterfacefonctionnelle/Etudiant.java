/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prossitinterfacefonctionnelle;

/**
 *
 * @author Trunks
 */
public class Etudiant {

    private int id;

    public Etudiant(int id, String nom, int age) {
        this.id = id;
        this.nom = nom;
        this.age = age;
    }

    private String nom;
    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Etudiant{" + "id=" + id + ", nom=" + nom + ", age=" + age + '}';
    }

}
