package clases;

public class Posicultor {
    private String id_finca;
    private String nombre;
    private String ubicacion;
    private String id_administrador;

    public Posicultor(String id_finca, String nombre, String ubicacion, String id_administrador) {
        this.id_finca = id_finca;
        this.nombre = nombre;
        this.ubicacion = ubicacion;
        this.id_administrador = id_administrador;
    }

    public String getId_finca() {
        return id_finca;
    }

    public void setId_finca(String id_finca) {
        this.id_finca = id_finca;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public String getId_administrador() {
        return id_administrador;
    }

    public void setId_administrador(String id_administrador) {
        this.id_administrador = id_administrador;
    }
   

}
