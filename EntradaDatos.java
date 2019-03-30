import java.util.Scanner; 

public class EntradaDatos{
	
	public int convertirStringAInt(String valor){
		int numero = 0;
		try{
			numero = Integer.parseInt(valor);
		}
		catch(NumberFormatException e){
			System.out.println("Ocurrio un error al convertir: " + valor);
		}
		return numero;
	}


	public static void main (String args[]){
		EntradaDatos ed = new EntradaDatos();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite su nombre: ");
		String resultados = scanner.nextLine();
		System.out.println("Hola "+ resultados+ "!");

		System.out.println("Digite un valor: ");
		String valor1 = scanner.nextLine();
		int numero1 = ed.convertirStringAInt(valor1);

		System.out.println("Digite otro valor: ");
		String valor2 = scanner.nextLine();
		
		int numero2 = ed.convertirStringAInt(valor2);

		Calculadora c1 = new Calculadora();
		int resultado = c1.sumar(numero1,numero2);
		System.out.println("La suma de " + numero1 + " + " + numero2 +" es: "+resultado);
	}


}