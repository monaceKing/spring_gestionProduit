package com.cours.gestionProduit.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cours.gestionProduit.entities.ProduitEntity;
import com.cours.gestionProduit.repository.ProduitRepository;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PathVariable;




@RequestMapping("/produits")
@RestController
public class ProduitController {

    private final ProduitRepository produitRepo;

    
    public ProduitController(ProduitRepository produitRepo) {
        this.produitRepo = produitRepo;
    }

    @GetMapping
    public List<ProduitEntity> listeProduits() {
        return produitRepo.findAll();
    }

    @PostMapping
    public ProduitEntity creationProduit(@RequestBody ProduitEntity produit) {
        return produitRepo.save(produit);
    }

    @PutMapping("path/{id}")
    public String modificationProduit(@PathVariable String id, @RequestBody String entity) {
        return entity;
    }
    
    @DeleteMapping("{id}")
    public String suppressionProduit(@PathVariable Long id){
        produitRepo.deleteById(id);
        return "Suppression effectuée avec succès";
    }
}
