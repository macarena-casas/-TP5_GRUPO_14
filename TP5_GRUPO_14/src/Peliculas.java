import javax.swing.JFrame;


public class Peliculas extends Categorias {

	private static int ID=0;
	private String Nombre;
	private Categorias genero;
	private static int id=0;
	
	
	
   Peliculas() {
		super();
		id++;
		ID = id;
		Nombre = "Sin Nombre";
		this.genero = null;
	}


	public Peliculas( String nombre, Categorias genero) {
		super();
		id++;
		ID = id;
		Nombre = nombre;
		this.genero = genero;
	}


	public String getNombre() {
		return Nombre;
	}


	public void setNombre(String nombre) {
		Nombre = nombre;
	}


	public Categorias getGenero() {
		return genero;
	}


	public void setGenero(Categorias genero) {
		this.genero = genero;
	}


	public int getID() {
		return ID;
	}
	
	public static int siguienteID() {
		return ID + 1;
	}


	@Override
	public String toString() {
		return  ID + "- " + Nombre + "- " + genero;
	}



	
	
	
}
