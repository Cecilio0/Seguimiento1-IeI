package com.juanipissistemas.proyecto.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.juanipissistemas.proyecto.models.Bloon;

public interface IBloonDAO extends JpaRepository<Bloon, Long>{
    
}
