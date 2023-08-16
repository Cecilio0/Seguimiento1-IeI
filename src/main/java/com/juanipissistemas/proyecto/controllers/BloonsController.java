package com.juanipissistemas.proyecto.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.juanipissistemas.proyecto.models.Bloon;
import com.juanipissistemas.proyecto.services.BloonService;

@RestController
@RequestMapping("/Bloons")
public class BloonsController {
    @Autowired
    private BloonService cecilioService;

    @GetMapping("/bloons")
    public List<Bloon> showBloons(){
        return cecilioService.findAll();
    }
    
    @GetMapping("/bloons/{id}")
    public Bloon showBloon(@PathVariable Long id){
        return cecilioService.findById(id);
    }

    @DeleteMapping("/bloons/{id}")
    public void deleteBloon(@PathVariable Long id){
        cecilioService.delete(id);
    }

    @PostMapping("/bloons")
    public Bloon saveBloon(@RequestBody Bloon bloon){
        return cecilioService.save(bloon);
    }

    @PutMapping("/bloons/{id}")
    public Bloon updateBloon(@PathVariable Long id, @RequestBody Bloon bloon){
        return cecilioService.update(id, bloon);
    }

}
