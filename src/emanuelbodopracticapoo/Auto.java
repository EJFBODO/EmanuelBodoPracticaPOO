package emanuelbodopracticapoo;

/**
 *
 * @author Emanuel
 */
public class Auto {

    private String marca, modelo;
    private int kilometraje;

    public Auto() {
        this.marca = "";
        this.modelo = "";
        this.kilometraje = 0;
        System.out.println("Creando Auto...");
    }

    public Auto(String marca, String modelo, int kilometraje) {
        this();
        this.marca = marca;
        this.modelo = modelo;
        this.kilometraje = kilometraje;
    }

    public void setMarca(String marca) {
        if (!marca.equals("")) {
            this.marca = marca;
        }
    }

    public String getMarca() {
        return marca;
    }

    public void setModelo(String modelo) {
        if (!modelo.equals("")) {
            this.modelo = modelo;
        }
    }

    public String getModelo() {
        return modelo;
    }

    public void setKilometraje(int kilometraje) {
        if (kilometraje > 0) {
            this.kilometraje = kilometraje;
        }
    }

    public int getKilometraje() {
        return kilometraje;
    }

    public void EstadoAuto(int kms) {
        if (kms == 0) {
            System.out.println("Está nuevo");
        } else if (kms < 10000) {
            System.out.println("Poco usado");
        } else if (kms < 100000) {
            System.out.println("Usado");
        } else {
            System.out.println("Bastante Usado");
        }

    }

    public void print() {

        System.out.println("\nMarca:" + marca + "\nModelo:" + modelo + "\nKilometraje:" + kilometraje);

    }
}
