
public class Peliculas extends Categorias{

	private final int ID;
	private String Nombre;
	private Categorias genero;
	private static int id=0;
	
	
	public Peliculas() {
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


	@Override
	public String toString() {
		return  ID + "- " + Nombre + "- " + genero;
	}
	
	
	
}
