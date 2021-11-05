package com.polytec.demo.repository;

import com.polytec.demo.entity.Classe;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.List;

@Repository
public interface ClasseRepository extends JpaRepository<Classe,Long>
{

    //public Classe add(Classe classe);
    public Classe getClasseById(Long id);
    //public Classe update(Classe classe);
    public void deleteById(Long id);
    //public List<Classe> getAll();
    public Collection<Classe> findByIdIsNull();

}
