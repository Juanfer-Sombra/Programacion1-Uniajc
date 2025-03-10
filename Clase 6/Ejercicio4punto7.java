import java.util.Scanner;

public class Ejercicio4punto7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Contadores para las categorías de peso
        int menosDe40kg = 0;
        int entre40y50kg = 0;
        int entre50y60kg = 0;
        int masDe60kg = 0;
        
        // Solicitar la cantidad de alumnos
        System.out.print("Ingresa el número de alumnos: ");
        int numAlumnos = scanner.nextInt();
        
        // Leer los pesos de los alumnos y clasificarlos
        for (int i = 1; i <= numAlumnos; i++) {
            System.out.print("Ingresa el peso del alumno " + i + ": ");
            double peso = scanner.nextDouble();
            
            // Clasificación por rangos de peso
            if (peso < 40) {
                menosDe40kg++;
            } else if (peso >= 40 && peso < 50) {
                entre40y50kg++;
            } else if (peso >= 50 && peso < 60) {
                entre50y60kg++;
            } else {
                masDe60kg++;
            }
        }
        
        // Mostrar los resultados
        System.out.println("\nEstadísticas de los pesos de los alumnos:");
        System.out.println("Alumnos con menos de 40 kg: " + menosDe40kg);
        System.out.println("Alumnos entre 40 y 50 kg: " + entre40y50kg);
        System.out.println("Alumnos entre 50 y 60 kg: " + entre50y60kg);
        System.out.println("Alumnos con 60 kg o más: " + masDe60kg);
        
        scanner.close();
    }
}

