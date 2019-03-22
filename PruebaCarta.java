public class PruebaCarta{
	public static void main (String args[]){

		Carta carta1 = new Carta();
		carta1.setPalo("Corazones");
		carta1.setNumero(10);
		carta1.imprimir();

		Carta carta2 = new Carta();
		carta2.imprimir();
		carta2.setPalo("Treboles");
		carta2.setNumero(7);
		carta2.imprimir();

		String paloDeLaCarta2 = carta2.getPalo();
		System.out.println("El palo de la carta 2 es: "+ paloDeLaCarta2);

		int numeroDeLaCarta2 = carta2.getNumero();
		System.out.println("El numero de la carta 2 es: "+ (numeroDeLaCarta2+1));

	}
}