package temperatur;
import java.util.Scanner;
public class temperatur {

	public static void main(String[] args) {
		

		Scanner input = new Scanner(System.in);
		System.out.println("Hej!");
		
		    System.out.println(" ");
		
		System.out.println("Detta program jämför temperaturerna mellan 4 städer");
		
		                           System.out.println(" ");
		
		System.out.println("Var god mata in dagens temperatur C och tryck på ENTER:");
		
		double Krn, Sthlm, Gbg, Mlm, Med;
		
                                   System.out.println(" ");
		
	System.out.println("Kiruna");
		Krn = input.nextDouble();
                                   System.out.println(" ");

	     System.out.println("Stockholm");	
		   Sthlm = input.nextDouble();
                                   System.out.println(" ");

	        System.out.println("Göteborg");
		     Gbg = input.nextDouble();
                                   System.out.println(" "); 

	          System.out.println("Malmö");
		       Mlm = input.nextDouble();
                                   System.out.println(" ");
		input.close();
		
		Med = (Krn + Sthlm + Gbg + Mlm) / 4;
		
		//Varmare
		
		
		if ( Krn > Sthlm && Krn > Gbg && Krn > Mlm) 
			System.out.println("Det är varmast i Kiruna,");
		
		 if ( Sthlm > Krn && Sthlm > Gbg && Sthlm > Mlm) 
			System.out.println("Det är varmast i Stockholm,");	
		  
		   if ( Gbg > Krn && Gbg > Sthlm && Gbg > Mlm) 
			System.out.println("Det är varmast i Göteborg,");
		   
		     if ( Mlm > Krn && Mlm > Sthlm && Mlm > Gbg) 
				System.out.println("Det är varmast i Malmö,");
		
		//Kallare
		
		
		
		 if ( Krn < Sthlm && Krn < Gbg && Krn < Mlm) 
		    System.out.println("det är kallast i Kiruna.");
		
		  if ( Sthlm < Krn && Sthlm < Gbg && Sthlm < Mlm) 
			System.out.println("det är kallast i Stockholm.");	
		  
		   if ( Gbg < Krn && Gbg < Sthlm && Gbg < Mlm) 
			System.out.println("det är kallast i Göteborg.");
		   
		   if ( Mlm < Krn && Mlm < Sthlm && Mlm < Gbg) 
				System.out.println("det är kallast i Malmö.");
		   
		   if ( Mlm == Krn && Mlm == Sthlm && Mlm == Gbg )
		    System.out.println("Det är samma temperatur i alla städerna.");
		   
		    
		    System.out.println("och genomsnittstemperaturen mellan städerna är " + Med + "C");
	  
		
		   
	}

}
