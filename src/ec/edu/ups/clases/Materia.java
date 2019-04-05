/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.clases;

/**
 *
 * @author ASUS
 */
public class Materia 
{
    private  int codigo; 
    private  String nombre;
    private  int numeroCreditos;
    private  int numeroHoras;
    private  int nivel;
    private  Grupo grupo;
    private  Profesor profesor;

    @Override
    public String toString() {
        return "Materia{" + "codigo=" + codigo + ", nombre=" + nombre + ", numeroCreditos=" + numeroCreditos + ", numeroHoras=" + numeroHoras + ", nivel=" + nivel + ", grupo=" + grupo + ", profesor=" + profesor + '}';
    }
    
    public void setCodigo(int codigo)
    {
        this.codigo=codigo;
    }
    public int getCodigo()
    {
        return this.codigo;
    }
    public void setNombre(String nombre)
    {
        this.nombre=nombre;
    }
    public String getnombre()
    {
        return this.nombre;
    }
    public void setNumeroCreditos( int numeroCreditos)
    {
        this.numeroCreditos=numeroCreditos;
    }
    public int getNumeroCreditos()
    {
        return this.numeroCreditos;
    }
    public void setNumeroHoras(int numeroHoras)
    {
        this.numeroHoras=numeroHoras;
    }
    public int getNumeroHoras()
    {
        return this.numeroHoras;
    }
    public void setNivel(int nivel)
    {
        this.nivel=nivel;
    }
    public int getNivel()
    {
        return this.nivel;
    }
    public void setGrupo(Grupo grupo)
    {
        this.grupo=grupo;
    }
    public Grupo getGrupo()
    {
        return this.grupo;
    }
    public void setProfesor(Profesor profesor)
    {
        this.profesor=profesor;
    }
    public Profesor getProfesor()
    {
        return this.profesor;
    }

}

