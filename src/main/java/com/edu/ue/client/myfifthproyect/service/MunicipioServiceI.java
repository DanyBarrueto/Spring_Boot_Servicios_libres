package com.edu.ue.client.myfifthproyect.service;

import java.util.List;

import com.edu.ue.client.myfifthproyect.model.Municipio;

public interface MunicipioServiceI {

    List<Municipio> listMunicipios();
    List<Municipio> searchDepartamento(String name);
    
}
