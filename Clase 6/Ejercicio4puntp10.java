import java.util.Scanner;

public class Ejercicio4puntp10 {
    public static void main(String [] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese la calificación numérica
        System.out.print("Ingrese la calificación numérica (0-100): ");
        int calificacion = scanner.nextInt();

        // Validar que la calificación esté dentro del rango 0-100
        if (calificacion < 0 || calificacion > 100) {
            System.out.println("La calificación debe estar entre 0 y 100.");
        } else {
            // Determinar la calificación en letra usando condicionales
            char grado;
            if (calificacion >= 90) {
                grado = 'A';
            } else if (calificacion >= 80) {
                grado = 'B';
            } else if (calificacion >= 70) {
                grado = 'C';
            } else if (calificacion >= 69) {
                grado = 'D';
            } else {
                grado = 'F';
            }

            // Mostrar la calificación en letra
            System.out.println("La calificación en letra es: " + grado);
        }

        // Cerrar el scanner para evitar posibles fugas de recursos
        scanner.close();
    }
}

