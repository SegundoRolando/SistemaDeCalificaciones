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
public class Profesor 
{
private String titulo;
private double salario;
private String cargo;

    public void setTitulo(String titulo)
    {
        this.titulo=titulo;
    }
    public String getTitulo()
    {
        return this.titulo;
    }
    public void setSalario(double salario)
    {
        this.salario=salario;
    }
    public double getSalario()
    {
        return this.salario;
    }
    public void setCargo(String cargo)
    {
        this.cargo=cargo;
    }
    public String getCargo()
    {
        return this.cargo;
    }
}
