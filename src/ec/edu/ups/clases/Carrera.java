/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.clases;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ASUS
 */
public class Carrera 
{
    
private int codigo;
private String nombre;
private List<Materia> materias;
private int numSemestres;
private int numEstudiantes;
private String titulo;
    public Carrera()
    {
        materias=new ArrayList();
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
    public String getNombre()
    {
        return this.nombre;
    }
    
    public void agregarMateria(Materia materia)
    {
        materias.add(materia);
    }
    public void setNumSemestres(int numSemestres)
    {
        this.numSemestres=numSemestres;
    }
    public int getNumSemestres()
    {
        return this.numSemestres;
    }
    public void setNumEstudiantes(int numEstudiantes)
    {
         this.numEstudiantes=numEstudiantes;
    }
    public int getNumEstudiantes()
    {
        return this.numEstudiantes;
    }
    public void setTitulo(String titulo)
    {
        this.titulo=titulo;
    }
    public String getTitulo()
    {
        return this.titulo;
    }
    
}
