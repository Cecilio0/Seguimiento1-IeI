package com.juanipissistemas.proyecto.services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.juanipissistemas.proyecto.models.Bloon;

import com.juanipissistemas.proyecto.dao.IBloonDAO;

@Service
public class BloonService implements IBloonService{

    @Autowired
    private IBloonDAO bloonDAO;

    @Override
    public List<Bloon> findAll(){
        return bloonDAO.findAll();
    }

    public Bloon findById(Long id){
        return bloonDAO.findById(id).orElse(null);
    }

    public void delete(Long id){
        bloonDAO.deleteById(id);
    }

    public Bloon save(Bloon bloon){
        return bloonDAO.save(bloon);
    }

    public Bloon update(Long id, Bloon bloon){
        Bloon toUpdate = bloonDAO.findById(id).orElse(null);//se necesita hacer un paso por referencia
        if(toUpdate != null){
            toUpdate.setNombre(bloon.getNombre());
            toUpdate.setSize(bloon.getSize());
            toUpdate.setColor(bloon.getColor());
            bloonDAO.save(toUpdate);
        }
        return toUpdate; 
    }
    
}
