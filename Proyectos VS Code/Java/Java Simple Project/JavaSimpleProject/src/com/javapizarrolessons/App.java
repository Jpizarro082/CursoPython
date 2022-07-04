package com.javapizarrolessons;

import com.javapizarrolessons.model.Persona;
import com.javapizarrolessons.services.IPersonaService;
import com.javapizarrolessons.services.PersonaServiceImpl;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Persona pers1 = new Persona(1, "Jorge");
        IPersonaService personaService = new PersonaServiceImpl();

        personaService.registrar(pers1);
    }
}
