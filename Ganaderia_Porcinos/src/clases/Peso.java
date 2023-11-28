
package clases;

public class Peso {
    int id;
    String cerdo;
    Float peso;
    
    public Peso(int id, String cerdo, Float peso) {
        this.id = id;
        this.cerdo = cerdo;
        this.peso = peso;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCerdo() {
        return cerdo;
    }

    public void setCerdo(String cerdo) {
        this.cerdo = cerdo;
    }

    public Float getPeso() {
        return peso;
    }

    public void setPeso(Float peso) {
        this.peso = peso;
    }
    
    
}
