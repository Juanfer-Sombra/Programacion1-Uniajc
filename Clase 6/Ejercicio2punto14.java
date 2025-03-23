import java.util.Scanner;

public class Ejercicio2punto14 {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Definir el piso inicial (por defecto el ascensor comienza en el primer piso)
        int pisoActual = 1;
        int totalPisos = 25;

        System.out.println("Simulación de un ascensor con 25 pisos.");
        System.out.println("El ascensor comienza en el piso 1.");

        while (true) {
            // Mostrar el estado actual del ascensor
            System.out.println("\nEl ascensor está actualmente en el piso " + pisoActual + ".");

            // Solicitar al usuario que elija una opción
            System.out.println("Seleccione una opción:");
            System.out.println("1. Subir un piso");
            System.out.println("2. Bajar un piso");
            System.out.println("3. Salir");

            int opcion = scanner.nextInt();

            // Acciones según la opción elegida
            switch (opcion) {
                case 1:
                    // Si el ascensor está en el último piso, no se puede subir
                    if (pisoActual < totalPisos) {
                        pisoActual++;
                        System.out.println("Subiendo... El ascensor ha llegado al piso " + pisoActual + ".");
                    } else {
                        System.out.println("¡Ya estás en el último piso! No puedes subir más.");
                    }
                    break;

                case 2:
                    // Si el ascensor está en el primer piso, no se puede bajar
                    if (pisoActual > 1) {
                        pisoActual--;
                        System.out.println("Bajando... El ascensor ha llegado al piso " + pisoActual + ".");
                    } else {
                        System.out.println("¡Ya estás en el primer piso! No puedes bajar más.");
                    }
                    break;

                case 3:
                    // Salir del programa
                    System.out.println("Saliendo del simulador de ascensor.");
                    scanner.close();
                    return;

                default:
                    System.out.println("Opción no válida. Por favor, elige 1, 2 o 3.");
            }
        }
    }
}
