*INVENTARIO DE TIENDA* 

inicio del programa:
-Matriz de 10 filas y 3 columnas, las columnas tendrán el sigueinte identificador:
[0] = identificador.
[1] = nombre del producto.
[2] = cantidad disponible del producto. 

cuenta con un menú interactivo que tiene 4 opciones:
------Menú interactivo----------
1. Agregar productos al inventario: aumenta la cantidad de un producto especifico en el inventario, por lo tanto debe tomar como parametro la eleccion del usuario que en este caso es la idProducto, también debe poder agregar cantidad a la columna 2 de la fila del idProducto. hace uso del metodo agregarProductos.
2. Restar produtos del Inventario: Disminuye la cantidad de un producto especificado por el usuario.
3. Consultar Disponibilidad de un Producto: permite verificar la cantidad especifica de un producto, a traves de la busqueda por ID.
4. Listar todos los productos: Muestra una lista con todos los productos del inventario.
5. Salir

Metodos:
agregarProductos(int idProducto, int cantidad): toma como parametro de enteros la columna [0] y la [2], hace busqueda en la columna[0] de la matriz a traves del identificador entregado por el usuario y si coincide con alguna de las filas de la columna[0], permite sumar algún entero entregado por el usuario a la cantidad correspondiente

