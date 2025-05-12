public class Ejercutartelefono {
        public static void main(String[] args) {

        // Escenario 1 (Nuevo teléfono Xiaomi)
        System.out.println("--------------Escenario 1-----------------------------");
        Telefono tel1 = new Telefono("Xiaomi", "Redmi Note 12", "Gris", "6.67 pulgadas",
                                     "2201116TG", "165.9 x 76.2 x 8.1 mm", 128, 5000, "6GB");
       
        tel1.mostrarInformacion();
        tel1.cambiarColor("Verde");
        tel1.cargarTelefono(300);
        tel1.actualizarAlmacenamiento(256);

        // Escenario 2 (Nuevo teléfono Motorola)
        System.out.println("--------------Escenario 2-----------------------------");
        Telefono tel2 = new Telefono("Motorola", "Edge 40", "Azul", "6.55 pulgadas",
                                     "XT2303-2", "158.4 x 72 x 7.6 mm", 256, 4400, "8GB");
       
        tel2.mostrarInformacion();
        tel2.cambiarColor("Negro");
        tel2.cargarTelefono(600);
        tel2.actualizarAlmacenamiento(512);
    }
}

