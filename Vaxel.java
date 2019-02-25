package vaxel;
import java.util.Scanner;
public class Vaxel {

	public static void main(String[] args) {
		
		System.out.println("Vänligen mata in produktens pris och sedan betalningsbeloppet.");
		System.out.println("");
		
	Scanner input = new Scanner(System.in);

	 //mynt och sedlars absoluta värden
	
	 final double TUS = 1000, FEMH = 500, TVAH = 200, HUND = 100, FEMT = 50, TJUG = 20;		 
	final double TIO = 10, FEM = 5, TVA = 2, ETT = 1, OER = 0.5;
	
	//variabler
	
	int tus, femh, tvah, hund, femt, tjug, tio, fem, tva, ett, oer = 0; 
	double mynt, change, price, payment, kvar, tillbaka;  
	 
	
				//inmatning
	
	    	System.out.println("Pris");
	    price = input.nextDouble();
	    	System.out.println("Belopp");
	    payment = input.nextDouble();
	    	System.out.println("Växel");
	    change = payment - price;
	    input.close();
	    
	    		//variablernas relation till varandra
	    
tus = (int) Math.floor(change/TUS);
femh = (int) Math.floor((change - tus * TUS)/FEMH);	    
tvah = (int) Math.floor((change - tus * TUS - femh * FEMH)/TVAH);
hund = (int) Math.floor((change - tus * TUS - femh * FEMH - tvah * TVAH)/HUND);
femt = (int) Math.floor((change - tus * TUS - femh * FEMH - tvah * TVAH - hund * HUND)/FEMT);
tjug = (int) Math.floor((change - tus * TUS - femh * FEMH - tvah * TVAH - hund * HUND - femt * FEMT)/TJUG);

				// ditto

mynt = (int) Math.floor(change - tus * TUS - femh * FEMH - tvah * TVAH - hund * HUND - femt * FEMT - tjug * TJUG);
tio = (int) Math.floor(mynt/TIO);
fem = (int) Math.floor((mynt - tio * TIO)/FEM);
tva = (int) Math.floor((mynt - tio * TIO - fem * FEM)/TVA);
ett = (int) Math.floor((mynt - tio * TIO - fem * FEM - tva * TVA)/ETT);
kvar = mynt - tio * TIO - fem * FEM - tva * TVA - ett * ETT;
if (kvar >= 0.25 && kvar <= 0.75) oer ++;
if (kvar > 0.75) ett ++;

				// total växel

tillbaka = tus * TUS + femh * FEMH + tvah * TVAH + hund * HUND + femt * FEMT + tjug * TJUG + tio * TIO + fem * FEM + tva * TVA + ett * ETT + oer * OER;
System.out.println(tillbaka + " kr");


				//växel i sedlar och mynt

if (tus > 0) System.out.println(tus +  " á 1000kr ");
if (femh > 0) System.out.println(femh + " á 500 kr");
if (tvah > 0) System.out.println(tvah + " á 200 kr");
if (hund > 0) System.out.println(hund + " á 100 kr");
if (femt > 0) System.out.println(femt + " á 50 kr");
if (tjug > 0) System.out.println(tjug + " á 20 kr");
if (tio > 0) System.out.println(tio + " á 10 kr");
if (fem > 0) System.out.println(fem + " á 5 kr");
if (tva > 0) System.out.println(tva + " á 2 kr");
if (ett > 0) System.out.println(ett + " á 1 kr");
if (oer > 0) System.out.println(oer + " á 0,5 kr");

 		
	}

}
