public class Arreglo{
	
	public static void main (String[] args){
		System.out.println("args.length " + args.length);
		if (args.length > 0){
			System.out.println(args[0]);	
			int x = Integer.parseInt(args[0]);
			int y = Integer.parseInt(args[1]);
			int suma = x + y;
			System.out.println("La suma es: " + suma);
		}


		int [] arreglo1 = new int [10];
		System.out.println(arreglo1);
		for (int i = 0; i < arreglo1.length; i++){
			System.out.print(arreglo1[i] + " ");
		}
		System.out.println();
		arreglo1[3] = 42;

		for (int i = 0; i < arreglo1.length; i++){
			System.out.print(arreglo1[i] + " ");
		}
		System.out.println();

		int celda3 = arreglo1[3];
		System.out.println("La celda 3 contiene: " + celda3);



	}


}