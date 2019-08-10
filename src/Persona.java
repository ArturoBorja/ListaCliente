public class Persona {
	private String nombre;
	private String dni;
	private int edad;
	public Persona(String nombre, String dni, int edad) {
		this.nombre = nombre;
		this.dni = dni;
		this.edad = edad;
	}
	public Persona() {
		this.nombre = "Arturo Borja";
		this.dni = "46049704";
		this.edad = 30;
	}
	public String Nombre() {
		return nombre;	
	}
	public String Dni() {
		return dni;	
	}
	public int Edad() {
		return edad;	
	}
	public void Nombre(String n) {
		this.nombre=n;
	}
	public void Dni(String n) {
		this.dni=n;
	}
	public void Edad(int n) {
		this.edad=n;
	}
	public boolean MayorEdad() {
		if(this.edad<18) {
			return false;
		}else {
			return true;
		}	
	}
}