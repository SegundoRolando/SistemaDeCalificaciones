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
public class Persona
{
  private int codigo;
  private String nombre;
  private String cedula;
  private String telefono;
  private String direccion;
  private String correo;
  private Sede sede;
  
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
  public void setCedula(String cedula)
  {
      this.cedula=cedula;
  }
  public String getCedula()
  {
      return this.cedula;
  }
  public void setTelefono(String telefono)
  {
      this.telefono=telefono;
  }
  public String getTelefono()
  {
      return this.telefono;
  }
  public void setDireccion(String direccion)
  {
      this.direccion=direccion;
  }
  public String getDireccion()
  {
      return this.direccion;
  }
  public void setCorreo(String correo)
  {
      this.correo=correo;
  }
  public String getCorreo()
  {
      return this.correo;
  }
  public void setSede(Sede sede)
  {
      this.sede=sede;
  }
  public Sede getSede()
  {
      return this.sede;
  }
}
