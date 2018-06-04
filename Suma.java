import java.util.Scanner;
public class Suma{
	public static void main(String[] args){
		int x,y,resultado;
		Scanner sc=new Scanner(System.in);

		System.out.println("Programa que realiza la suma de dos numeros");
		System.out.println("Introduce un numero");
		x =sc.nextInt();

		System.out.println("Introduce otro numero");
		y =sc.nextInt();
		resultado=x+y;
		System.out.println("la suma es" +x+"+"+y+"="+resultado);
	}
}

