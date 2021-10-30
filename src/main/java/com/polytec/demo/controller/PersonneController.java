package com.polytec.demo.controller;


import com.polytec.demo.Utils.ApiResponse;
import com.polytec.demo.entity.Personne;
import com.polytec.demo.mapping.PersonneResponse;
import com.polytec.demo.service.PersonneService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/personne")
public class PersonneController {

    @Autowired
    PersonneService personneService;




    @GetMapping("/sayHello:{nom}")
    public String sayHello(@PathVariable String nom){
        return "<h1>Hello</h> "+ nom;
    }



    @PostMapping("/add")
    public ApiResponse add(@RequestBody Personne p) {


        if(p.getCin() != null){

            Personne pCin =  personneService.getPersonneByCin(p.getCin());


            if (pCin != null) return  new ApiResponse("Cin exsite déja");

        }





         personneService.add(p);

        return new ApiResponse("Personne sauvegardé avec succès");

    }




    @PutMapping("/update")
    public Personne update(@RequestBody Personne p) {

        return personneService.update(p);

    }

    @GetMapping("/getAll")
    public List<Personne> getAll() {

        return personneService.getAll();

    }


    @GetMapping("/getAllWithAge")
    public List<PersonneResponse> getAllWithAge() {

        return personneService.getAllWithAge();

    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable Long id) {

        personneService.delete(id);



    }

}
