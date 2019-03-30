public class Calculadora{
	
	// Sobrecarga de métodos
	// Uno puede tener dos metodos con el mismo nombre
	// siempre y cuando reciban distintos tipos de datos como parametro
	// y no exista confusión entre ellos

	// la firma de un metodo esta dada por su nombre y los parametros
	public int sumar(int valor1, int valor2){
		System.out.println("sumar(int valor1, int valor2)");
		return valor1 + valor2;
	}

	public int sumar(int valor1, int valor2, int valor3){
		System.out.println("sumar(int valor1, int valor2, int valor3)");
		return valor1 + valor2 + valor3;
	}

	public double sumar(double v1, double v2){
		System.out.println("sumar(double v1, double v2)");
		double resultado = v1+ v2;
		return resultado;
	}

	public double sumar(int v1, double v2){
		System.out.println("sumar(int v1, double v2)");
		return v1 + v2;
	}

	public double sumar(double v1, int v2){
		System.out.println("sumar(double v1, int v2)");
		return v1 + v2;
	}


	public static void main (String args[]){
		Calculadora c1 = new Calculadora();
		System.out.println(c1.sumar(10,20));
		System.out.println(c1.sumar(10,20,30));
		System.out.println(c1.sumar(10.5,20));
		System.out.println(c1.sumar(10.5,20.7));
		System.out.println(c1.sumar(10,20.7));
	}


}