package com.polytec.demo.repository;

import com.polytec.demo.entity.Classe;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.List;

@Repository
public interface ClasseRepository extends JpaRepository<Class,Long>
{

    public Classe add(Classe classe);
    public Classe getClasseById(String id);
    public Classe update(Classe classe);
    public void delete(Long id);
    public List<Classe> getAll();
    public Classe getClassById (String id);
    public Collection<Classe> findByIdIsNull();

}
