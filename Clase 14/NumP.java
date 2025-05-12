
public class NumP {
    
    private int numero;

    // Método para contar los dígitos pares
    public int contarDigitosPares(int num) {
        
        int contador = 0;

        while (num != 0) {
            int digito = num % 10;

            if (digito % 2 == 0) {
                contador++;
            }

            num = num / 10;
        }

        return contador;
    }
}

