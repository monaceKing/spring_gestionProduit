package com.cours.gestionProduit.repository;
import com.cours.gestionProduit.entities.ProduitEntity;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ProduitRepository extends JpaRepository<ProduitEntity, Long> {
    
}
