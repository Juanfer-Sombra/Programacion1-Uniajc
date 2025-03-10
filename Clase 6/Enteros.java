import java.util.Scanner;

public class Enteros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       
        // Variables para almacenar la suma de positivos y negativos
        int totalPositivos = 0;
        int totalNegativos = 0;
       
        // Solicitar al usuario que ingrese la cantidad de números
        System.out.print("Ingrese la cantidad de números: ");
        int cantidad = scanner.nextInt();
       
        // Procesar los números ingresados
        for (int i = 0; i < cantidad; i++) {
            System.out.print("Ingrese un número: ");
            int numero = scanner.nextInt();
           
            if (numero > 0) {
                totalPositivos += numero; // Si el número es positivo, se suma a totalPositivos
            } else if (numero < 0) {
                totalNegativos += numero; // Si el número es negativo, se suma a totalNegativos
            }
        }
       
        // Mostrar el resultado
        System.out.println("Total de positivos: " + totalPositivos);
        System.out.println("Total de negativos: " + totalNegativos);
       
        scanner.close();
    }
}


