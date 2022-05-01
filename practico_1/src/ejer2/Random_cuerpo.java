package ejer2;
import java.util.Scanner;
import java.util.Random;

public class Random_cuerpo {
	int num1;
	int random;
	int valor;
	Random azar = new Random();
	void iniciar(){		
			
			int num;
			int resul;
			
			do{
				valor=generarAleatorio();
				num=pedirNumero();
				resul=compararNumeros(num, valor);
				System.out.println(resul);
				if(resul<0)
					System.out.println("el numero es demasiado chico");
				else
					System.out.println("el numero es demasiado grande");
					
			}while(resul!=0);
			System.out.println("Felicitaciones acertaste!!");
		}
		
		//devuelve un numero aleatorio entre 1 y 100
		int generarAleatorio(){
		num1=1 + azar.nextInt(1000);
		return(num1);
		}
		
		//pide un nro por pantalla
		 int pedirNumero(){
			 
			Scanner entrada=new Scanner(System.in);
			System.out.println("ingrese un numero:");
			int dev=entrada.nextInt();
			return(dev);
			////completar aquí
		 }		 
		
		 //compara dos enteros a y b. Devuelve un String indicando si es menor, mayor o igual
		 int compararNumeros(int a, int b){
			int resta=a-b;
			return(resta);
			 
			 //completar aquí
		 }
		
	}


	

	
