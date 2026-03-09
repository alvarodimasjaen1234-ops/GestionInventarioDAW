import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        GestorInventario miGestor = new GestorInventario();
        int opcion;

        do {
            System.out.println("\n--- GESTOR DE VIDEOJUEGOS ---");
            System.out.println("1. Añadir videojuego");
            System.out.println("2. Mostrar inventario");
            System.out.println("0. Salir");
            System.out.print("Elige una opción: ");
            opcion = sc.nextInt();
            sc.nextLine(); // Limpiar el buffer

            switch (opcion) {
                case 1:
                    System.out.print("Título: ");
                    String t = sc.nextLine();
                    System.out.print("Plataforma: ");
                    String p = sc.nextLine();
                    System.out.print("Precio: ");
                    double pr = sc.nextDouble();
                    miGestor.agregar(new Videojuego(t, p, pr));
                    break;
                case 2:
                    miGestor.mostrarTodo();
                    break;
            }
        } while (opcion != 0);
    }
}