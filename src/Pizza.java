import java.util.ArrayList;
import java.util.List;

public class Pizza implements PrototipoPizza {

    private String nombre;
    private String masa;
    private List<String> ingredientes;

    public Pizza(String nombre, String masa) {
        this.nombre = nombre;
        this.masa = masa;
        this.ingredientes = new ArrayList<>();
    }

    public void agregarIngrediente(String ingrediente) {
        ingredientes.add(ingrediente);
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Constructor de copia: usado internamente por clonar().
    private Pizza(Pizza original) {
        this.nombre = original.nombre;
        this.masa = original.masa;
        // Copia PROFUNDA de la lista: si solo duplicáramos la referencia,
        // al agregarle tocino a un pedido cambiaríamos la receta original del menú.
        this.ingredientes = new ArrayList<>(original.ingredientes);
    }

    @Override
    public Pizza clonar() {
        return new Pizza(this);
    }

    public void mostrar() {
        System.out.println("Pizza: " + nombre + " (" + masa + ")");
        System.out.println("Ingredientes: " + ingredientes);
    }
}