import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class AyudantiaTest {

    private String[][] productos;
    private Ayudantia ayudantia;

    @BeforeEach
    void setUp() {
        // Inicializar la matriz de productos y la instancia de la clase Ayudantia
        productos = new String[10][3];
        ayudantia = new Ayudantia();
        ayudantia.inicializarMatriz(productos, "1", "Manzanas", "50");
        ayudantia.inicializarMatriz(productos, "2", "Naranjas", "30");
        ayudantia.inicializarMatriz(productos, "3", "Peras", "25");
        ayudantia.inicializarMatriz(productos, "4", "Plátanos", "40");
        ayudantia.inicializarMatriz(productos, "5", "Fresas", "15");
    }

    @Test
    void testAgregarProductos() {
        ayudantia.agregarProductos(productos, "1", "20");

        int cantidad = Integer.parseInt(productos[0][2]);
        assertEquals(70, cantidad, "La cantidad de manzanas debería ser 70");
    }

    @Test
    void testRestarProductos() {
        ayudantia.restarProductos(productos, "2", "10");

        int cantidad = Integer.parseInt(productos[1][2]);
        assertEquals(20, cantidad, "La cantidad de naranjas debería ser 20");
    }

    @Test
    void testConsultarDisponibilidad() {
        String[][] productos = new String[10][3];
        Ayudantia.inicializarMatriz(productos, "1", "Manzanas", "50");
        Ayudantia.inicializarMatriz(productos, "2", "Naranjas", "30");
        Ayudantia.inicializarMatriz(productos, "3", "Peras", "25");
        Ayudantia.inicializarMatriz(productos, "4", "Plátanos", "40");
        Ayudantia.inicializarMatriz(productos, "5", "Fresas", "15");

        String output = getSystemOutput(() -> Ayudantia.consultarDisponibilidad(productos, "3"));
        assertTrue(output.contains("La cantidad del Producto 3 es de: 25"), "El mensaje de disponibilidad debería ser correcto");

        output = getSystemOutput(() -> Ayudantia.consultarDisponibilidad(productos, "999"));
        assertTrue(output.contains("Producto con ID 999 no encontrado."), "El mensaje para un producto no encontrado debería ser correcto");
    }


    @Test
    void testListarProductos() {
        String output = getSystemOutput(() -> ayudantia.listarProductos(productos));

        assertTrue(output.contains("1 - Manzanas - 50"), "La lista debería contener Manzanas con cantidad 50");
        assertTrue(output.contains("2 - Naranjas - 30"), "La lista debería contener Naranjas con cantidad 30");
    }

    @Test
    void testInicializarMatriz() {
        String[][] result = ayudantia.inicializarMatriz(productos, "6", "Kiwi", "10");

        assertEquals("6", result[5][0], "El ID del producto debería ser 6");
        assertEquals("Kiwi", result[5][1], "El nombre del producto debería ser Kiwi");
        assertEquals("10", result[5][2], "La cantidad del producto debería ser 10");
    }

    private String getSystemOutput(Runnable action) {
        java.io.ByteArrayOutputStream outContent = new java.io.ByteArrayOutputStream();
        System.setOut(new java.io.PrintStream(outContent));
        action.run();
        System.setOut(System.out);
        return outContent.toString();
    }
}
