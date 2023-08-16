package com.juanipissistemas.proyecto.services;

import java.util.List;
import com.juanipissistemas.proyecto.models.Bloon;

public interface IBloonService {
    public List<Bloon> findAll();
    public Bloon findById(Long id);
    public void delete(Long id);
    public Bloon save(Bloon bloon);
    public Bloon update(Long id, Bloon bloon);
}
