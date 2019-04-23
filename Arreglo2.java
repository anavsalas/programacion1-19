public class Arreglo2{
	

	public int[] copiarArreglo(int [] arreglo){
		int [] copia = new int [arreglo.length];
		for (int i = 0 ; i  < arreglo.length ; i++){
			copia[i] = arreglo[i];
		} 
		return copia;
	}
	

	public int [] intercambiarValores(int [] arregloReferencia, int indice1, int indice2){
		int [] arreglo = copiarArreglo(arregloReferencia);
		if (indice1 >=0 && indice2 >= 0 && indice1 < arregloReferencia.length && indice2 < arregloReferencia.length){
			int temporal = arreglo[indice1];
			arreglo[indice1] = arreglo[indice2];
			arreglo[indice2] = temporal;	
		}
		return arreglo;
	}

	public void imprimirArreglo(int [] arreglo){
		for(int i = 0 ; i < arreglo.length ; i++){
			System.out.print(arreglo[i] + " ");
		}
		System.out.println();
	}

	public static void main (String args[]){
		Arreglo2 a1 = new Arreglo2();
		int [] arreglo1 = {10,20,30,40};
		a1.imprimirArreglo(arreglo1);
		int [] resultado = a1.intercambiarValores(arreglo1, 3 , 1);
		a1.imprimirArreglo(resultado);
		a1.imprimirArreglo(arreglo1);
	}


}