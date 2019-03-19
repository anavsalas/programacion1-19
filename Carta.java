public class Carta{
	// Declaracion de atributos:
	private String palo; // un atributo de tipo texto que contiene el palo
	private int numero; // un atributo de tipo entero que contiene el numero


	//Declaracion de un método:
	//1. Si es publico o privado (accesible desde la instancia)
	//2. Que quiero que retorne el metodo
	//3. Como se llama el método
	//4. Que necesito que reciba el método para funcionar

	public void setPalo(String paloParametro){
		palo = paloParametro;
	}

	public void setNumero(int numeroParametro){
		numero = numeroParametro;
	}

	public void imprimir(){
		String contenido = "La carta es:\n";
		contenido = contenido +"\t"+ numero + " de " + palo + "\n";
		System.out.println(contenido);
	}

}