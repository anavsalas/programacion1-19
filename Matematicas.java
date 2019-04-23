public class Matematicas{
   
   private Interfaz interfazUsuario;

   public Matematicas(){
      interfazUsuario = new Interfaz();
   }

   public void calcularPi(int cantidadCalculos){
      double resultado = 1;
      if(cantidadCalculos == 1){
         resultado = 4 * (1 - 1/3);
      }
      else {
         for(int i = 3 ; i <= cantidadCalculos ; i+=2){
            if(i%4 == 1){
               resultado += (double)1/i;
            }
            else{
               resultado -= (double)1/i;
            }
         }
         resultado *=4;
      }
      System.out.println(resultado);
   }

   public double calcularPromedioWhile(){
      double suma = 0;
      int n = 0; // iteraciones que se harán y servirá como condición de parada

      while(n < 5){
         suma += interfazUsuario.solicitarNumeroEntero("Digite un numero (while)");
         n++; // cambio de condición
      }
      return suma/5;
   }

   public double calcularPromedioDoWhile(){
      double suma = 0;
      int n = 0;

      do {
         suma += interfazUsuario.solicitarNumeroEntero("Digite un numero (do-while)");
         n++;
      }while(n < 5);
      return suma/5;
   }

   public double calcularPromedioFor(){
      double suma = 0;

      for (int  n = 0 ; n < 5 ; n++){
         suma += interfazUsuario.solicitarNumeroEntero("Digite un numero (for)");
      }

      return suma /5;
   }


   public void ejecucionCiclos(){
      for (int  n = 0 ; n < 5 ; n++){
         System.out.println("n++ For condicion: n<5 n vale: "+n);
      }

      for (int  n = 0 ; n < 5 ; n+=2){
         System.out.println("n+=2 For condicion: n<5 n vale: "+n);
      }

      int n = 0;
      while(n < 5){
         System.out.println("n While condicion: n<5 n vale: "+n);
         n++; // cambio de condición
      }

      n = 0;
      do{
         System.out.println("n Do-While condicion: n<5 n vale: "+n);
         n+=2; // cambio de condición
      }while(n < 5);

   }


   // Restriccion 1: numero debe ser >= 2
   // Ver si el numero es divisible utilizando el modulo (%) 
   // Para saber si es divisible el % del numero debe ser 0
   // Necesitamos un ciclo desde 2 hasta n-1
   public boolean esPrimo(int numero){
      boolean primo = true;
      if (numero >= 2){
         int contador = 2;
         // Mientras que sea primo y el contador sea < que el numero
         while(contador <= numero/2 && primo){
            if(numero % contador == 0){
               primo = false;
            }
            contador++;
         }
      }
      else{
         primo = false;
      }
      return primo;
   }


   public static void main (String args[]){

      Matematicas mate = new Matematicas();

      //mate.ejecucionCiclos();

    /*  System.out.println("Resultado con while: " + mate.calcularPromedioWhile());
      System.out.println("Resultado con do-while: " + mate.calcularPromedioDoWhile());
      System.out.println("Resultado con for: " + mate.calcularPromedioFor());

      System.out.println("2 es primo: "+ mate.esPrimo(2)); 
      System.out.println("23 es primo: "+ mate.esPrimo(23));
      System.out.println("-2 es primo: "+ mate.esPrimo(-2));
      System.out.println("100000 es primo: "+ mate.esPrimo(100000));
*/
      mate.calcularPi(1001);

   }



}