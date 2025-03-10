import java.util.Scanner;

public class Ejercicio4punto2 {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer los valores del usuario
        Scanner scanner = new Scanner(System.in);
        
        // Leer dos números del usuario
        System.out.print("Ingresa el primer número: ");
        int numero1 = scanner.nextInt();
        
        System.out.print("Ingresa el segundo número: ");
        int numero2 = scanner.nextInt();
        
        // Comparar los dos números y mostrar el mensaje correspondiente
        if (numero1 > numero2) {
            System.out.println("El primer número es el mayor.");
        } else if (numero1 < numero2) {
            System.out.println("El primer número es el más pequeño.");
        } else {
            System.out.println("Ambos números son iguales.");
        }
        
        // Cerrar el scanner
        scanner.close();
    }
}

