package com.javapizarrolessons.model;

/**
 * Representa a una persona
 * 
 * @autor Pizarrito con ayuda de javatechnolessons
 * @version 1.0
 */

public class Persona {
    private Integer id;
    private String nombre;

    public Persona() {
    }

    /**
     * Constructor
     * 
     * @param id     id de la persona
     * @param nombre Nombre de la persona
     */
    public Persona(Integer id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    /**
     * Obtención del id de la persona
     * 
     * @return retorna el id de la persona
     */
    public Integer getId() {
        return id;
    }

    /**
     * Asignación del id de la persona
     * 
     * @param id es el id de la persona
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * Obtención del nombre de la persona
     * 
     * @return retorna el nombre de la persona
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Asignación del nombre de la persona
     * 
     * @param nombre es el nombre de la persona
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Persona other = (Persona) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Persona [id=" + id + ", nombre=" + nombre + "]";
    }

}
