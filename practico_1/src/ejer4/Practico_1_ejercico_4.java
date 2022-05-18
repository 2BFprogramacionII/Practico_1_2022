package ejer4;
import java.util.Scanner;
public class Practico_1_ejercico_4 {
Scanner teclado=new Scanner(System.in);
	double a=0;
	double b=0;
	double c=0;
	void iniciar() {
	
		menu(a,b,c);
	}
	void menu(double a,double b,double c) {
		System.out.println("ingrese tres numeros:");
		a=teclado.nextInt();
		b=teclado.nextInt();
		c=teclado.nextInt();
		System.out.println("1.Cuadrado y raiz cuadrada de cada número");
		System.out.println("2.Bhaskara con los numeros que ingresaste");
		System.out.println("1.Cuadrado y raiz cuadrada de cada número");
		System.out.println("ingrese la opcion que desea:");
		int op=teclado.nextInt();
		switch(op) {
			case 1:
				System.out.println("El cuadrado de el primer numero es: "+Math.pow(a,2)+" y la raiz cuadrada es:"+Math.sqrt(a));
				System.out.println("El cuadrado de el segundo numero es: "+Math.pow(b,2)+" y la raiz cuadrada es:"+Math.sqrt(b));
				System.out.println("El cuadrado de el tercer numero es: "+Math.pow(c,2)+" y la raiz cuadrada es:"+Math.sqrt(c));
			break;
			case 2:
				double part1=-4*a*c;
				double part2=Math.pow(b,2)+part1;
				double part3=-b+Math.sqrt(part2)/2*a;
				double part4=-b-Math.sqrt(part2)/2*a;
				System.out.println("Bhaskara de |"+a+"|"+b+"|"+c+"| es: ("+part3+"|"+part4+")");
			break;
			case 3:
				if(a>b)
					System.out.println(+a);
				else
					if(a>c)
						System.out.println(+a);
					else
						if(b>c)
							System.out.println(+b);
						else
							System.out.println(+c);
		
		}
	}
	
}

