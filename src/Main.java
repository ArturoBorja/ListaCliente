import java.util.ArrayList;
import java.util.List;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//List<Persona> personas=CrearLista();
		LlenarDatos();
	}
	public static List<Persona> CrearLista(){
		List<Persona> p=new ArrayList<Persona>();
		System.out.print("introducir numero de personas: ");
		int num = Entrada.entero();
		for(int a=0; a<num;a++) {
			
		}
		return p;
	}
	public static Persona LlenarDatos() {
		Cliente p = new Cliente();
		System.out.println("La persona es \"cliente\" (1) o \"administrador\" ");
		int tipo=Entrada.entero();
		if(tipo==1) {
			Cliente p = new Cliente();
		}else {
			Administrador p = new Administrador();
		}
		System.out.println("Introdusca nombre completo: ");
		String nombre=Entrada.cadena();
		
		if(nombre.equals("0")) {
			
		}else {
			p.Nombre(nombre);
			System.out.println("Introdusca DNI: ");
			String dni=Entrada.cadena();
			p.Dni(dni);
			System.out.println("Introdusca Edad: ");
			int edad=Entrada.entero();
			p.Edad(edad);
			p.setCodigo();
		}
		return p;		
	}
	public static Cliente CrearCliente() {
		
	}
}
