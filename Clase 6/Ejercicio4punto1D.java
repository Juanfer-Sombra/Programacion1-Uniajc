import java.util.Scanner;

public class Ejercicio4punto1D {
    public static void main(String[] args) {
        int x, y, z, p;

        // Crear un objeto Scanner para leer los valores
        Scanner scanner = new Scanner(System.in);
        
        // Leer los valores de x, y y z
        System.out.print("Ingresa el valor de x: ");
        x = scanner.nextInt();
        
        System.out.print("Ingresa el valor de y: ");
        y = scanner.nextInt();
        
        System.out.print("Ingresa el valor de z: ");
        z = scanner.nextInt();
        
        // Verificar la condición
        if (x > y && z < 20) {
            System.out.print("Ingresa el valor de p: ");
            p = scanner.nextInt();
            System.out.println("Valor de p: " + p);
        } else {
            System.out.println("La condición no se cumple.");
        }

        scanner.close();
    }
}

