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
public class HistorialCalificaciones
{
        private  Materia materia;
        private Estudiante estudiante;
        private  int aprovechamiento1;
        private int examen1;
        private  int aprovechamiento2;
        private int examen2;
    public void setMateria(Materia materia)
    {
        this.materia=materia;
    }
    public Materia getMateria()
    {
        return this.materia;
    }
    public void  getEstudiante(Estudiante estudiante)
    {
        this.estudiante=estudiante;
    }
    public Estudiante getEstudiante()
    {
        return this.estudiante;
    }
    public void setAprovechamiento1(int aprovechamiento1 )
    {
        this.aprovechamiento1=aprovechamiento1;
    }
    public int getAprovechamiento1()
    {
        return this.aprovechamiento1;
    }
    public void setExamen1(int examen1)
    {
        this.examen1=examen1;
    }
    public int getExamen1()
    {
        return this.examen1;
    }
    public void setAprovechamiento2(int aprovechamiento2)
    {
        this.aprovechamiento2=aprovechamiento2;
    }
    public int getAprovechamiento2()
    {
        return this.aprovechamiento2;
    }
    public void setExamen2(int examen2)
    {
        this.examen2=examen2;
    }
    public int getExamen2()
    {
        return this.examen2;
    }

}
