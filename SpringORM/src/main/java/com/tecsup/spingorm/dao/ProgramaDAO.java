package com.tecsup.spingorm.dao;

import com.tecsup.spingorm.model.Programa;

public interface ProgramaDAO extends GenericDAO<Programa>{
    
    
    Programa findByCodigo(String codigo);
    
}
