package Clases;

public class Invitado {
    private int id;
    private String nombre;
    
    

    public Invitado(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public Invitado() {
		// TODO Auto-generated constructor stub
	}

	public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
   