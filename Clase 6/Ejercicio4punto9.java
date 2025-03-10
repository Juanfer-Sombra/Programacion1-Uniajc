import java.util.Scanner;

public class Ejercicio4punto9 {
        public static void main(String[] args) {
        Scanner leer= new Scanner(System.in);

        // Solicitar el ángulo al usuario
        System.out.print("Ingrese el valor del ángulo: ");
        double angulo = leer.nextDouble();

        // Determinar el tipo de ángulo
        if (angulo < 90) {
            System.out.println("El ángulo es agudo.");
        } else if (angulo == 90) {
            System.out.println("El ángulo es recto.");
        } else if (angulo > 90) {
            System.out.println("El ángulo es obtuso.");
        }

        leer.close(); // Cerrar el scanner
    }
}

