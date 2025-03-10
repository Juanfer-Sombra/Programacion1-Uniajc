import java.util.Scanner;

public class Ejercicio4punto1E {
    public static void main(String[] args) {
        double distancia, tiempo;

        // Crear un objeto Scanner para leer los valores
        Scanner scanner = new Scanner(System.in);
        
        // Leer el valor de distancia
        System.out.print("Ingresa el valor de la distancia: ");
        distancia = scanner.nextDouble();
        
        // Verificar la condición
        if (distancia > 20 && distancia < 35) {
            System.out.print("Ingresa el valor del tiempo: ");
            tiempo = scanner.nextDouble();
            System.out.println("Valor del tiempo: " + tiempo);
        } else {
            System.out.println("La distancia no está en el rango de 20 a 35.");
        }

        scanner.close();
    }
}

