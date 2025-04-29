import java.util.Scanner;

public class OperacionesBasicas {
    public static void main(String[] args) {


Scanner scanner = new Scanner(System.in);

// Pedir al usuario que ingrese dos números
System.out.print("Ingresa el primer número: ");
int a = scanner.nextInt();

System.out.print("Ingresa el segundo número: ");
int b = scanner.nextInt();

// Realizar operaciones
int suma = a + b;
int resta = a - b;
int multiplicacion = a * b;
int division = 0;

if (b != 0) { // Evitar división por cero
    division = a / b;
} else {
    System.out.println("No se puede dividir entre cero.");
}

// Mostrar resultados
System.out.println("Suma: " + suma);
System.out.println("Resta: " + resta);
System.out.println("Multiplicación: " + multiplicacion);
if (b != 0) {
    System.out.println("División: " + division);
}

scanner.close();
}
}

