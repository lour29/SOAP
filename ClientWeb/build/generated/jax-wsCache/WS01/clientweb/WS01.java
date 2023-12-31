
package clientweb;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.6-1b01 
 * Generated source version: 2.2
 * 
 */
@WebService(name = "WS01", targetNamespace = "http://ws.edu.idat/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface WS01 {


    /**
     * 
     * @param codigo
     */
    @WebMethod(operationName = "EliminarAlumnos")
    @RequestWrapper(localName = "EliminarAlumnos", targetNamespace = "http://ws.edu.idat/", className = "clientweb.EliminarAlumnos")
    @ResponseWrapper(localName = "EliminarAlumnosResponse", targetNamespace = "http://ws.edu.idat/", className = "clientweb.EliminarAlumnosResponse")
    @Action(input = "http://ws.edu.idat/WS01/EliminarAlumnosRequest", output = "http://ws.edu.idat/WS01/EliminarAlumnosResponse")
    public void eliminarAlumnos(
        @WebParam(name = "codigo", targetNamespace = "")
        int codigo);

    /**
     * 
     * @return
     *     returns java.util.List<clientweb.Alumno>
     */
    @WebMethod(operationName = "ListarAlumnos")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "ListarAlumnos", targetNamespace = "http://ws.edu.idat/", className = "clientweb.ListarAlumnos")
    @ResponseWrapper(localName = "ListarAlumnosResponse", targetNamespace = "http://ws.edu.idat/", className = "clientweb.ListarAlumnosResponse")
    @Action(input = "http://ws.edu.idat/WS01/ListarAlumnosRequest", output = "http://ws.edu.idat/WS01/ListarAlumnosResponse")
    public List<Alumno> listarAlumnos();

    /**
     * 
     * @param alumno
     */
    @WebMethod(operationName = "AgregarAlumnos")
    @RequestWrapper(localName = "AgregarAlumnos", targetNamespace = "http://ws.edu.idat/", className = "clientweb.AgregarAlumnos")
    @ResponseWrapper(localName = "AgregarAlumnosResponse", targetNamespace = "http://ws.edu.idat/", className = "clientweb.AgregarAlumnosResponse")
    @Action(input = "http://ws.edu.idat/WS01/AgregarAlumnosRequest", output = "http://ws.edu.idat/WS01/AgregarAlumnosResponse")
    public void agregarAlumnos(
        @WebParam(name = "alumno", targetNamespace = "")
        Alumno alumno);

    /**
     * 
     * @param alumno
     */
    @WebMethod(operationName = "ActualizarAlumnos")
    @RequestWrapper(localName = "ActualizarAlumnos", targetNamespace = "http://ws.edu.idat/", className = "clientweb.ActualizarAlumnos")
    @ResponseWrapper(localName = "ActualizarAlumnosResponse", targetNamespace = "http://ws.edu.idat/", className = "clientweb.ActualizarAlumnosResponse")
    @Action(input = "http://ws.edu.idat/WS01/ActualizarAlumnosRequest", output = "http://ws.edu.idat/WS01/ActualizarAlumnosResponse")
    public void actualizarAlumnos(
        @WebParam(name = "alumno", targetNamespace = "")
        Alumno alumno);

}
