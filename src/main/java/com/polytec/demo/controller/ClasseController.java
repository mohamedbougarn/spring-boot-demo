package com.polytec.demo.controller;

import com.polytec.demo.Utils.ApiResponse;
import com.polytec.demo.entity.Classe;
import com.polytec.demo.service.ClasseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api/classe")
public class ClasseController
{
    /*
    @Autowired
    ClasseService classeService;


    @PostMapping("/add")
    public ApiResponse add(@RequestBody Classe c) {


        if(c.getId() != 0)
        {

            Classe cid=  classeService.getClassById(c.getId());


            if (cid != null) return  new ApiResponse("Id exsite déja");

        }





        classeService.add(c);

        return new ApiResponse("Classe sauvegardé avec succès");

    }
*/


}
