| Tamaño del repositorio        | Hits           | Lenguaje utilizado|
| ------------- |:-------------:| :-------------:| 
| ![GitHub repo size in bytes](https://img.shields.io/github/repo-size/jciccio/programacion1-19.svg?style=for-the-badge)      | [![HitCount](http://hits.dwyl.com/jciccio/programacion1-19.svg)](http://hits.dwyl.com/jciccio/programacion1-19) | Java|

# Programación 1-19

## Material visto en clase
Ejemplos tomados del código fuente generado en las distintas lecciones.

### Comentarios
Elementos omitidos por el compilador a la hora de transformar el código fuente en código binario/ejecutable. Utilizado por el programador para comprender mejor qué se está codificando

```java
// Esto es un comentario de una línea debe iniciar con (//), toda la línea es omitida

/* Esto es un comentario
  de varias líneas se note los delimitadores utilizados al inicio
  y final 
*/
```

### Creación de objetos
  * Creación de clases (class)
  ```java
  public class Carta //Declaración de una clase, usando las palabra resevadas public class
  ```
  
  * Creación de variables de instancia o atributos de clase
  ```java
	// Atributos

	// Para definir un tipo de dato:
	// Declaramos el valor privado
	// Definimos qué tipo de dato es
	// Damos un nombre a la variable
	private String nombre;
  ```
  * Creación de métodos de un objeto
  ```java
	// Métodos
	// Acciones o métodos:
	// método publico o privado
	// lo que esperamos que retorne el método
	// El nombre del método
	// Los parámetros (lo que necesitamos recibir para que el método funcione)
	public void setNombre(String nombreParametro){
		nombre = nombreParametro;
	}
  ```

  * Generación de instancias (declaración e inicialización de objetos o tipos no primitivos)
  ```java
// NombreDeClase nombreInstancia = new NombreClase();
Persona persona1 = new Persona();
  ```

  
### Transformación de tipos de datos utilizando __Casting__
```java
 float(), double(), int(), +
```

| Método        | Descripción           | Ejemplo
| ------------- |:-------------:| :-------------:|
| double()        | Conversión a número real  | float(12) --> 12.0
| int()        | Conversión a número entero  | int(12.4) --> 12
| +        | Conversión a hilera de caracteres | "" + 12 --> "12"

* Conversión de String a números:

| Método        | Descripción           | Ejemplo
| ------------- |:-------------:| :-------------:|
| Double.parseDouble(hilera)        | Conversión a número real  | Double.parseDouble("12.4") --> 12.4
| Integer.parseInt(hilera)        | Conversión a número entero  | Integer.parseInt("15") --> 15

### Solicitud de datos al usuario

* Consola
Import necesario:
```java
import java.util.Scanner;
```
Ejemplo:
```java
Scanner scanner = new Scanner(System.in);
System.out.println("Digite su nombre: ");
String nombre = scanner.nextLine();
```
* JOptionPane (utilizando una ventana emergente:

Import necesario:
```java
import javax.swing.JOptionPane;
```
Ejemplo:
```java
String nombre = JOptionPane.showInputDialog("Digite su nombre");
```
