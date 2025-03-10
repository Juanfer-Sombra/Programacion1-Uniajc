import java.util.Scanner;

public class Ejercicio4punto1B {
     public static void main(String[] args) {
        // Clase que me permite a traves del objeto "leer" solicitar
        // Datos por teclado
        Scanner leer = new Scanner(System.in);
        // Se declara la variable o las variables
        double temperatura;

        // Soliciatra por teclado el angulo para su validacion
        System.out.print("digite la temperatura:");
        temperatura = leer.nextInt();

        // Condicional
        if (temperatura > 100) {
            System.out.println("por encima del punto de ebullicion del agua ");
        } else {
            System.out.println("Por debajo del punto de ebullicion del agua ");
        }
        leer.close();
    }
}


