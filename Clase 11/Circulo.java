public class Circulo {

    // Atributos
    private float radio;

    // Constructor de la clase:Nos permite inicializar la clase
    // Se llama igual que la clase
    public Circulo(float radio) {
        this.radio = radio; // This es una autoreferencia al atributo de la clase
    }

    // Metodos
    public double CalcularPerimetro() {
        return 2 * Math.PI * radio;
    }

    public double CalcularArea() {
        return Math.PI * (radio * radio); // Math.PI * Math.pow (r,2)
    }
}