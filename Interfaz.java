import javax.swing.JOptionPane;

public class Interfaz {
	
	private String solicitarDatoAlUsuario(String titulo){
		String contenido = JOptionPane.showInputDialog(titulo);
		return contenido;
	}

	public int solicitarNumeroEntero(String titulo){
		String valorDigitado = this.solicitarDatoAlUsuario(titulo);
		int valorEntero = 0;
		try{
			valorEntero = Integer.parseInt(valorDigitado);
		}
		catch(NumberFormatException e){
			System.err.println("Ocurrio un error al convertir el valor a numero: " + e + "\n");
		}
		return valorEntero;
	}

	public static void main (String [] args){
		Interfaz interfaz = new Interfaz();
		String nombre = interfaz.solicitarDatoAlUsuario("Digite su nombre");
		System.out.println(nombre);

		int numero = interfaz.solicitarNumeroEntero("Digite un  numero entero");
		numero *= 2;
		System.out.println(numero);
	}

}