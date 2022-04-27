package ejer1;
import java.util.Scanner;
public class Practico_1_ejercicio_1 {
	Scanner teclado=new Scanner(System.in);
	String apellido;
	int edad, cedula;
	double altura;
	
	
	public void iniciar() {
		cargar();
		imprimir();
	}
   private void cargar() {
    	
    	teclado = new Scanner(System.in);
    	System.out.println("ingrese su apellido:");
    	apellido = teclado.nextLine();
    	System.out.println("ingrese su edad:");
    	edad=teclado.nextInt();
    	System.out.println("ingrese su altura:");
    	altura=teclado.nextDouble();
    	System.out.println("ingrese su cedula:");
    	cedula=teclado.nextInt();
	}
    private void imprimir() { 
		System.out.println("el apellido es:"+apellido);
    	System.out.println("la edad es:"+edad);
    	System.out.println("la altura es:"+altura);
    	System.out.println("la cedula es:"+cedula);
	}
   
    }


