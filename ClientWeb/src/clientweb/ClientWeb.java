package clientweb;
import java.util.Collection;

public class ClientWeb {

    public static void main(String[] args) {
        
        System.out.println("===============Alumno Agregado=========");
	Alumno alumnoNuevo = new Alumno();
	alumnoNuevo.setId(1001);
	alumnoNuevo.setNombre ("Nuevo");
	alumnoNuevo.setApellido ("Alumno");
	alumnoNuevo.setEdad (25);
	agregarAlumnos (alumnoNuevo);

	System.out.println("=========Alumnos Actualizado===============");
	Alumno alumnoActualizado = new Alumno();
	alumnoActualizado.setId(1002); // Código del alumno a actualizar
	alumnoActualizado.setApellido ("ApellidoModificado"); 
	alumnoActualizado.setEdad (30); // Nueva edad
	actualizarAlumnos (alumnoActualizado);

	System.out.println("===-Eliminar codigo==");
	int codigoEliminar = 1001; 
	eliminarAlumnos (codigoEliminar);
        
        System.out.println("====Listar======"); 
	Collection<Alumno> itemsAlumno = listarAlumnos ();
	for (Alumno item: itemsAlumno) { 
	    System.out.println("Código Alumno:" + item.getId());
	    System.out.println("Nombre: " + item.getNombre());
            System.out.println("Apellido: " + item.getApellido ()); 
	    System.out.println("Edad: " + item.getEdad());
	    System.out.println("Grado: "+ item.getGrado());
	    System.out.println();
        }
    }

    private static void actualizarAlumnos(clientweb.Alumno alumno) {
        clientweb.WS01_Service service = new clientweb.WS01_Service();
        clientweb.WS01 port = service.getWS01Port();
        port.actualizarAlumnos(alumno);
    }

    private static void agregarAlumnos(clientweb.Alumno alumno) {
        clientweb.WS01_Service service = new clientweb.WS01_Service();
        clientweb.WS01 port = service.getWS01Port();
        port.agregarAlumnos(alumno);
    }

    private static void eliminarAlumnos(int codigo) {
        clientweb.WS01_Service service = new clientweb.WS01_Service();
        clientweb.WS01 port = service.getWS01Port();
        port.eliminarAlumnos(codigo);
    }

    private static java.util.List<clientweb.Alumno> listarAlumnos() {
        clientweb.WS01_Service service = new clientweb.WS01_Service();
        clientweb.WS01 port = service.getWS01Port();
        return port.listarAlumnos();
    }
    
    
}
