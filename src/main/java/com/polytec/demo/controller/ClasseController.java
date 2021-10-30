package com.polytec.demo.controller;

import com.polytec.demo.repository.ClasseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/classe")
public class ClasseController
{
    @Autowired
    ClasseRepository classeRepository;

}
