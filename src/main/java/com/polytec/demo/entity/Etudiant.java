package com.polytec.demo.entity;

import javax.persistence.*;

@Entity
@Table(name = "etudiant")
public class Etudiant
{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    long id ;

    @Column(name = "nom")
    String nom;

    @Column(name = "prenom")
    String prenom;

    @Column(name = "date_naissance")
    String date_naissance ;

    @ManyToOne
    @JoinColumn(name ="id_classe",nullable = false)
    Classe classe;


    public Etudiant()
    {
    }

    public Etudiant(String nom, String prenom, String date_naissance, Classe classe) {
        this.nom = nom;
        this.prenom = prenom;
        this.date_naissance = date_naissance;
        this.classe = classe;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getDate_naissance() {
        return date_naissance;
    }

    public void setDate_naissance(String date_naissance) {
        this.date_naissance = date_naissance;
    }

    public Classe getClasse() {
        return classe;
    }

    public void setClasse(Classe classe) {
        this.classe = classe;
    }

}
