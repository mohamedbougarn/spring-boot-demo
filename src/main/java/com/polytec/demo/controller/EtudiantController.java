package com.polytec.demo.controller;

import com.polytec.demo.Utils.ApiResponse;
import com.polytec.demo.entity.Etudiant;
import com.polytec.demo.service.EtudiantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/etudiant")
public class EtudiantController
{
    @Autowired
    EtudiantService etudiantService;

    @PostMapping("/add")
    ApiResponse add(@RequestBody Etudiant etudiant)
    {
        if (etudiant.getId() != 0)
        {
            Etudiant eid=etudiantService.getEtudiantById(etudiant.getId());
            if (eid != null)
                return new ApiResponse("Id existe déja ");


        }

        etudiantService.add(etudiant);
        return new ApiResponse("Etudiant sauvgarder avec succés");
    }

    @PutMapping("/update")
    Etudiant update(@RequestBody Etudiant etudiant)
    {
        return etudiantService.update(etudiant);
    }

    @GetMapping("/getAll")
    List<Etudiant>getAll()
    {
        return etudiantService.getall();
    }

    @GetMapping("/getEtudiantById/{id}")
    Etudiant getById(@PathVariable Long l)
    {
        return etudiantService.getEtudiantById(l);
    }


    @DeleteMapping("/deleteById/{id}")
    void delete(@PathVariable Long l)
    {
        etudiantService.delete(l);
    }




}
