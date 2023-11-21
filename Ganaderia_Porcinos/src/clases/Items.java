
package clases;


public class Items {
    String precioKilo;
    String subtotal;
    String id_cerdo;

    public Items(String precioKilo, String subtotal, String id_cerdo) {
        this.precioKilo = precioKilo;
        this.subtotal = subtotal;
        this.id_cerdo = id_cerdo;
    }

    public String getPrecioKilo() {
        return precioKilo;
    }

    public void setPrecioKilo(String precioKilo) {
        this.precioKilo = precioKilo;
    }

    public String getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(String subtotal) {
        this.subtotal = subtotal;
    }

    public String getId_cerdo() {
        return id_cerdo;
    }

    public void setId_cerdo(String id_cerdo) {
        this.id_cerdo = id_cerdo;
    }
    
    
}
