package com.polytec.demo.service;

import com.polytec.demo.entity.Etudiant;
import com.polytec.demo.entity.Personne;
import com.polytec.demo.repository.EtudiantRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class EtudiantService
{
    @Autowired
    EtudiantRepository etudiantRepository;

    public Etudiant add(Etudiant etudiant)

    {
        return etudiantRepository.save(etudiant);
    }

    public Etudiant getEtudiantById(Long id)
    {
        return etudiantRepository.getEtudiantById(id);
    }


    public Etudiant update(Etudiant etudiant)

    {
        return etudiantRepository.save(etudiant);
    }


    public void delete(Long id)

    {
        etudiantRepository.deleteById(id);
    }


    public List<Etudiant>getall()
    {
        return etudiantRepository.findAll();
    }


}
