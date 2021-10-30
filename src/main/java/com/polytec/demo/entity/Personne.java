package com.polytec.demo.entity;




import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="cm_personne")

public class Personne {


    @Id
    @GeneratedValue(strategy =  GenerationType.AUTO)
    private Long id;

    @Column(name = "name")
    private String nom;

    private String prenom;


    @Column(name="cin",length = 8,unique=true)
    private String cin;

    @Column(name="date_naissance")
    private Date dateNaissance;





    public Long getId() {
        return id;
    }

    public void setId(Long id) {
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

    public Date getDateNaissance() {
        return dateNaissance;
    }

    public void setDateNaissance(Date dateNaissance) {
        this.dateNaissance = dateNaissance;
    }

    public Personne(String nom, String prenom, Date dateNaissance) {
        this.nom = nom;
        this.prenom = prenom;
        this.dateNaissance = dateNaissance;
    }


    public Personne(String nom, String prenom) {
        this.nom = nom;
        this.prenom = prenom;

    }


    public String getCin() {
        return cin;
    }

    public void setCin(String cin) {
        this.cin = cin;
    }


    public Personne(String nom, String prenom, String cin, Date dateNaissance) {
        this.nom = nom;
        this.prenom = prenom;
        this.cin = cin;
        this.dateNaissance = dateNaissance;
    }

    public Personne() {
    }


}
