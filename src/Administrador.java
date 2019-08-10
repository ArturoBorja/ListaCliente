public class Administrador extends Persona {
	private String codigo;

	public Administrador(String nombre, String dni, int edad, String codigo) {
		super(nombre, dni, edad);
		this.codigo = codigo;
	}
	public Administrador() {
		Persona p01=new Persona();
		this.Nombre(p01.Nombre());
		this.Dni(p01.Dni());
		this.Edad(p01.Edad());
		this.codigo = "cl"+p01.Dni();
	}
	public String Codigo() {
		return codigo;
	}
	public void setCodigo(String c) {
		this.codigo=c;
	}
	public void setCodigo() {
		this.codigo="cl"+this.Dni();;
	}
}
