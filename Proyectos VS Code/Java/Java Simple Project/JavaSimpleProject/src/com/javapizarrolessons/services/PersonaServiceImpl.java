package com.javapizarrolessons.services;

import com.javapizarrolessons.model.Persona;

public class PersonaServiceImpl implements IPersonaService{

    @Override
    public void registrar(Persona persona) {
        System.out.println(persona + " registrada ");
    }
    
}
