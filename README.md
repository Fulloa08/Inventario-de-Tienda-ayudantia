#*INVENTARIO DE TIENDA* 

##inicio del programa:
-Matriz de 10 filas y 3 columnas, las columnas tendrán el sigueinte identificador:
[0] = identificador.
[1] = nombre del producto.
[2] = cantidad disponible del producto. 

##Cuenta con un menú interactivo que tiene 4 opciones:
------Menú interactivo----------
1. Agregar productos al inventario: aumenta la cantidad de un producto especifico en el inventario, por lo tanto debe tomar como parametro la eleccion del usuario que en este caso es la idProducto, también debe poder agregar cantidad a la columna 2 de la fila del idProducto. hace uso del metodo agregarProductos.
2. Restar produtos del Inventario: Disminuye la cantidad de un producto especificado por el usuario.
3. Consultar Disponibilidad de un Producto: permite verificar la cantidad especifica de un producto, a traves de la busqueda por ID.
4. Listar todos los productos: Muestra una lista con todos los productos del inventario.
5. Salir

##Metodos:
-agregarProductos(int idProducto, int cantidad): toma como parametro de enteros la columna [0] y la [2], hace busqueda en la columna[0] de la matriz a traves del identificador entregado por el usuario y si coincide con alguna de las filas de la columna[0], permite sumar algún entero entregado por el usuario a la cantidad correspondiente a ese indentificador. No retorna nada, así que se haría uso de un retorno void.

-restarProductos(int idProducto, int cantidad): realizaría una función parecida al metodo agregarProductos, solo que debería poder restar cantidades mediante un entero entregado por el usuario, en este metodo si el entero entregado es mayor que la cantidad que se quiere restar, no deberia permitirle al usuario realizar esta acción. Ya que, no pueden haber cantidades negativas. Hace uso de un retorno void.

-consultarDisponibilidad(int idProducto): Tiene que hacer busqueda mediante el idProducto entregado por el usario y entregar la cantidad del idProducto buscado por el usuario. Retorna el entero asociado a la cantidad del idProducto.

-listarProductos(): Imprime toda la matriz con todos sus contenidos ignorando los espacios vacios.

Cada operación debe manejar los errores usando try-catch.

##Pruebas unitarias:
Validar que los errores (intentos inválidos de agregar/restar, identificadores incorrectos, etc.) sean manejados correctamente con las excepciones correspondientes.

