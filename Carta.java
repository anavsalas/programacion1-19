public class Carta{
   // Declaracion de atributos:
   private String palo; // un atributo de tipo texto que contiene el palo
   private int numero; // un atributo de tipo entero que contiene el numero


   public Carta() {
      palo = "Diamantes";
      numero = 3;
   }

   public Carta(int numero, String palo){
      this.numero = numero;
      this.palo = palo;
   }


   //Declaracion de un método:
   //1. Si es publico o privado (accesible desde la instancia)
   //2. Que quiero que retorne el metodo
   //3. Como se llama el método
   //4. Que necesito que reciba el método para funcionar
   public void setPalo(String paloParametro){
      palo = paloParametro;
   }

   public void setNumero(int numeroParametro){
      numero = numeroParametro;
   }

   public int getNumero(){
      return this.numero;
   }

   public String getPalo(){
      return this.palo;
   }


   public void imprimir(){
      String contenido = "La carta es:\n";
      contenido = contenido +"\t"+ convertirNumeroCarta() + " de " + palo + "\n";
      System.out.println(contenido);
   }

   public void imprimirIf(){
      String contenido = "La carta es:\n";
      contenido = contenido +"\t"+ convertirNumeroCartaIf() + " de " + palo + "\n";
      System.out.println(contenido);
   }

   // Retorne J Q K As o el numero como String
   public String convertirNumeroCarta(){
      String valorCarta = "";
      switch(numero){
         case 11:
            valorCarta = "J";
         break;
         case 12:
            valorCarta = "Q";
         break;
         case 13:
            valorCarta = "K";
         break;
         case 1:
            valorCarta = "As";
         break;
         default:
            valorCarta += this.numero;
      }
      return valorCarta;
   }

   public String convertirNumeroCartaIf(){
      String valorCarta = "";
      if (numero == 1){
         valorCarta = "As";
      }
      else if (numero == 11){
         valorCarta = "J";
      }
      else if (numero == 12){
         valorCarta = "Q";
      }
      else if (numero == 13){
         valorCarta = "K";
      }
      else{
         valorCarta += numero;
      }
      return valorCarta;
      
   }

}