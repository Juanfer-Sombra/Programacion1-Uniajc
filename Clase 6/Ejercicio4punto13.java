import java.util.Scanner;

public class Ejercicio4punto13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Variables para mes y día
        double mes, dia;

        // Solicitar el mes
        System.out.print("Introduzca un mes (1 para Enero, 2 para Febrero,...): ");
        mes = scanner.nextDouble();

        // Verificar si el mes es válido
        if (mes < 1 || mes > 12) {
            System.out.println("El número introducido no es válido como mes.");
             // Terminar el programa si el mes es inválido
        }

        // Solicitar el día
        System.out.print("Introduzca un día del mes: ");
        dia = scanner.nextDouble();

        // Verificar si el día es válido
        if (dia < 1 || dia > 31) {
            System.out.println("El número introducido no es válido como día.");
             // Terminar el programa si el día es inválido
        }

        // Verificar si el mes tiene el número de días adecuado
        if (!esDiaValido(mes, dia)) {
            System.out.println("El día introducido no es válido para el mes especificado.");
        } else {
            System.out.println("La fecha es válida.");
        }

        scanner.close();
    }

    // Método para verificar si el día es válido para el mes dado
    public static boolean esDiaValido(double mes, double dia) {
        int diasEnMes = obtenerDiasDelMes(mes);

        // Si el día está dentro del número de días del mes, es válido
        return dia <= diasEnMes;
    }

    // Método para obtener el número de días del mes
    public static int obtenerDiasDelMes(double mes) {
        int dias = 0;

        switch ((int) mes) {
            case 1:  // Enero
            case 3:  // Marzo
            case 5:  // Mayo
            case 7:  // Julio
            case 8:  // Agosto
            case 10: // Octubre
            case 12: // Diciembre
                dias = 31;
                break;
            case 4:  // Abril
            case 6:  // Junio
            case 9:  // Septiembre
            case 11: // Noviembre
                dias = 30;
                break;
            case 2:  // Febrero
                // Si es un año bisiesto, febrero tiene 29 días
                // Aquí consideramos que se pide al usuario que proporcione el año para determinar si es bisiesto
                dias = 28; // Por defecto, febrero tiene 28 días
                break;
        }

        return dias;
    }
}

