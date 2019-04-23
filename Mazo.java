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

	public void revolver(){
		for (int  i = 0 ; i  < cartas.length; i++){
			int aleatorio = (int)(Math.random()*52); //[0,51]
			intercambiarValores(cartas,i,aleatorio);
		}
	}

	private void intercambiarValores(Carta [] arregloReferencia, int indice1, int indice2){
		if (indice1 >=0 && indice2 >= 0 && indice1 < arregloReferencia.length && indice2 < arregloReferencia.length){
			Carta temporal = arregloReferencia[indice1];
			arregloReferencia[indice1] = arregloReferencia[indice2];
			arregloReferencia[indice2] = temporal;	
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
		System.out.println(mazo);
		//System.out.println(mazo);
		//JOptionPane.showMessageDialog(null, mazo);
		//mazo.imprimirNumero(41);
		//mazo.imprimirNumero(30);
		mazo.revolver();
		System.out.println("- - - - - - - - - - - - - - - - - - - - - - - ");
		System.out.println(mazo);
	}



}