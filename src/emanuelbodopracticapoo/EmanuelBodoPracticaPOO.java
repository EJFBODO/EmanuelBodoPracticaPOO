package emanuelbodopracticapoo;

/**
 *
 * @author Emanuel
 */
public class EmanuelBodoPracticaPOO {

    public static void main(String[] args) {
        Perro uno, dos;

        uno = new Perro();
        dos = new Perro("Firulais");

        uno.ladrar();
        dos.printing();

        Auto one, two;

        one = new Auto();
        two = new Auto("Toyota", "Corolla", 160000);

        one.EstadoAuto(9999);
        two.print();

        cuentaBancaria user, userTwo;

        user = new cuentaBancaria();
        userTwo = new cuentaBancaria("Josesito Perez", "Caja de ahorro", 10000);

        user.extraer(1000);
        user.extraer(0);
        userTwo.printInMain();

    }

}
