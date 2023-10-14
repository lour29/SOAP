package idat.edu.model;

public class Alumno {
    private int id;
    private String nombre;
    private String apellido;
    private Integer edad;
    private Integer Grado;
    
    public Alumno(){
    }
    
    public Alumno(int id, String nombre, String apellido, Integer edad, Integer Grado) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.Grado = Grado;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public Integer getGrado() {
        return Grado;
    }

    public void setGrado(Integer Grado) {
        this.Grado = Grado;
    }
    
    
}
