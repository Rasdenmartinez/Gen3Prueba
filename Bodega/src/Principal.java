import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Principal {
    private List<Articulo> bodega;
    private Scanner scanner;

    public Principal() {
        bodega = new ArrayList<>();
        scanner = new Scanner(System.in);
    }

    public void mostrarMenu() {
        int opcion;
        do {
            System.out.println("----- MENÚ -----");
            System.out.println("1. Agregar nuevo artículo");
            System.out.println("2. Editar datos de un artículo");
            System.out.println("3. Buscar un artículo por código de barras");
            System.out.println("4. Eliminar un artículo");
            System.out.println("5. Buscar artículos por nombre");
            System.out.println("6. Mostrar lista de artículos disponibles");
            System.out.println("7. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer del scanner

            switch (opcion) {
                case 1:
                    agregarArticulo();
                    break;
                case 2:
                    editarArticulo();
                    break;
                case 3:
                    buscarPorCodigoBarras();
                    break;
                case 4:
                    eliminarArticulo();
                    break;
                case 5:
                    buscarPorNombre();
                    break;
                case 6:
                    mostrarArticulosDisponibles();
                    break;
                case 7:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción inválida. Por favor, seleccione una opción válida.");
                    break;
            }
        } while (opcion != 7);
    }

    public void agregarArticulo() {
        System.out.println("----- Agregar nuevo artículo -----");
        System.out.print("Ingrese el ID: ");
        int id = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Ingrese el nombre: ");
        String nombre = scanner.nextLine();
        System.out.print("Ingrese el código de barras: ");
        long codigoBarras = scanner.nextLong();
        System.out.print("Ingrese el precio: ");
        double precio = scanner.nextDouble();
        System.out.print("Ingrese la existencia: ");
        int existencia = scanner.nextInt();
        scanner.nextLine();

        Articulo articulo = new Articulo(id, nombre, codigoBarras, precio, existencia);
        bodega.add(articulo);
        System.out.println("Artículo agregado exitosamente.");
    }

    public void editarArticulo() {
        System.out.println("----- Editar datos de un artículo -----");
        System.out.print("Ingrese el ID del artículo a editar: ");
        int id = scanner.nextInt();
        scanner.nextLine();

        Articulo articulo = buscarArticuloPorId(id);
        if (articulo != null) {
            System.out.println("Ingrese los nuevos datos del artículo:");
            System.out.print("Nombre: ");
            String nombre = scanner.nextLine();
            System.out.print("Código de barras: ");
            long codigoBarras = scanner.nextLong();
            System.out.print("Precio: ");
            double precio = scanner.nextDouble();
            System.out.print("Existencia: ");
            int existencia = scanner.nextInt();
            scanner.nextLine();

            articulo.setNombre(nombre);
            articulo.setCodigoBarras(codigoBarras);
            articulo.setPrecio(precio);
            articulo.setExistencia(existencia);

            System.out.println("Datos del artículo actualizados exitosamente.");
        } else {
            System.out.println("No se encontró ningún artículo con el ID especificado.");
        }
    }
    private Articulo buscarArticuloPorId(int id) {
        for (Articulo articulo : bodega) {
            if (articulo.getId() == id) {
                return articulo;
            }
        }
        return null;
    }
    public void buscarPorCodigoBarras() {
        System.out.println("----- Buscar un artículo por código de barras -----");
        System.out.print("Ingrese el código de barras: ");
        long codigoBarras = scanner.nextLong();
        scanner.nextLine();

        Articulo articulo = buscarArticuloPorCodigoBarras(codigoBarras);
        if (articulo != null) {
            System.out.println("Artículo encontrado:");
            System.out.println(articulo);
        } else {
            System.out.println("No se encontró ningún artículo con el código de barras especificado.");
        }
    }
    private Articulo buscarArticuloPorCodigoBarras(long codigoBarras) {
        for (Articulo articulo : bodega) {
            if (articulo.getCodigoBarras() == codigoBarras) {
                return articulo;
            }
        }
        return null;
    }
    public void eliminarArticulo() {
        System.out.println("----- Eliminar un artículo -----");
        System.out.print("Ingrese el ID del artículo a eliminar: ");
        int id = scanner.nextInt();
        scanner.nextLine();

        Articulo articulo = buscarArticuloPorId(id);
        if (articulo != null) {
            bodega.remove(articulo);
            System.out.println("Artículo eliminado exitosamente.");
        } else {
            System.out.println("No se encontró ningún artículo con el ID especificado.");
        }
    }

    public void buscarPorNombre() {
        System.out.println("----- Buscar artículos por nombre -----");
        System.out.print("Ingrese el nombre: ");
        String nombre = scanner.nextLine();

        List<Articulo> articulosEncontrados = buscarArticulosPorNombre(nombre);
        if (!articulosEncontrados.isEmpty()) {
            System.out.println("Artículos encontrados:");
            for (Articulo articulo : articulosEncontrados) {
                System.out.println(articulo);
            }
        } else {
            System.out.println("No se encontraron artículos con el nombre especificado.");
        }
    }
    private List<Articulo> buscarArticulosPorNombre(String nombre) {
        List<Articulo> articulosEncontrados = new ArrayList<>();
        for (Articulo articulo : bodega) {
            if (articulo.getNombre().equalsIgnoreCase(nombre)) {
                articulosEncontrados.add(articulo);
            }
        }
        return articulosEncontrados;
    }
    public void mostrarArticulosDisponibles() {
        System.out.println("----- Mostrar lista de artículos disponibles -----");
        if (!bodega.isEmpty()) {
            System.out.println("Artículos disponibles:");
            for (Articulo articulo : bodega) {
                System.out.println(articulo);
            }
        } else {
            System.out.println("No hay artículos disponibles en la bodega.");
        }
    }

}