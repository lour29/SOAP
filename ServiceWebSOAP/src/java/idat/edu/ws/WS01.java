/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package idat.edu.ws;

import idat.edu.model.Alumno;
import java.util.ArrayList;
import java.util.Collection;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author LOBATEX
 */
@WebService(serviceName = "WS01")
public class WS01 {

    private static final Collection<Alumno> itemsAlumno = new ArrayList<>();
    
    static {
    Alumno alumnol = new Alumno (1021, "Cesar", "Peredo", 23, 5);
    Alumno alumno2 = new Alumno (1022, "Diego", "Ramos de la cruz", 25, 6);
    Alumno alumno3 = new Alumno (1023,"Emanuel", "Carrillo", 21, 7);
    Alumno alumno4 = new Alumno (1024, "Ronaldino", "Condo", 25, 0);
    itemsAlumno.add(alumnol);
    itemsAlumno.add(alumno2);
    itemsAlumno.add(alumno3);
    itemsAlumno.add(alumno4);
}
@WebMethod (operationName = "ListarAlumnos")
public Collection<Alumno> listarAlumnos () {
return itemsAlumno;
}
@WebMethod(operationName = "AgregarAlumnos")
public void agregarAlumnos(@WebParam(name = "alumno")Alumno alumno){
    itemsAlumno.add(alumno);
}

@WebMethod (operationName="ActualizarAlumnos")
public void actualizarAlumnos(@WebParam(name ="alumno")Alumno alumno){
    for (Alumno a: itemsAlumno){
        if (a.getId()== alumno.getId()){
            a.setNombre(alumno.getNombre());
            a.setApellido(alumno.getApellido());
            a.setEdad(alumno.getEdad());
            a.setGrado(alumno.getGrado());
            break;
        }
    }
}

@WebMethod (operationName = "EliminarAlumnos")
public void eliminarAlumnos (@WebParam (name="codigo") int codigo){
    Alumno alumnoEliminar = null;
    for (Alumno a : itemsAlumno){
        if (a.getId()== codigo){
            alumnoEliminar = a;
            break;
        }
    }
    if(alumnoEliminar !=null){
        itemsAlumno.remove(alumnoEliminar);
    }
}

}

