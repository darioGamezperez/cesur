package formula1;

public class Persona {
	//atributos 
	 private int edad;
    private String nombre;
    private int dni;
	
	//constructor
	public Persona(int edad, String nombre, int dni) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.dni = dni;
	}
	//getters y setters
	public int getEdad() {
		return edad;
		
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public String getNombre() {
		return nombre;
		
	}
	public void setNombre(String nombre) {
		this.nombre= nombre;
	}
	
	public int getDni() {
		return dni;
	}
	public void setDni(int dni) {
		this.dni = dni;
}
	
}
