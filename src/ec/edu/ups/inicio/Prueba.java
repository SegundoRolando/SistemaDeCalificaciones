/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.inicio;
    import ec.edu.ups.clases.Carrera;
    import ec.edu.ups.clases.Estudiante;
    import ec.edu.ups.clases.Grupo;
    import ec.edu.ups.clases.HistorialCalificaciones;
    import ec.edu.ups.clases.Materia;
    import ec.edu.ups.clases.Persona;
    import ec.edu.ups.clases.Profesor;
    import ec.edu.ups.clases.Sede;

/**
 *
 * @author ASUS
 */
public class Prueba 
{
    public static void main(String[] args) 
    {
        //CARRERA
        
        Materia obj=new Materia();
        obj.setNombre(" lenguaje");
        
        System.out.println(" su materia es : "+obj);
        Carrera carrera=new Carrera();
        carrera.setCodigo(22);
        carrera.agregarMateria(obj);
        carrera.setNombre("Juan");
        carrera.setNumEstudiantes(5);
        carrera.setNumSemestres(2);
        carrera.setTitulo("Computacion");
            int cod=carrera.getCodigo();
            System.out.println("Codigo : "+cod);
            String nom=carrera.getNombre();
            System.out.println("Nombre : "+nom);
            int nme=carrera.getNumEstudiantes();
            System.out.println("Numero de estudiantes "+nme);
            int ns=carrera.getNumSemestres();
            System.out.println("Semestres  : "+ns);
            String tit=carrera.getTitulo();
            System.out.println("Su titulo es de : "+ tit);
         
        
         //ESTUDIANTE
        
        Estudiante estudiante=new Estudiante();
        estudiante.setCarrera(carrera);
        //String carr=estudiante.getCarrera();
        //System.out.println("Estudiante Su carrera es :"+ carr);
        
        
        //GRUPO
        
        Grupo grupo=new Grupo();
        grupo.setCodigo(34);
        grupo.setCupo(5);
        grupo.setNombre("matematicas");
            int codd = grupo.getCodigo();
            System.out.println("Su codigo es : " + codd);
            int cup=grupo.getCupo();
            System.out.println("Ud tiene un numero  "+cup+"  cupos disponibles");
            String nomb=grupo.getNombre();
            System.out.println("La materia que esta disponibles es : " +nomb);
        
        //HISTORIAL DE CALIFICACIONES
        
        HistorialCalificaciones historialCalificaciones=new HistorialCalificaciones();
        historialCalificaciones.setAprovechamiento1(40);
        historialCalificaciones.setAprovechamiento2(30);
        historialCalificaciones.setExamen1(15);
        historialCalificaciones.setExamen2(13);
       // historialCalificaciones.setMateria(materia);
            int a1=historialCalificaciones.getAprovechamiento1();
             System.out.println("Nota Primer Interciclo : "+a1);
             int a2=historialCalificaciones.getAprovechamiento2();
             System.out.println("Nota Segundo Interciclo : "+a2);
             int e1=historialCalificaciones.getExamen1();
             System.out.println("Nota del primer examen :"+e1);
             int e2=historialCalificaciones.getExamen2();
             System.out.println("Nota del seundo Examen : "+e2);
        
        
        //MATERIA
       
        Materia materia=new Materia();
        materia.setCodigo(33);
        //materia.setGrupo(5);
        materia.setNivel(3);
        materia.setNombre("Matematica");
        materia.setNumeroCreditos(250);
        materia.setNumeroHoras(280);
       // materia.setProfesor(profesor);
            int codi=materia.getCodigo();
             System.out.println("El codigo de la materia es : " +codi);
            int niv=materia.getNivel();
             System.out.println("El nivel de la materia es : "+niv);
            String matt=materia.getnombre();
             System.out.println("El nomnbre de la materia es : "+ matt);
            int nc=materia.getNumeroCreditos();
             System.out.println("El numero de creditos de la materia es : "+nc);
            int nh=materia.getNumeroHoras();
             System.out.println("El numero de horas de la materia es : "+nh);
       
       
       //PERSONA
       
        Persona persona=new Persona();
        persona.setCedula("0106137847");
        persona.setCodigo(3425);
        persona.setCorreo("cuenca@ups.edu.ec");
        persona.setDireccion("Cuenca-Azuay");
        //persona.setNombre(Jaimito);
        //persona.setSede("Sede Cuenca");
        persona.setTelefono("3051456");
            String cl=persona.getCedula();
            System.out.println("Cedula : "+cl);
            int cmm=persona.getCodigo();
            System.out.println("su numero de codigo es "+cmm);
            String email=persona.getCorreo();
            System.out.println("Su correo electronico es : "+email);
            String ddd=persona.getDireccion();
            System.out.println("Su direccion es : "+ddd);
            String ntf=persona.getTelefono();
            System.out.println("Su numero  telefonico es : "+ntf);
        
        //PROFESOR
        
        Profesor profesor=new Profesor();
        profesor.setCargo("Director");
        profesor.setSalario(680);
        profesor.setTitulo("Ing Sistemas");
            String carg=profesor.getCargo();
            System.out.println("El cargo que  ocupa es de : " +carg);
            double sal=profesor.getSalario();
            System.out.println("su salario es de : "+sal);
            String titul=profesor.getTitulo();
            System.out.println("Su titulo obtenido es : "+titul);
        
        
        //SEDE
        Sede sede=new Sede();
        sede.sedCodigo(211);
      //  sede.setCarreras(carreras);
        sede.setDirreccion("Calle Vieja-Turhuayco");
        sede.setNombre("Universidad Politécnica Salesiana");
        sede.setTelefono("4567834");
            int codig =sede.getCodigo();
            System.out.println("El codigo postal de la universisdad es  : "+codig);
            String direc=sede.getDireccion();
            System.out.println("La direcion de sede es : "+direc);
            String nombr=sede.getnombre();
            System.out.println("El nombre de la universidad es : "+ nombr);
            String tell=sede.getTelefono();
            System.out.println("El numero telefonico de la Universida es : "+ tell);
        
        
    }
   
}
