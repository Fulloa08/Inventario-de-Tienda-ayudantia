import java.util.Scanner;

public class Ayudantia {
    public static void main(String[] args) {
        String[][] productos = new String[10][3];

        inicializarMatriz(productos, "1", "Manzanas", "50");
        inicializarMatriz(productos, "2", "Naranjas", "30");
        inicializarMatriz(productos, "3", "Peras", "25");
        inicializarMatriz(productos, "4", "Plátanos", "40");
        inicializarMatriz(productos, "5", "Fresas", "15");

        menu(productos);


    }

    public static void menu(String[][] productos) {
        Scanner scanner = new Scanner(System.in);

        int opcion = 0;

        do {
            System.out.println("-------- MENU PRINCIPAL ------------");
            System.out.println("1. Agregar productos al inventario");
            System.out.println("2. Restar productos al inventario");
            System.out.println("3. Consultar Disponibilidad de un producto");
            System.out.println("4. Listar todos los productos");
            System.out.println("5. Salir");

            System.out.println("Por favor digite la opción: ");
            opcion = scanner.nextInt();
            switch (opcion) {
                case 1:
                    agregarProductos(productos, "1", "4");
                    break;
                case 2:
                    restarProductos(productos, "2","5");
                    break;
                case 3:
                    consultarDisponibilidad(productos,"3");
                    break;
                case 4:
                    listarProductos(productos);
                    break;
                default:
                    System.out.println("Opción Inválida");
            }
        } while (opcion != 5);

        System.out.println("EL PROGRAMA HA FINALIZADO");

    }

    public static void agregarProductos(String productos[][], String idProducto, String cantidad) {
        try {
            int cantidadAgregar = Integer.parseInt(cantidad);
            for (int i = 0; i < productos.length; i++) {
                if (productos[i][0].equals(idProducto) && productos[i][0] != null) {
                    int cantidadActual = Integer.parseInt(productos[i][2]);

                    productos [i][2] = Integer.toString(cantidadActual + cantidadAgregar);

                    System.out.println("La cantidad se ha agregado exitosamente.");
                    break;
                }
            }

        } catch (NumberFormatException e) {
            System.out.println("La cantidad ingresada debe ser un número válido.");
        } catch (Exception e) {
            System.out.println("Ocurrio un error al agregar el producto." + e.getMessage());
        }
    }


    public static void restarProductos(String productos[][], String idProducto, String cantidad) {
        try {
            int cantidadRestar = Integer.parseInt(cantidad);
            for (int i = 0; i < productos.length; i++) {
                if (productos[i][0].equals(idProducto) && productos[i][0] != null) {
                    int cantidadActual = Integer.parseInt(productos[i][2]);

                    if(cantidadActual >= cantidadRestar){
                        productos [i][2] = Integer.toString(cantidadActual - cantidadRestar);
                        System.out.println("La cantidad se ha restado exitosamente.");

                    } else {
                        System.out.println("Error : No hay sufieciente cantidad para ser restada");
                    }
                    break;
                }
            }
        } catch (NumberFormatException e){
            System.out.println("La cantidad ingresada debe ser un número válido.");
        } catch (Exception e) {
            System.out.println("Ocurrio un error al restar el producto." + e.getMessage());
        }

    }

    public static void consultarDisponibilidad(String productos[][], String idProducto) {
        boolean encontrado = false;
        for (int i = 0; i < productos.length; i++) {
            if (productos[i][0] != null && productos[i][0].equals(idProducto)) {
                System.out.println("La cantidad del Producto "+ idProducto + " es de: " + productos[i][2]);
                encontrado = true;
                break;
            }
        }
        if (!encontrado) {
            System.out.println("Producto con ID " + idProducto + " no encontrado.");
        }
    }


    public static void listarProductos(String productos[][]) {
        for (int i = 0; i < productos.length; i++) {
            if (productos[i][0] != null) {
                System.out.println("Fila " + (i + 1) + ": " + productos[i][0] + " - " + productos[i][1] + " - " + productos[i][2]);
            }
        }

    }

    public static String[][] inicializarMatriz(String productos[][], String idProducto, String nombreProducto, String cantidad) {
        for (int i = 0; i < productos.length; i++) {
            if (productos[i][0] == null) {
                productos[i][0] = idProducto;
                productos[i][1] = nombreProducto;
                productos[i][2] = cantidad;
                break;
            }
        }
        return productos;
    }

    }

