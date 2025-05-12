public class CajeroElectronico {
    // atributos
    private double saldo;

    // Constructor: Permite inicializar la clase
    public CajeroElectronico(double saldo) {
        this.saldo = saldo;
    }
    // Metodos

    /**
     * Obtiene lo que tiene asignado el tributo saldo
     * 
     * @return saldo
     */

    public double getSaldo() {
        return saldo;
    }

    /*
     * Metodo para depositar dinero y asignarselo al saldo
     * 
     * @param cantidad de tipo double
     * 
     * @return saldo
     */

    public double depositar(double cantidad) {
        return saldo += cantidad;
    }

    public void retirar(double cantidad) {
        if (cantidad <= saldo) {
            System.out.println("el nuevo saldo es:" + saldo);
        } else {
            System.out.println("La cantidad a retirar es mayor que el saldo");
        }
    }

    /**
     * Obtener el saldo actual de la cuenta
     * 
     * @return saldo
     */

    public double ConsultarSaldo() {
        return saldo;
    }

    public void transferir(Double Cantidad, String destino) {
        if (Cantidad <= saldo) {
            System.out.println(
                    "Se realizo una transferencia por:" + Cantidad + "a:" + destino + "y su sueldo es:" + saldo);
        } else {
            System.out.println("La transferencia no se pudo hacer");
        }
    }

}
