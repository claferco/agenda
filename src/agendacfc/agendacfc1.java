package agendacfc;
import java.util.Scanner;

public class agendacfc1 {



	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
				Scanner s = new Scanner(System.in);
				int arr[]=new int [5];

				System.out.println("Ingrese un numero 1: ");
				arr[0]= s.nextInt();
				System.out.println("Ingrese un numero : ");
				arr[1]= s.nextInt();
				System.out.println("Ingrese un numero : ");
				arr[2]= s.nextInt();
				System.out.println("Ingrese un numero : ");
				arr[3]= s.nextInt();
				System.out.println("Ingrese un numero : ");
				arr[4]= s.nextInt();


				System.out.println("Agenda: ");

				System.out.println(arr[0]);
				System.out.println(arr[1]);
				System.out.println(arr[2]);
				System.out.println(arr[3]);
				System.out.println(arr[4]);

		}
}
