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
    
public boolean eliminar(String tituloABuscar) {
    // Recorremos la lista para buscar el título
    for (int i = 0; i < lista.size(); i++) {
        // Usamos .equalsIgnoreCase para que no importe si escriben en mayúsculas o minúsculas
        if (lista.get(i).getTitulo().equalsIgnoreCase(tituloABuscar)) {
            lista.remove(i);
            return true; // Encontrado y borrado
        }
    }
    return false; // No se encontró
}}