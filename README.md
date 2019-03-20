| Tamaño del repositorio        | Hits           | Lenguaje utilizado|
| ------------- |:-------------:| :-------------:| 
| ![GitHub repo size in bytes](https://img.shields.io/github/repo-size/jciccio/programacion1-19.svg?style=for-the-badge)      | [![HitCount](http://hits.dwyl.com/jciccio/programacion1-19.svg)](http://hits.dwyl.com/jciccio/programacion1-19) | Java|

# Programación 1-19

## Material visto en clase
Ejemplos tomados del código fuente generado en las distintas lecciones.

Comentarios: elementos omitidos por el compilador a la hora de transformar el código fuente en código binario/ejecutable. Utilizado por el programador para comprender mejor qué se está codificando

```java
	// Esto es un comentario de una línea debe iniciar con (//), toda la línea es omitida

	/* 	Esto es un comentario
		de varias líneas se note los delimitadores utilizados al inicio
		y final 
	*/
```

1. Creación de objetos
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

