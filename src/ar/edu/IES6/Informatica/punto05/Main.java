package ar.edu.IES6.Informatica.punto05;

//import model.Persona;
import java.time.LocalDate;
public class Main {

	public static void main(String[] args) {
		Persona persona0=new Persona();
		System.out.println("Nombre de la Provincia : "+persona0.getProvincia());
		System.out.println("");
		System.out.println("////////////////////////////////////////////////////////////");
		System.out.println("");
		
		// Objeto utilizando el constructor por defecto set modificar
        Persona persona1 = new Persona();
        persona1.setDni(12345678);
        persona1.setNombre("Juan Perez");
        persona1.SetFechaNacimiento(LocalDate.of(2000,9,04));
        persona1.setProvincia("Buenos Aires");
        persona1.mostrarDatos();
        
        System.out.println("");
		System.out.println("////////////////////////////////////////////////////////////");
		System.out.println("");
       
        // Objeto utilizando el constructor parametrizado
        Persona persona2 = new Persona(87654321, "Maria Lopez", LocalDate.of(1995, 5, 15), "Córdoba");
        persona2.mostrarDatos();
        
        System.out.println("");
		System.out.println("////////////////////////////////////////////////////////////");
		System.out.println("");
		
        /*
        // Objeto utilizando el constructor con dni, nombre y fecha de nacimiento
        Persona persona3 = new Persona(11223344, "Carlos Gomez", LocalDate.of(2010, 10, 10));
        persona3.mostrarDatos();
       */
	}

}
