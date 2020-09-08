package emanuelbodopracticapoo;

/**
 *
 * @author Emanuel
 */
public class cuentaBancaria {

    private String nombreTitular, tipoDeCuenta;
    private int saldo;

    public cuentaBancaria() {
        this.nombreTitular = "";
        this.tipoDeCuenta = "";
        this.saldo = 0;
        System.out.println("Creando Usuario...");
    }

    public cuentaBancaria(String nombreTitular, String tipoDeCuenta, int saldo) {
        this();
        this.nombreTitular = nombreTitular;
        this.tipoDeCuenta = tipoDeCuenta;
        this.saldo = saldo;

    }

    public void setNombreTitular(String nombreTitular) {
        if (!nombreTitular.equals("")) {
            this.nombreTitular = nombreTitular;
        }
    }

    public String getNombreTitular() {
        return nombreTitular;
    }

    public void setTipoDeCuenta(String tipoDeCuenta) {
        if (!tipoDeCuenta.equals("")) {
            this.tipoDeCuenta = tipoDeCuenta;
        }
    }

    public String getTipoDeCuenta() {
        return tipoDeCuenta;
    }

    public void setSaldo(int saldo) {
        if (saldo > 0) {
            this.saldo = saldo;
        }
    }

    public int getSaldo() {
        return saldo;
    }

    public void printInMain() {

        System.out.println("\nNombre titular:" + nombreTitular + "\nTipo de cuenta:" + tipoDeCuenta + "\nSaldo:" + saldo);

    }

    public void extraer(int saldo) {
        if (saldo != 0) {
            System.out.println("Extracción permitida");
        } else {
            System.out.println("Extracción cancelada debido a saldo negativo en cuenta");
        }
    }
}
