
public class Peliculas extends Categorias implements Comparable <Peliculas> {

	public static final String Peliculas = null;
	private int ID;
	private String Nombre;
	private Categorias genero;
	private static int id=0;
	
	
	
   Peliculas() {
		super();
		id++;
		this.ID = id;
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
		return id + 1;
	}


	@Override
	public String toString() {
		return  ID + "- " + Nombre + "- " + genero;
	}


	@Override
	public int compareTo(Peliculas o) {
		int s=o.Nombre.compareTo(this.Nombre);
		if(s == 0)
		return 0;
		
		if(s < 0) {
			return 1;
		}
		return -1;
	}
	
	
	
}
