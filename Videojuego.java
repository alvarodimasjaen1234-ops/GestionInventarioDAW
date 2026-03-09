public class Videojuego {
    private String titulo;
    private String plataforma;
    private double precio;

    // Constructor
    public Videojuego(String titulo, String plataforma, double precio) {
        this.titulo = titulo;
        this.plataforma = plataforma;
        this.precio = precio;
    }

    // Getters y Setters (Importante en DAW)
    public String getTitulo() { return titulo; }
    public void setTitulo(String titulo) { this.titulo = titulo; }

    // El método toString para imprimir bonito
    @Override
    public String toString() {
        return "Título: " + titulo + " | Plataforma: " + plataforma + " | Precio: " + precio + "€";
    }
}