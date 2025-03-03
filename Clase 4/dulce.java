import java.util.Scanner;
public class dulce
 
public static void main (String  [] args ) {
   // DEFINIR COSTOS
   final double Costo_Materia_Prima = 2,50;
   final double Costo_Empaque = 0,50;
   final double Ganancias = 0,30;
   final double Barras_por_Caja = 10;

  // Entrada Usuario 
  Scanner scanner = new Scanner(System.in);
  System.out.print("ingrese el numero de barras producidas hoy:");
  int nBarras = scanner.nextInt();
  scanner.close();

  //Calculo total de produccion por barra
  Double CostoTotalporBarra = Costo_Materia_Prima + Costo_Empaque;
  Double CostoTotalproducion = CostoTotalporBarra * nBarras;



}

 