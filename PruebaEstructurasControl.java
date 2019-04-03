import javax.swing.JOptionPane;

public class PruebaEstructurasControl{
	public static void main (String args[]){

		String colonesString = JOptionPane.showInputDialog("Digite la cantidad de colones");
		String dolaresString = JOptionPane.showInputDialog("Digite la cantidad de dolares");
		EntradaDatos instanciaEntradaDatos = new EntradaDatos();


		int dolares = instanciaEntradaDatos.convertirStringAInt(dolaresString);
		int colones = instanciaEntradaDatos.convertirStringAInt(colonesString); 
		int tipoCambio = 600;

		if (dolares >= 350 ||((double)colones/tipoCambio >= 350)||(dolares + (double)colones/tipoCambio >= 350)){
			System.out.println("Puede comprar el producto");
			JOptionPane.showMessageDialog(null, "Puede comprar el producto", "Resultado", JOptionPane.INFORMATION_MESSAGE);
		}
		else{
			System.out.println("No tiene suficiente dinero");
			JOptionPane.showMessageDialog(null, "Puede comprar el producto", "Resultado", JOptionPane.ERROR_MESSAGE);
		}

	}
}