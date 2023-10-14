
package clientweb;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the clientweb package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _EliminarAlumnosResponse_QNAME = new QName("http://ws.edu.idat/", "EliminarAlumnosResponse");
    private final static QName _AgregarAlumnosResponse_QNAME = new QName("http://ws.edu.idat/", "AgregarAlumnosResponse");
    private final static QName _EliminarAlumnos_QNAME = new QName("http://ws.edu.idat/", "EliminarAlumnos");
    private final static QName _ActualizarAlumnosResponse_QNAME = new QName("http://ws.edu.idat/", "ActualizarAlumnosResponse");
    private final static QName _AgregarAlumnos_QNAME = new QName("http://ws.edu.idat/", "AgregarAlumnos");
    private final static QName _ActualizarAlumnos_QNAME = new QName("http://ws.edu.idat/", "ActualizarAlumnos");
    private final static QName _ListarAlumnos_QNAME = new QName("http://ws.edu.idat/", "ListarAlumnos");
    private final static QName _ListarAlumnosResponse_QNAME = new QName("http://ws.edu.idat/", "ListarAlumnosResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: clientweb
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AgregarAlumnos }
     * 
     */
    public AgregarAlumnos createAgregarAlumnos() {
        return new AgregarAlumnos();
    }

    /**
     * Create an instance of {@link ActualizarAlumnosResponse }
     * 
     */
    public ActualizarAlumnosResponse createActualizarAlumnosResponse() {
        return new ActualizarAlumnosResponse();
    }

    /**
     * Create an instance of {@link AgregarAlumnosResponse }
     * 
     */
    public AgregarAlumnosResponse createAgregarAlumnosResponse() {
        return new AgregarAlumnosResponse();
    }

    /**
     * Create an instance of {@link EliminarAlumnos }
     * 
     */
    public EliminarAlumnos createEliminarAlumnos() {
        return new EliminarAlumnos();
    }

    /**
     * Create an instance of {@link EliminarAlumnosResponse }
     * 
     */
    public EliminarAlumnosResponse createEliminarAlumnosResponse() {
        return new EliminarAlumnosResponse();
    }

    /**
     * Create an instance of {@link ListarAlumnosResponse }
     * 
     */
    public ListarAlumnosResponse createListarAlumnosResponse() {
        return new ListarAlumnosResponse();
    }

    /**
     * Create an instance of {@link ListarAlumnos }
     * 
     */
    public ListarAlumnos createListarAlumnos() {
        return new ListarAlumnos();
    }

    /**
     * Create an instance of {@link ActualizarAlumnos }
     * 
     */
    public ActualizarAlumnos createActualizarAlumnos() {
        return new ActualizarAlumnos();
    }

    /**
     * Create an instance of {@link Alumno }
     * 
     */
    public Alumno createAlumno() {
        return new Alumno();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EliminarAlumnosResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.edu.idat/", name = "EliminarAlumnosResponse")
    public JAXBElement<EliminarAlumnosResponse> createEliminarAlumnosResponse(EliminarAlumnosResponse value) {
        return new JAXBElement<EliminarAlumnosResponse>(_EliminarAlumnosResponse_QNAME, EliminarAlumnosResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AgregarAlumnosResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.edu.idat/", name = "AgregarAlumnosResponse")
    public JAXBElement<AgregarAlumnosResponse> createAgregarAlumnosResponse(AgregarAlumnosResponse value) {
        return new JAXBElement<AgregarAlumnosResponse>(_AgregarAlumnosResponse_QNAME, AgregarAlumnosResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EliminarAlumnos }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.edu.idat/", name = "EliminarAlumnos")
    public JAXBElement<EliminarAlumnos> createEliminarAlumnos(EliminarAlumnos value) {
        return new JAXBElement<EliminarAlumnos>(_EliminarAlumnos_QNAME, EliminarAlumnos.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ActualizarAlumnosResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.edu.idat/", name = "ActualizarAlumnosResponse")
    public JAXBElement<ActualizarAlumnosResponse> createActualizarAlumnosResponse(ActualizarAlumnosResponse value) {
        return new JAXBElement<ActualizarAlumnosResponse>(_ActualizarAlumnosResponse_QNAME, ActualizarAlumnosResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AgregarAlumnos }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.edu.idat/", name = "AgregarAlumnos")
    public JAXBElement<AgregarAlumnos> createAgregarAlumnos(AgregarAlumnos value) {
        return new JAXBElement<AgregarAlumnos>(_AgregarAlumnos_QNAME, AgregarAlumnos.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ActualizarAlumnos }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.edu.idat/", name = "ActualizarAlumnos")
    public JAXBElement<ActualizarAlumnos> createActualizarAlumnos(ActualizarAlumnos value) {
        return new JAXBElement<ActualizarAlumnos>(_ActualizarAlumnos_QNAME, ActualizarAlumnos.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListarAlumnos }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.edu.idat/", name = "ListarAlumnos")
    public JAXBElement<ListarAlumnos> createListarAlumnos(ListarAlumnos value) {
        return new JAXBElement<ListarAlumnos>(_ListarAlumnos_QNAME, ListarAlumnos.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListarAlumnosResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.edu.idat/", name = "ListarAlumnosResponse")
    public JAXBElement<ListarAlumnosResponse> createListarAlumnosResponse(ListarAlumnosResponse value) {
        return new JAXBElement<ListarAlumnosResponse>(_ListarAlumnosResponse_QNAME, ListarAlumnosResponse.class, null, value);
    }

}
