import java.util.Scanner;

public class Ejercicio4punto11 {
    
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese dos números
        System.out.print("Ingrese el primer número: ");
        double num1 = scanner.nextDouble();
        System.out.print("Ingrese el segundo número: ");
        double num2 = scanner.nextDouble();

        // Solicitar al usuario que ingrese la operación
        System.out.print("Seleccione la operación (1: Suma, 2: Resta, 3: Multiplicación, 4: División): ");
        int seleccionOp = scanner.nextInt();

        // Variable para almacenar el resultado de la operación
        double resultado = 0;

        // Seleccionar la operación según el valor de seleccionOp
        switch (seleccionOp) {
            case 1:
                // Suma
                resultado = num1 + num2;
                System.out.println("El resultado de la suma es: " + resultado);
                
            case 2:
                // Resta
                resultado = num1 - num2;
                System.out.println("El resultado de la resta es: " + resultado);
                
            case 3:
                // Multiplicación
                resultado = num1 * num2;
                System.out.println("El resultado de la multiplicación es: " + resultado);
                
            case 4:
                // División
                if (num2 != 0) {
                    resultado = num1 / num2;
                    System.out.println("El resultado de la división es: " + resultado);
                } else {
                    System.out.println("Error: No se puede dividir entre cero.");
                }
                
            default:
                System.out.println("Operación no válida.");
        }

        // Cerrar el scanner
        scanner.close();
    }
}

