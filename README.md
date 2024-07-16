Conversor de Monedas
Bienvenido/a al Conversor de Monedas, una aplicación Java que te permite convertir entre distintas monedas utilizando las tasas de cambio actuales. La aplicación soporta conversiones entre Dólar, Peso argentino, Real brasileño y Peso colombiano.

Características
Conversión entre Dólar y Peso argentino
Conversión entre Peso argentino y Dólar
Conversión entre Dólar y Real brasileño
Conversión entre Real brasileño y Dólar
Conversión entre Dólar y Peso colombiano
Conversión entre Peso colombiano y Dólar
Requisitos
Java 8 o superior
Una conexión a internet para consultar las tasas de cambio
Uso
Para ejecutar la aplicación, compila y ejecuta la clase Main.java.

sh
Copy code
javac Main.java
java Main
Menú de Opciones
Al iniciar la aplicación, verás un menú con las siguientes opciones:

markdown
Copy code
*****************************************
¡Bienvenido/a al Conversor de Monedas!

1 - Dolar --> Peso argentino
2 - Peso argentino --> Dolar
3 - Dolar --> Real brasileño
4 - Real brasileño --> Dolar
5 - Dolar --> Peso colombiano
6 - Peso colombiano --> Dolar
7 - Salir

Elija una opcion tecleando un numero:
*****************************************
Selecciona la opción deseada ingresando el número correspondiente y luego ingresa el monto a convertir. La aplicación mostrará el resultado de la conversión y lo guardará en un archivo JSON.

Estructura del Código
Main.java: Contiene el método main y el menú interactivo para seleccionar las opciones de conversión.
ConsultaDeMoneda.java: Clase que maneja la lógica de consulta de tasas de cambio.
Moneda.java: Clase que representa una moneda y su resultado de conversión.
GeneradorDeArchivo.java: Clase encargada de guardar los resultados de las conversiones en un archivo JSON.
Manejo de Errores
La aplicación incluye manejo básico de errores para garantizar que cualquier problema inesperado durante la consulta de tasas de cambio sea capturado y manejado adecuadamente.

Ejemplo de Uso
A continuación, se muestra un ejemplo de cómo se utiliza la aplicación:

Ejecuta la aplicación y selecciona la opción 1 para convertir Dólar a Peso argentino.
Ingresa el monto a convertir, por ejemplo, 100.
La aplicación mostrará el resultado de la conversión y lo guardará en un archivo JSON.
markdown
Copy code
*****************************************
¡Bienvenido/a al Conversor de Monedas!

1 - Dolar --> Peso argentino
2 - Peso argentino --> Dolar
3 - Dolar --> Real brasileño
4 - Real brasileño --> Dolar
5 - Dolar --> Peso colombiano
6 - Peso colombiano --> Dolar
7 - Salir

Elija una opcion tecleando un numero: 
*****************************************

Ingrese el monto a convertir: 
100
La conversion es de: 8700.50
Contribuciones
Las contribuciones son bienvenidas. Si deseas mejorar la aplicación, por favor abre un issue o envía un pull request en el repositorio.

Licencia
Este proyecto está licenciado bajo la Licencia MIT.

