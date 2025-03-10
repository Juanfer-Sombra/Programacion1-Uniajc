import java.util.Scanner;

public class Ejercicio4punto4 {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer el valor del usuario
        Scanner scanner = new Scanner(System.in);
        
        // Leer el número del usuario
        System.out.print("Ingresa un número: ");
        double numero = scanner.nextDouble();
        
        // Verificar si el número es negativo
        if (numero < 0) {
            System.out.println("No se puede calcular la raíz cuadrada de un número negativo.");
        } else {
            // Calcular la raíz cuadrada del número
            double raizCuadrada = Math.sqrt(numero);
            System.out.println("La raíz cuadrada de " + numero + " es: " + raizCuadrada);
        }
        
        // Cerrar el scanner
        scanner.close();
    }
}

