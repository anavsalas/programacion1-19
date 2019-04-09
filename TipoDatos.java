public class TipoDatos{
   
   public static void main (String args[]){
      
      System.out.println("Hola\nmundo");
      System.out.println("Hola\\nmundo");
      System.out.println("Hola mundo \u0040");

      // Tipo de dato
      // Nombre de la variable
      // = valor (inicializa la variable)
      // ;
      String miHilera = "Esta es mi variable: miHilera";
      System.out.println(miHilera);
      int numeroEntero1 = 12;
      System.out.println(numeroEntero1);
      numeroEntero1 = numeroEntero1 + 5;
      System.out.println(numeroEntero1);

      int numeroEntero2 = numeroEntero1 * 8;
      System.out.println("variable numeroEntero1: " + numeroEntero1);
      System.out.println("variable numeroEntero2: " + numeroEntero2);

      String hileraNumero = "10";
      System.out.println(hileraNumero + 1);
      int numeroEntero3 = Integer.parseInt(hileraNumero);
      System.out.println(numeroEntero3+1);

      // Descomentar esto provoca un error 
      // ya que hileraNumero2 no es un número
      // String hileraNumero2 = "10a";
      // int numeroEntero4 = Integer.parseInt(hileraNumero2);
      System.out.println(numeroEntero3+1);
      System.out.println(5/3);
      System.out.println((double)5/3);
      System.out.println(5.0/3);

   }

}