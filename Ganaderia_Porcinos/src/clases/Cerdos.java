
package clases;


public class Cerdos {
    String id_cerdo;
    String raza;
    String sexo;
    String peso;
    String fecha;
    String estado;
    String id_finca;

    public Cerdos(String id_cerdo, String raza, String sexo, String peso, String fecha, String estado, String id_finca) {
        this.id_cerdo = id_cerdo;
        this.raza = raza;
        this.sexo = sexo;
        this.peso = peso;
        this.fecha = fecha;
        this.estado = estado;
        this.id_finca = id_finca;
    }

    public String getId_cerdos() {
        return id_cerdo;
    }

    public void setId_cerdos(String id_cerdo) {
        this.id_cerdo = id_cerdo;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getPeso() {
        return peso;
    }

    public void setPeso(String peso) {
        this.peso = peso;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getId_finca() {
        return id_finca;
    }

    public void setId_finca(String id_finca) {
        this.id_finca = id_finca;
    }
    
}
