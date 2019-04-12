import javax.swing.*;
public class Mazo{
	
	private Carta [] cartas;

	public Mazo(){
		// cada palo tiene: 13 cartas
		// hay 4 palos
		cartas = new Carta [52];
		int contador = 0;
		for (int j = 0 ; j < 4 ; j++){
			String [] palos = {"Corazones", "Treboles" , "Diamantes" , "Espadas"}; 
			for (int i = 1 ; i <=13 ; i++){
				Carta cartaInstancia = new Carta(i,palos[j]);
				cartas[contador] = cartaInstancia;
				contador++;
			}
		} 
	}

	public void imprimir(){
		for(int i = 0 ; i< this.cartas.length; i++){
			System.out.println(this.cartas[i]);
		}
	}

	public String toString(){
		String contenido = "";
		for(int i = 0 ; i< this.cartas.length; i++){
			contenido += (this.cartas[i] + "\n");
		}
		return contenido;
	}

	public void imprimirNumero(int numeroCarta){
		int numero = this.cartas[numeroCarta].getNumero();
		System.out.println(numero);
	}



	public static void main (String args[]){
		Mazo mazo = new Mazo();
		//mazo.imprimir();
		System.out.println(mazo);
		//JOptionPane.showMessageDialog(null, mazo);
		mazo.imprimirNumero(41);
		mazo.imprimirNumero(30);
	}



}