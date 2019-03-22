public class Perro{

	// Atributo
		// nombre
	private String nombre;
	private String estado; // puede estar: sentado, corriendo, saludando

	// Bautizarlo
	// Salude -> cambie el estado a saludando
	// Sentarse -> cambie el estado a sentado
	// Correr -> corriendo

	public void bautizar (String nombre){
		this.nombre = nombre;
	}

	public void correr(){
		String sentarse = "                                           /\\ /\\\n";
		sentarse += "                                          /  \\---._\n";
		sentarse += "                                         / / `     `\\\n";
		sentarse += "                                         \\ \\   `'<@)@)      \n";
		sentarse += "                                         /`         ~ ~._ \n";
		sentarse += "                                        /                `() \n";
		sentarse += "                                       /    \\   (` ,_.:.  /\n";
		sentarse += "                                      / ~    `\\   (vVvvvvV\n";
		sentarse += "                                     /       |`\\_ `^^^/\n";
		sentarse += "                                 ___/________|_  `---'\n";
		sentarse += "                                (______________) _\n";
		sentarse += "                                _/~          | `(_)\n";
		sentarse += "                              _/~             \\  \n";
		sentarse += "                            _/~               |\n";
		sentarse += "                          _/~                 |\n";
		sentarse += "                        _/~                   |\n";
		sentarse += "                      _/~         ~.          |\n";
		sentarse += "                    _/~             \\        /\\\n";
		sentarse += "                 __/~               /`\\     `||\n";
		sentarse += "               _/~      ~~-._     /~   \\     ||\n";
		sentarse += "              /~             ~./~'      \\    |)\n";
		sentarse += "             /                 ~.        \\   )|\n";
		sentarse += "            /                    :       |   ||\n";
		sentarse += "            |                    :       |   ||\n";
		sentarse += "            |                   .'       |   ||\n";
		sentarse += "       __.-`                __.'--.      |   |`---. \n";
		sentarse += "    .-~  ___.         __.--~`--.))))     |   `---.)))\n";
		sentarse += "   `---~~     `-...--.________)))))      \\_____)))))\n";
		this.estado = "corriendo\n\n" + sentarse;
	}

	public void sentarse(){

		String correr = "              .--~~,__\n"+ 
		" :-....,-------`~~'._.'\n"+ 
	 	"  `-,,,  ,_      ;'~U'\n"+ 
	 	"   _,-' ,'`-__; '--.\n"+ 
	 	"  (_/'~~      ''''(;\n";


		this.estado = "sentado\n\n" + correr;
	}

	public String getEstado(){
		return "Estoy: " + this.estado;
	}

	public String saludar(){
		String contenido = "";
		contenido += "Hola me llamo"; // contenido = contenido + "Hola me llamo";
		contenido += " "; // contenido = contenido + " ";
		contenido += this.nombre; // contenido = contenido + this.nombre
		//String contenido = "Hola me llamo " + this.nombre;
		return contenido;
	}


	public static void main (String args[]){
		Perro perro1 = new Perro();
		perro1.bautizar("Firulais");
		String resultado = perro1.saludar();
		System.out.println(resultado);
		System.out.println(perro1.saludar());

		String estado = perro1.getEstado();

		perro1.correr();
		estado = perro1.getEstado();
		System.out.println(estado);

		perro1.sentarse();
		estado = perro1.getEstado();
		System.out.println(estado);

	}



}