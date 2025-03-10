import java.util.Scanner;

public class Ejercicio4punto3 {
     public static void main(String[] args) {
        // Crear un objeto Scanner para leer los valores del usuario
        Scanner scanner = new Scanner(System.in);
        
        // Leer tres números del usuario
        System.out.print("Ingresa el primer número: ");
        int num1 = scanner.nextInt();
        
        System.out.print("Ingresa el segundo número: ");
        int num2 = scanner.nextInt();
        
        System.out.print("Ingresa el tercer número: ");
        int num3 = scanner.nextInt();
        
        // Determinar cuál es el número central
        int central;
        
        // Si num1 está entre num2 y num3
        if ((num1 > num2 && num1 < num3) || (num1 < num2 && num1 > num3)) {
            central = num1;
        }
        // Si num2 está entre num1 y num3
        else if ((num2 > num1 && num2 < num3) || (num2 < num1 && num2 > num3)) {
            central = num2;
        }
        // Si num3 está entre num1 y num2
        else {
            central = num3;
        }
        
        // Imprimir el número central
        System.out.println("El número central es: " + central);
        
        // Cerrar el scanner
        scanner.close();
    }
}

