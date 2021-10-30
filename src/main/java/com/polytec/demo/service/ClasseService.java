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
        return classeRepository.add(classe);
    }

    public Classe getClasseById(String id) {
        return classeRepository.getClasseById(id);
    }

    public Classe update(Classe classe)
    {
        return classeRepository.update(classe);
    }

    public void delete(Long id)
    {
        classeRepository.delete(id);
    }

    public List<Classe> getAll() {
        return classeRepository.getAll();
    }

    public Classe getClassById(String id) {
        return classeRepository.getClassById(id);
    }
}
