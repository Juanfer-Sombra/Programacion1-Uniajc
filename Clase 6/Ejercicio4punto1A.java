import java.util.Scanner;

public class Ejercicio4punto1A {
    public static void main(String[] args) {
        // Clase que me permite a traves del objeto "leer" solicitar
        // Datos por teclado
        Scanner leer = new Scanner(System.in);
        // Se declara la variable o las variables
        double angulo;

        // Soliciatra por teclado el angulo para su validacion
        System.out.print("digite el angulo:");
        angulo = leer.nextInt();

        // Condicional
        if (angulo == 90) {
            System.out.println("el angulo es un angulo recto");
        } else {
            System.out.println("El angulo no es un angulo recto ");
        }
        leer.close();
    }
}
