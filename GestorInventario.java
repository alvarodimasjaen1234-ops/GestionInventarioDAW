import java.util.ArrayList;

public class GestorInventario {
    private ArrayList<Videojuego> lista;

    public GestorInventario() {
        this.lista = new ArrayList<>();
    }

    public void agregar(Videojuego v) {
        lista.add(v);
        System.out.println("¡Añadido con éxito!");
    }

    public void mostrarTodo() {
        if (lista.isEmpty()) {
            System.out.println("El inventario está vacío.");
        } else {
            for (Videojuego v : lista) {
                System.out.println(v);
            }
        }
    }
    
    // Aquí podrías añadir luego: eliminar(String titulo) o buscar(String titulo)
}