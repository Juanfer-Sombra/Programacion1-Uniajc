import java.util.Scanner;

public class Ejercicio4punto6 {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Leer la fecha en formato DIA, MES, AÑO
        System.out.print("Introduce el día: ");
        int dia = scanner.nextInt();
        
        System.out.print("Introduce el mes: ");
        int mes = scanner.nextInt();
        
        System.out.print("Introduce el año: ");
        int año = scanner.nextInt();
        
        // Llamar a la función para obtener el día siguiente
        int[] fechaSiguiente = obtenerDiaSiguiente(dia, mes, año);
        
        // Mostrar la fecha del día siguiente
        System.out.println("El día siguiente es: " + fechaSiguiente[0] + "/" + fechaSiguiente[1] + "/" + fechaSiguiente[2]);
        
        scanner.close();
    }

    public static int[] obtenerDiaSiguiente(int dia, int mes, int año) {
        // Array de los días máximos para cada mes (para años no bisiestos)
        int[] diasPorMes = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        
        // Comprobar si es un año bisiesto y ajustar el mes de febrero
        if (esBisiesto(año)) {
            diasPorMes[1] = 29;  // febrero tiene 29 días en años bisiestos
        }
        
        // Incrementar el día
        dia++;
        
        // Comprobar si el día excede el número máximo de días del mes
        if (dia > diasPorMes[mes - 1]) {
            dia = 1;  // Reiniciar el día a 1
            mes++;    // Incrementar el mes
        }
        
        // Comprobar si el mes excede el número de meses (12 meses al año)
        if (mes > 12) {
            mes = 1;  // Reiniciar el mes a 1 (enero)
            año++;    // Incrementar el año
        }
        
        // Devolver la nueva fecha (día, mes, año)
        return new int[] {dia, mes, año};
    }

    public static boolean esBisiesto(int año) {
        // Un año es bisiesto si es divisible por 4 y (no divisible por 100 o divisible por 400)
        if ((año % 4 == 0 && año % 100 != 0) || (año % 400 == 0)) {
            return true;
        }
        return false;
    }
}

