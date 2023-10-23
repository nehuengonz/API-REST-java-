# API-REST-java-
programa desarrollado en java con Spring boot, mysql workbench, y thunder
ejercicio realizado para la dplomatura en springboot con java 

CONSIGNA:
"
- Objetivo: Diseñar una muestra de funcionamiento de una API RESTful para gestionar productos.
En cuanto a las especificaciones técnicas, nuestro Líder Técnico requiere lo siguiente:

- Los productos tienen: id, nombre, stock, precio.
- Se deben gestionar las siguientes operaciones: listar productos con sus cantidades en stock; buscar productos por id; modificar productos; eliminar productos.
-En la ruta en la que se pueden agregar productos, necesitamos que se pueda ingresar el precio de costo de los mismos, mientras que en la ruta en la que se muestran al cliente, se realice un incremento del 50% del valor de costo del producto para la venta.
-Utilizar Spring Boot y JPA para la implementación.
-Proporcionar especificaciones claras de las endpoints, distinguiendo una ruta para el comerciante y otra para los clientes (a quien sólo se muestran los precios de consumidor final, no pueden modificar, agregar ni eliminar productos).
"



COMO PROBAR EL PROGRAMA:
tener la version java 17,
descargar la extension thunder en visual studio code,descargar la extension de springboot initializer java suport,descargar mysql workbench version completa (340 mb).

1.abrir el proyecto y ejecutar el archivo "trabajopractico1\src\main\java\com\example\trabajopractico1\ServletInitializer.java"
si no hay problemas deberia mantenerse ejecutado el servidor(verificar que mysql este funcionando correctamente con las mismas plication propeties utilizadas en el proyecto)
2.ir a la extension de thunder en la parte izquierda de visual studios.
3.crear una  "new request"\
4.ir al body y agregar un archivo json con la siguiente estructura.
{
  "nombre": "Producto 1000 ",
  "stock": 0,
  "precio": 0
}
esta api rest puede realizar las operaciones basicas GET,POST,PUT y DELETE.
por lo tanto tendria que realizar un post en la ruta "localhost:8080/producto/1"
5. el producto deberia agregarse exitosamente en la table de mysql workbench
6.todas las rutas realizadas se encuentran en el archivo "src\main\java\com\example\trabajopractico1\productoControlador\ProductoControlador.java"
estas son:
"
localhost:8080/Producto
localhost:8080/all(listar productos)
localhost:8080/Producto/{id}
localhost:8080/clientes/{id}
"
eso seria todo por este proyecto, muchas gracias si as llegado hasta aqui y utilizaste este proyecto, es una buena practica como introduccion al funcionamiento de una API REST simple, cualquier duda o consulta contacteme por md o gmail y respodere con gusto.
