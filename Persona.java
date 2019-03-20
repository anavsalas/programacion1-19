public class Persona{

	// Atributos

	// Para definir un tipo de dato:
	// Declaramos el valor privado
	// Definimos qué tipo de dato es
	// Damos un nombre a la variable
	private String nombre;

	// Métodos
	// Acciones o métodos:
	// método publico o privado
	// lo que esperamos que retorne el método
	// El nombre del método
	// Los parámetros (lo que necesitamos recibir para que el métood funcione)
	public void setNombre(String nombreParametro){
		nombre = nombreParametro;
	}

	public void saludar()
	{
		System.out.println("Hola me llamo " + this.nombre);
	}
	/* 	Esto es un comentario
		de varias líneas
	*/


	public static void main (String args[]){
		// NombreDeClase nombreInstancia = new NombreClase();
		Persona persona1 = new Persona();
		persona1.setNombre("María");
		persona1.saludar();

		Persona persona2 = new Persona();
		persona2.setNombre("Andrés");
		persona2.saludar();

		Persona persona3 = new Persona();
		persona3.saludar();
	}
}