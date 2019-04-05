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
public class Sede 
{
    private int codigo;
    private String nombre;
    private String direccion;
    private String telefono;
    private List<Carrera> carreras;
    
     public Sede()
     {
         carreras=new ArrayList();
     }
     
     public void sedCodigo(int codigo)
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
     public void setDirreccion(String direccion)
     {
         this.direccion=direccion;
     }
     public String getDireccion()
     {
         return this.direccion;
     }
     public void setTelefono(String telefono)
     {
         this.telefono=telefono;
     }
     public String getTelefono()
     {
         return this.telefono;
     }
     public void setCarreras(List<Carrera> carreras)
     {
         this.carreras=carreras;
     }
     public List<Carrera> getCarreras()
     {
         return this.carreras;
     }
     
}
