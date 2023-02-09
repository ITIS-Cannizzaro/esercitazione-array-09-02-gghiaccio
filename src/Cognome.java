import java.util.Scanner;


public class Cognome
{
	static Scanner in = new Scanner(System.in);
	
	public static void main(String[] args)
	{
		{
			Scanner in = new Scanner(System.in);
			System.out.println("Benvenuto, effettuare una scelta");
			System.out.println("--------------------------------");
			System.out.println("1. due array in un terzo");
			System.out.println("2. nuovo array ");
			System.out.println("--------------------------------");
			int Scelta = in.nextInt();
			
		
			
			switch(Scelta)
			{
				case 1 : 
					Primo();
					break;
				
				case 2:
					Secondo();
					break;
				
				default:
					Def();
					break;
			}		
		}
	
}
	public static void Def()
	{
		System.out.println("La scelta da lei effettuata non esiste, riprovare");
		
	}
	
	
	public static void Primo()
	{
		Scanner in = new Scanner(System.in);
		int [] Numeri1 = new int[4];
		int [] Numeri2 = new int[4];
		int [] Numeri3 = new int[Numeri1.length + Numeri2.length];
		
		System.out.println("inserire valori del primo array");
		for(int i =0; i<Numeri1.length; i++)
		{
			Numeri1[i]=in.nextInt();
		}
		System.out.println("inserire valori del secondo array");
		for(int i =0; i<Numeri2.length; i++)
		{
			Numeri2[i]=in.nextInt();
		}
		
		for (int i=0;  i <Numeri1.length; i++)
		{
			Numeri3[i] = Numeri1[i];
		}
		for (int i=0;  i <Numeri2.length; i++)
		{
			Numeri3[i + Numeri1.length] = Numeri2[i];
		}
		
		for(int i = 0; i<Numeri3.length -1; i++)
		{
			if (Numeri3[i] > Numeri3[i+1])
			{
				int temp = Numeri3[i];
				Numeri3[i] = Numeri3[i+1];
				Numeri3[i + 1] = temp; 
			}
		}
		
		
		System.out.println("---------------------");
		for(int i = 0; i<Numeri3.length; i++)
		{
			System.out.println(Numeri3[i] + " ;");
		}
		System.out.println("---------------------");
		
	}
	
	public static void Secondo()
	{
		Scanner in = new Scanner(System.in);
		int [] Numeri = new int [10];
		System.out.println("inseriremo 10 numeri, compresi tra -10 e 10");
		for(int i=0; i<Numeri.length; i++)
		{
			Numeri[i]=in.nextInt();
		}
		
		int Contatore = 0;
		for (int i=0; i<Numeri.length; i++)
		{
			if(Numeri[i] >= 0)
			{
				Contatore +=1;
			}
		}
		
		int [] Numeri2 = new int [Contatore];
		
		for (int i=0; i<Numeri2.length; i++)
		{
			if(Numeri[i] >= 0)
			{
				Numeri2[i] = Numeri[i];
			}
		}
		
		for(int i = Numeri2.length; i > 0; i--)
		{
			System.out.println(Numeri2[i] + " ;");
		}
		
		
	}
}
