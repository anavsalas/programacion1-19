public class PruebaSwitch{
   
   public static void main (String args[]){
      char letra = 'C';
      switch(letra){
         case 'a':
            System.out.println("En el switch entro al caso a");
         break;

         case 'b':
            System.out.println("En el switch entro al caso b");
         break;

         case 'C':
         case 'c':
            System.out.println("En el switch entro al caso c");
         break;

         default:
            System.out.println("En el switch entro al default");
      }
   }
}