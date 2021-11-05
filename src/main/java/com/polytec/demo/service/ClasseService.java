package com.polytec.demo.service;

import com.polytec.demo.entity.Classe;
import com.polytec.demo.repository.ClasseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClasseService
{
    @Autowired
    ClasseRepository classeRepository;

    public Classe add(Classe classe) {
        return classeRepository.save(classe);
    }

    public Classe getClasseById(Long id) {
        return classeRepository.getClasseById(id);
    }

    public Classe update(Classe classe)
    {
        return classeRepository.save(classe);
    }

    public void delete(Long id)
    {
        classeRepository.deleteById(id);
    }


    public List<Classe> getAll() {
        return classeRepository.findAll();
    }


    public Classe getClassById(Long id)
    {
        return classeRepository.getClasseById(id);
    }

}

