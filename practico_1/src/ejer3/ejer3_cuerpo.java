package ejer3;
import java.util.Scanner;
public class ejer3_cuerpo {
	Scanner teclado=new Scanner(System.in);
	
	void iniciar(){
		String or1, or2;
		
		or1=cargarString();
		or2=cargarString();
		menu(or1,or2);
	}
	
	//carga de teclado dos String
	String cargarString(){
		System.out.println("ingrese una frase:");
		String frase=teclado.nextLine();
		return(frase);
		
			
		
		
		//completar aquí
			 
	}
	
	//despliega menu
	void menu(String a, String b){
		int entrada;
		do {
			System.out.println("1. Imprimir ambas cadenas y su largo");
			System.out.println("2.Comparar igualdad y quien es menor");
			System.out.println("3.Cambiar una cadena a todo MAYUSCULAS y otra a todo minusculas");
			System.out.println("4.Cargar nuevamente los string");
			System.out.println("5.Salir");
			entrada=teclado.nextInt();
			switch(entrada) {
			case 1:{
				System.out.println("la primera frase es: "+a);
				System.out.println("y su largo es: "+a.length());
				System.out.println("la primera frase es: "+b);
				System.out.println("y su largo es: "+b.length());
				break;
			}
			case 2:{
				if(a.length()>b.length()) 
					System.out.println("la frase ("+b+") es la mas chica");
				else
					if(a.length()<b.length())
						System.out.println("la frase( "+a+" )es la mas chica");
					else
						System.out.println("son iguales");
			break;
			}
			case 3:{
				System.out.println("la frase uno en minuscula es asi: "+a.toLowerCase());
				System.out.println("la frase dos en MAYUSCULA es asi: "+b.toUpperCase());
			break;
			}
			case 4:{
				System.out.println(""+a);
				System.out.println(""+b);
			break;
			}	
		}
		
		}while(entrada!=5);
		
		//completar aquí				
					
	}
}
