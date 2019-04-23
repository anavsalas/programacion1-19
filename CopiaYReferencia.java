public class CopiaYReferencia{
	

	public int [] intercambiarValoresReferencia(int [] arreglo){
		int temporal = arreglo[0];
		arreglo[0] = arreglo[2];
		arreglo[2] = temporal;
		System.out.println("Direccion memoria en intercambiarValoresReferencia: "+ arreglo);
		return arreglo;
	}

	public void imprimirArreglo(int [] arreglo){
		for(int i = 0 ; i < arreglo.length ; i++){
			System.out.print(arreglo[i] + " ");
		}
		System.out.println();
	}

	public int copiaValores(int x){
		x = x + 10;
		return x;
	}

	public static void main (String [] args){
		CopiaYReferencia instanciaCopiaYReferencia = new CopiaYReferencia();
		int [] arreglo1 = {10,20,30,40};
		System.out.println("Direccion memoria en main: "+ arreglo1);
		int [] resultado = instanciaCopiaYReferencia.intercambiarValoresReferencia(arreglo1);
		instanciaCopiaYReferencia.imprimirArreglo(arreglo1);
		instanciaCopiaYReferencia.imprimirArreglo(resultado);

		int x = 10;
		System.out.println("X vale: "+ x);
		int y = instanciaCopiaYReferencia.copiaValores(x);
		System.out.println("X vale: "+ x);
		System.out.println("Y vale: "+ y);

	}

}