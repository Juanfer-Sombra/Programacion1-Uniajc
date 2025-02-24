import java.util.Scanner;

public class Convertidor {
    public static void main (String [] args) {
        //declaracion de las variables para el ejercicio 
        // c-> grados celcius, f -> grados farenheit
        // gradosCelcius, gradosFarenheit
        double c,f, gradosCelcius, gradosFarenheit;

       //pedir datos por teclado
       Scanner  leer = new Scanner(System.in);

       System.out.println ("digite los grados Celcius");
       c = leer.nextInt ();
       System.out.println  ("digite los grados Farenheit");
       f = leer.nextDouble();

       gradosCelcius = (f - 32.0) * (5.0/9.0);
            gradosFarenheit = c *(9.0/5.0) + 32.0;
            //mostrar resultados
            System.out.println ("ºf -> ºc:" + gradosCelcius);
            System.out.println ("ºc -> ºf:" + gradosFarenheit);

       leer.close(); 



    }

}