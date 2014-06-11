
import java.util.Scanner;

public class Puntajes {

public static void main(String[] args)
{
	Scanner s= new Scanner(System.in);
	 //Se lee el nombre del Jugador 1 y el puntaje
	System.out.print("Nombre de jugador 1: ");
	String nombre1 = s.next();
	System.out.print("Puntaje: ");
	int puntaje1 = s.nextInt();
	
	 //Se lee el nombre del Jugador 2 y el puntaje
	System.out.print("Nombre de jugador 2: ");
	String nombre2 = s.next();
	System.out.print("Puntaje: ");
	int puntaje2 = s.nextInt();
	
	 //Se lee el nombre del Jugador 3 y el puntaje
	System.out.print("Nombre de jugador 3: ");
	String nombre3 = s.next();
	System.out.print("Puntaje: ");
	int puntaje3 = s.nextInt();
	int promedio;
	
	 //Se imprime el promedio de los 3 puntajes
	promedio = ((puntaje1+puntaje2+puntaje3)/3);
	System.out.println("Promedio: " +promedio);
	
	 //Se hace una comparativa entre resultados para determinar el mejor y el peor
	{
		if (puntaje1>puntaje2 && puntaje1>puntaje3)
		System.out.println(nombre1 + " tiene el mejor puntaje con " + puntaje1);	
		else
		{
			if (puntaje2>puntaje3)
				System.out.println( nombre2 + " tiene el mejor puntaje con " + puntaje2);
			else 
				System.out.println( nombre3 + " tiene el mejor puntaje con " + puntaje3);	
		}

	}
	{
		if (puntaje1<puntaje2 && puntaje1<puntaje3)
		System.out.println(nombre1 + " tiene el peor puntaje con " + puntaje1);	
		else
		{
			if (puntaje2<puntaje3)
				System.out.println( nombre2 + " tiene el peor puntaje con " + puntaje2);
			else 
				System.out.println( nombre3 + " tiene el peor puntaje con " + puntaje3);	
		}

	}
}
}