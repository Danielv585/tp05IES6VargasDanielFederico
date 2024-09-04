package ar.edu.IES6.Informatica.punto05;
import java.time.LocalDate;//formato fecha
import java.time.Period;
public class Persona {
	//Atributo Privados
	private int dni;
	private String nombre;
	private LocalDate fechaNacimiento;
	private String provincia;
	
	//Constructor sin parametros
	public Persona() {
		//this.dni=32456897;
		//this.nombre="Sofia";
		//this.fechaNacimiento=LocalDate.of(1983,5,8);
		this.provincia="Jujuy";
		
	}
	//Constructor con parametro
	public Persona(int dni,String nomb,LocalDate fechaN,String provin) {
		this.dni=dni;
		this.nombre=nomb;
		this.fechaNacimiento=fechaN;
		this.provincia=provin;
	}
	
    // Métodos accesores (getters y setters)
    public double getDni() {//para devolver el valor Existente get
        return dni;
    }
    //set
    public void setDni(int dni) {//para modificar el valor,muestra el ultimo valor set
        this.dni = dni;
    }
    //get
    public String getNombre() {
        return nombre;
    }
    //set
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    //get
    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }
    //set
    public void SetFechaNacimiento(LocalDate fechaNacimientoSet) {
    	this.fechaNacimiento=fechaNacimientoSet;
    }
    //get
    public String getProvincia() {
        return provincia;
    }
    //set
    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }
    
 // Métodos adicionales
    public int calcularEdad() {
        return Period.between(this.fechaNacimiento, LocalDate.now()).getYears();
    	//return funcion compara la fecha(fachaNacimiento, FechaActual).retorna el año;
    }

    public boolean esMayorDeEdad() {
        return calcularEdad() >= 18;
    }
    
    //mostar Datos
    public void mostrarDatos() {
        System.out.println("DNI: " + dni);
        System.out.println("Nombre: " + nombre);
        System.out.println("Fecha de Nacimiento: " + fechaNacimiento);
        System.out.println("Provincia: " + provincia);
        int edad = calcularEdad();
        System.out.println("Edad: " + edad);
        if (esMayorDeEdad()) {
            System.out.println("La persona es mayor de edad.");
        } else {
            System.out.println("La persona no es mayor de edad.");
        }
    }
}

/*
 * import java.time.LocalDate;
import java.time.Period;

public class Persona {
    // Atributos privados
    private String dni;
    private String nombre;
    private LocalDate fechaNacimiento;
    private String provincia;

    // Constructores
    public Persona() {
        this.provincia = "Jujuy";
    }

    public Persona(String dni, String nombre, LocalDate fechaNacimiento, String provincia) {
        this.dni = dni;
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.provincia = provincia;
    }

    public Persona(String dni, String nombre, LocalDate fechaNacimiento) {
        this.dni = dni;
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.provincia = "Jujuy";
    }

    // Métodos accesores (getters y setters)
    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    // Métodos adicionales
    public int calcularEdad() {
        return Period.between(this.fechaNacimiento, LocalDate.now()).getYears();
    }

    public boolean esMayorDeEdad() {
        return calcularEdad() >= 18;
    }

    public void mostrarDatos() {
        System.out.println("DNI: " + dni);
        System.out.println("Nombre: " + nombre);
        System.out.println("Fecha de Nacimiento: " + fechaNacimiento);
        System.out.println("Provincia: " + provincia);
        int edad = calcularEdad();
        System.out.println("Edad: " + edad);
        if (esMayorDeEdad()) {
            System.out.println("La persona es mayor de edad.");
        } else {
            System.out.println("La persona no es mayor de edad.");
        }
    }
}
Clase Main en el paquete main
java
Copiar código
package main;

import model.Persona;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        // Objeto utilizando el constructor por defecto
        Persona persona1 = new Persona();
        persona1.setDni("12345678");
        persona1.setNombre("Juan Perez");
        persona1.setFechaNacimiento(LocalDate.of(2000, 1, 1));
        persona1.setProvincia("Buenos Aires");
        persona1.mostrarDatos();

        // Objeto utilizando el constructor parametrizado
        Persona persona2 = new Persona("87654321", "Maria Lopez", LocalDate.of(1995, 5, 15), "Córdoba");
        persona2.mostrarDatos();

        // Objeto utilizando el constructor con dni, nombre y fecha de nacimiento
        Persona persona3 = new Persona("11223344", "Carlos Gomez", LocalDate.of(2010, 10, 10));
        persona3.mostrarDatos();
    }
}
 * 
 * */
