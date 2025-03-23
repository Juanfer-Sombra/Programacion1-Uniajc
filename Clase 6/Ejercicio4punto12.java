import java.util.Scanner;

public class Ejercicio4punto12 {
    
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese dos números reales
        System.out.print("Ingrese el primer número real: ");
        double num1 = scanner.nextDouble();
        System.out.print("Ingrese el segundo número real: ");
        double num2 = scanner.nextDouble();

        // Solicitar al usuario que ingrese el código de selección de la operación
        System.out.print("Ingrese el código de selección (1: Suma, 2: Multiplicación, 3: División): ");
        int codigoSeleccion = scanner.nextInt();

        // Variable para almacenar el resultado
        double resultado = 0;

        // Ejecutar la operación según el código de selección
        switch (codigoSeleccion) {
            case 1:
                // Suma
                resultado = num1 + num2;
                System.out.println("El resultado de la suma es: " + resultado);
                
            case 2:
                // Multiplicación
                resultado = num1 * num2;
                System.out.println("El resultado de la multiplicación es: " + resultado);
                
            case 3:
                // División
                if (num2 != 0) {
                    resultado = num1 / num2;
                    System.out.println("El resultado de la división es: " + resultado);
                } else {
                    System.out.println("Error: No se puede dividir entre cero.");
                }
                
            default:
                System.out.println("Código de selección no válido.");
        }

        // Cerrar el scanner
        scanner.close();
    }
}

