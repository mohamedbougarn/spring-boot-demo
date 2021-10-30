package com.polytec.demo.entity;


import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="classe")
public class Classe
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    long id;

    @Column(name = "designation")
    String designation;

    @OneToMany(fetch = FetchType.EAGER,mappedBy ="classe")
    List<Etudiant>  etudiants = new ArrayList<Etudiant>();

    public Classe(String designation, List<Etudiant> etudients) {
        this.designation = designation;
        this.etudiants = etudients;
    }

    public Classe() {
    }


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }


    public List<Etudiant> getEtudiants() {
        return etudiants;
    }

    public void setEtudiants(List<Etudiant> etudiants) {
        this.etudiants = etudiants;
    }
}
