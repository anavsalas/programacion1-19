/*
Haga un programa que solicita al usuario digitar un año y le indica si el mismo es bisiesto o no.

Un año es bisiesto si es múltiplo de 4; 
excepto si es múltiplo de 100; en cuyo caso será bisiesto si es múltiplo de 400.

El programa debe ser capaz de manejar excepciones para evitar terminar abruptamente.
*/
public class CalendarioGregoriano{
	
	public boolean esBisiesto(int anyo){
		boolean anyoBisiesto = false;
		if (anyo % 4 == 0){
			if ((anyo % 100 != 0 || anyo % 400 == 0)){
				anyoBisiesto = true;
			}
		}		
		return anyoBisiesto;
	}

	public static void main (String args[]){
		CalendarioGregoriano calendario = new CalendarioGregoriano();
		Interfaz interfaz = new Interfaz();
		int anyo = interfaz.solicitarNumeroEntero("Digite un anyo para saber si es bisiesto");
		if (anyo > 0){
			boolean esAnyoBisiesto = calendario.esBisiesto(anyo);
			if (esAnyoBisiesto){
				System.out.println("El anyo: "+ anyo + " es bisiesto");
			}
			else{
				System.out.println("El anyo: "+ anyo + " no es bisiesto");
			}
		}
		else{
			System.out.println("El anyo digitado debe ser mayor a 0");
		}
	}

}
