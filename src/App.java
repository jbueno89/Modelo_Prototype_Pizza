public class App {
    public static void main(String[] args) {

        // 1. Creamos la pizza base de la carta (el prototipo)
        Pizza hawayanaBase = new Pizza("Hawayana Clasica", "Masa Delgada");
        hawayanaBase.agregarIngrediente("Salsa de Tomate");
        hawayanaBase.agregarIngrediente("Queso Mozzarella");
        hawayanaBase.agregarIngrediente("Jamon");
        hawayanaBase.agregarIngrediente("Pina");

        // 2. Cliente 1 pide la pizza estándar
        Pizza pedido1 = hawayanaBase.clonar();

        // 3. Cliente 2 pide la misma pizza pero personalizada con tocino
        Pizza pedido2 = hawayanaBase.clonar();
        pedido2.setNombre("Hawayana con Tocino (Cliente 2)");
        pedido2.agregarIngrediente("Tocino Extra");

        System.out.println("--- Receta Base en la Carta ---");
        hawayanaBase.mostrar();

        System.out.println("\n--- Pedido 1 (Copia exacta) ---");
        pedido1.mostrar();

        System.out.println("\n--- Pedido 2 (Copia personalizada) ---");
        pedido2.mostrar();
    }
}