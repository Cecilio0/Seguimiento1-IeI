package com.juanipissistemas.proyecto.models;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "bloons")
public class Bloon implements Comparable<Bloon>, Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true, nullable = false)
    private String nombre;

    @Column
    private int size;
    
    @Column
    private String color;

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void setColor(String color){
        this.color = color;
    }

    public String getNombre(){
        return this.nombre;
    }

    public int getSize(){
        return this.size;
    }

    public String getColor(){
        return this.color;
    }

    
    @Override
    public int compareTo(Bloon e) {
        // TODO Auto-generated method stub
        if(this.getSize()>e.getSize()){
            return -1;
        }
        else if(this.getSize()<e.getSize()){
            return 1;
        } else {
            return 0;
        }
    }
}
