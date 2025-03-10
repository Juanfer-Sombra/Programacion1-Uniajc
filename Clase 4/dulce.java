import java.util.Scanner;

public class dulce {

public static void main (String  [] args ) {
   // DEFINIR COSTOS
   final double Costo_Materia_Prima = 2.50;
   final double Costo_Empaque = 0.50;
   final double Ganancias = 0.30;
   final int Barras_por_Caja = 10;

  // Entrada Usuario 
  Scanner scanner = new Scanner(System.in);
  System.out.print("ingrese el numero de barras producidas hoy:");
  int nBarras = scanner.nextInt();
  scanner.close();

  //Calculo total de produccion por barra
  Double CostoTotalporBarra = Costo_Materia_Prima + Costo_Empaque;
  Double CostoTotalproducion = CostoTotalporBarra * nBarras;

  //calculo del precio de venta 
  double precioVentaPorBarra = CostoTotalporBarra * (1 + Ganancias);

  //calculo del ingreso total
  double ingresoTotal = precioVentaPorBarra * nBarras;

  //calculo del empaque 
  int cajasLlenas = nBarras / Barras_por_Caja;
  int barrasSobrantes = nBarras % Barras_por_Caja;

  //Resultados 

  System.out.printf("Costo total de produccion: $%.2f%n", CostoTotalproducion);
  System.out.printf("Precio de venta por barra: $%.2f%n" , precioVentaPorBarra);
  System.out.printf("Ingreso total del dia: $%.2f%n", ingresoTotal);
  System.out.printf("Cajas llenas: %d%n", cajasLlenas);
  System.out.printf("Barras sobrantes: %d%n", barrasSobrantes);


}
}
