package porto;
import java.util.Scanner;
public class Porto {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		
	
		int Bvikt, Rvikt;
		
		int Bpris = 0, Rprismark = 0, Rprisdir = 0;
		
		int Bmark;
		int EXP, EXPtill = 0;
		int skrym = 0, SKRYM = 18;
		
	    System.out.println("Pakettyp: Brev: (Tryck 1 + ENTER)" + "\n" +  "Rek: Tryck 2 + ENTER " + "\n" + "Skicka Lätt: Tryck 3 + ENTER");
	    int Paket = input.nextInt();
	    switch (Paket) {
	    case 1:
	    	System.out.println("Vikt g:");
	    
		
		Bvikt = input.nextInt();
		 if (Bvikt > 2000) System.out.println("Detta paket är för tungt för att skicka.");
			if (Bvikt <= 50 && Bvikt >= 0) Bpris = 9;
			if (Bvikt <= 100 && Bvikt > 50) Bpris = 18;
			if (Bvikt <= 250 && Bvikt > 100) Bpris = 36;
			if (Bvikt <= 500 && Bvikt > 250) Bpris = 54;
			if (Bvikt <= 1000 && Bvikt > 500) Bpris = 72;
			if (Bvikt <= 2000 && Bvikt > 500) Bpris = 90;
			System.out.println("Expresstillägg: Ja: Tryck 1 + ENTER    -    Nej: Tryck 0 + ENTER");
			EXP = input.nextInt();
			if (EXP >= 1 ) EXPtill = 183;
			System.out.println("Skrymmande:" + "\n" +  "brev/rulle med större tjocklek/diameter än 30 mm" + "\n" + "eller större kortsida än 250 mm (gäller ej Rek utrikes)");
			System.out.println("Ja: Tryck 1 + ENTER    -    Nej: Tryck 0 + ENTER");
			skrym = input.nextInt();
			if (skrym > 0) SKRYM = 18;
			System.out.println("Kostnad:");
				switch (Bpris) {
			
			case 9:
				Bmark = 1;
				System.out.println(Bmark + "Frimärke");
				if (EXP >= 1 && skrym <= 0)System.out.println(Bpris + EXPtill + "kr" + "   -->   " + Bpris + " kr porto + " + "\n" + EXPtill + " kr expresstillägg");
				if (EXP <= 0 && skrym <= 0)System.out.println(Bpris + " kr");
				if (EXP >= 1 && skrym >= 1)System.out.println(Bpris + EXPtill + SKRYM + "   -->   " + Bpris + " kr porto + " + "\n" + EXPtill + " kr expresstillägg + "  + "\n" + SKRYM + " kr skrymmandetillägg eller 2 valörlösa frimärken");
				if (EXP <= 0 && skrym >= 1)System.out.println(Bpris + SKRYM + " kr" + "   -->   " + Bpris + "kr porto" + SKRYM + " kr skrymmandetillägg eller 2 valörlösa frimärken");
				break;
			case 18:
				Bmark = 2;
				System.out.println(Bmark + "Frimärken");
				if (EXP >= 1 && skrym <= 0)System.out.println(Bpris + EXPtill + "kr" + "   -->   " + Bpris + " kr porto + " + "\n" + EXPtill + " kr expresstillägg");
				if (EXP <= 0 && skrym <= 0)System.out.println(Bpris + " kr");
				if (EXP >= 1 && skrym >= 1)System.out.println(Bpris + EXPtill + SKRYM + "   -->   " + Bpris + " kr porto + " + "\n" + EXPtill + " kr expresstillägg + "  + "\n" + SKRYM + " kr skrymmandetillägg eller 2 valörlösa frimärken");
				if (EXP <= 0 && skrym >= 1)System.out.println(Bpris + SKRYM + " kr" + "   -->   " + Bpris + "kr porto" + SKRYM + " kr skrymmandetillägg eller 2 valörlösa frimärken");
				break;
			case 36:
				Bmark = 4;
				System.out.println(Bmark + "Frimärken");
				if (EXP >= 1 && skrym <= 0)System.out.println(Bpris + EXPtill + "kr" + "   -->   " + Bpris + " kr porto + " + "\n" + EXPtill + " kr expresstillägg");
				if (EXP <= 0 && skrym <= 0)System.out.println(Bpris + " kr");
				if (EXP >= 1 && skrym >= 1)System.out.println(Bpris + EXPtill + SKRYM + "   -->   " + Bpris + " kr porto + " + "\n" + EXPtill + " kr expresstillägg + "  + "\n" + SKRYM + " kr skrymmandetillägg eller 2 valörlösa frimärken");
				if (EXP <= 0 && skrym >= 1)System.out.println(Bpris + SKRYM + " kr" + "   -->   " + Bpris + "kr porto" + SKRYM + " kr skrymmandetillägg eller 2 valörlösa frimärken");
				break;
			case 54:
				Bmark = 6;
				System.out.println(Bmark + "Frimärken");
				if (EXP >= 1 && skrym <= 0)System.out.println(Bpris + EXPtill + "kr" + "   -->   " + Bpris + " kr porto + " + "\n" + EXPtill + " kr expresstillägg");
				if (EXP <= 0 && skrym <= 0)System.out.println(Bpris + " kr");
				if (EXP >= 1 && skrym >= 1)System.out.println(Bpris + EXPtill + SKRYM + "   -->   " + Bpris + " kr porto + " + "\n" + EXPtill + " kr expresstillägg + "  + "\n" + SKRYM + " kr skrymmandetillägg eller 2 valörlösa frimärken");
				if (EXP <= 0 && skrym >= 1)System.out.println(Bpris + SKRYM + " kr" + "   -->   " + Bpris + "kr porto" + SKRYM + " kr skrymmandetillägg eller 2 valörlösa frimärken");
				break;
			case 72:
				Bmark = 8;
				System.out.println(Bmark + "Frimärken");
				if (EXP >= 1 && skrym <= 0)System.out.println(Bpris + EXPtill + "kr" + "   -->   " + Bpris + " kr porto + " + "\n" + EXPtill + " kr expresstillägg");
				if (EXP <= 0 && skrym <= 0)System.out.println(Bpris + " kr");
				if (EXP >= 1 && skrym >= 1)System.out.println(Bpris + EXPtill + SKRYM + "   -->   " + Bpris + " kr porto + " + "\n" + EXPtill + " kr expresstillägg + "  + "\n" + SKRYM + " kr skrymmandetillägg eller 2 valörlösa frimärken");
				if (EXP <= 0 && skrym >= 1)System.out.println(Bpris + SKRYM + " kr" + "   -->   " + Bpris + "kr porto" + SKRYM + " kr skrymmandetillägg eller 2 valörlösa frimärken");
				break;
			case 90:
				Bmark = 10;
				System.out.println(Bmark + "Frimärken");
				if (EXP >= 1 && skrym <= 0)System.out.println(Bpris + EXPtill + "kr" + "   -->   " + Bpris + " kr porto + " + "\n" + EXPtill + " kr expresstillägg");
				if (EXP <= 0 && skrym <= 0)System.out.println(Bpris + " kr");
				if (EXP >= 1 && skrym >= 1)System.out.println(Bpris + EXPtill + SKRYM + "   -->   " + Bpris + " kr porto + " + "\n" + EXPtill + " kr expresstillägg + "  + "\n" + SKRYM + " kr skrymmandetillägg eller 2 valörlösa frimärken");
				if (EXP <= 0 && skrym >= 1)System.out.println(Bpris + SKRYM + " kr" + "   -->   " + Bpris + "kr porto" + SKRYM + " kr skrymmandetillägg eller 2 valörlösa frimärken");
				break;
				
				}
break;
	    
	    case 2:
	    	System.out.println("Frimärkt-1 Direkt-2");
	    	int RmarkDir = input.nextInt();
	    	
	    
	    	switch (RmarkDir) {
	    	case 1:
	    		System.out.println("Rekvikt");
	    	Rvikt = input.nextInt();
	    	 if (Rvikt > 2000) System.out.println("Detta paket är för tungt för att skicka.");
				if (Rvikt <= 50 && Rvikt >= 0) Rprismark = 82;
				if (Rvikt <= 100 && Rvikt > 50) Rprismark = 91;
				if (Rvikt <= 250 && Rvikt > 100) Rprismark = 109;
				if (Rvikt <= 500 && Rvikt > 250) Rprismark = 127;
				if (Rvikt <= 1000 && Rvikt > 500) Rprismark = 145;
				if (Rvikt <= 2000 && Rvikt > 500) Rprismark = 163;
				System.out.println("Expresstillägg: Ja: Tryck 1 + ENTER    -    Nej: Tryck 0 + ENTER");
				EXP = input.nextInt();
				if (EXP >= 1 ) EXPtill = 183;
				System.out.println("Skrymmande:" + "\n" +  "brev/rulle med större tjocklek/diameter än 30 mm" + "\n" + "eller större kortsida än 250 mm (gäller ej Rek utrikes)");
				System.out.println("Ja: Tryck 1 + ENTER    -    Nej: Tryck 0 + ENTER");
				skrym = input.nextInt();
				if (skrym > 0) SKRYM = 18;
				System.out.println("Kostnad:");
switch (Rprismark) {
				
				case 82:
					if (EXP >= 1 && skrym <= 0)System.out.println(Rprismark + EXPtill + "kr" + "   -->   " + Rprismark + " kr porto + " + "\n" + EXPtill + " kr expresstillägg");
					if (EXP <= 0 && skrym <= 0)System.out.println(Rprismark + " kr");
					if (EXP >= 1 && skrym >= 1)System.out.println(Rprismark + EXPtill + SKRYM + "   -->   " + Rprismark + " kr porto + " + "\n" + EXPtill + " kr expresstillägg + "  + "\n" + SKRYM + " kr skrymmandetillägg eller 2 valörlösa frimärken");
					if (EXP <= 0 && skrym >= 1)System.out.println(Rprismark + SKRYM + " kr" + "   -->   " + Rprismark + "kr porto" + SKRYM + " kr skrymmandetillägg eller 2 valörlösa frimärken");
					break;
				case 91:
					
					if (EXP >= 1 && skrym <= 0)System.out.println(Rprismark + EXPtill + "kr" + "   -->   " + Rprismark + " kr porto + " + "\n" + EXPtill + " kr expresstillägg");
					if (EXP <= 0 && skrym <= 0)System.out.println(Rprismark + " kr");
					if (EXP >= 1 && skrym >= 1)System.out.println(Rprismark + EXPtill + SKRYM + "   -->   " + Rprismark + " kr porto + " + "\n" + EXPtill + " kr expresstillägg + "  + "\n" + SKRYM + " kr skrymmandetillägg eller 2 valörlösa frimärken");
					if (EXP <= 0 && skrym >= 1)System.out.println(Rprismark + SKRYM + " kr" + "   -->   " + Rprismark + "kr porto" + SKRYM + " kr skrymmandetillägg eller 2 valörlösa frimärken");
					break;
				case 109:
					
					if (EXP >= 1 && skrym <= 0)System.out.println(Rprismark + EXPtill + "kr" + "   -->   " + Rprismark + " kr porto + " + "\n" + EXPtill + " kr expresstillägg");
					if (EXP <= 0 && skrym <= 0)System.out.println(Rprismark + " kr");
					if (EXP >= 1 && skrym >= 1)System.out.println(Rprismark + EXPtill + SKRYM + "   -->   " + Rprismark + " kr porto + " + "\n" + EXPtill + " kr expresstillägg + "  + "\n" + SKRYM + " kr skrymmandetillägg eller 2 valörlösa frimärken");
					if (EXP <= 0 && skrym >= 1)System.out.println(Rprismark + SKRYM + " kr" + "   -->   " + Rprismark + "kr porto" + SKRYM + " kr skrymmandetillägg eller 2 valörlösa frimärken");break;
				case 127:
					
					if (EXP >= 1 && skrym <= 0)System.out.println(Rprismark + EXPtill + "kr" + "   -->   " + Rprismark + " kr porto + " + EXPtill + " kr expresstillägg");
					if (EXP <= 0 && skrym <= 0)System.out.println(Rprismark + " kr porto");
					if (EXP >= 1 && skrym >= 1)System.out.println(Rprismark + EXPtill + SKRYM + "   -->   " + Rprismark + " kr porto + " + EXPtill + " kr expresstillägg + " + SKRYM + " kr skrymmandetillägg");
					break;
				case 145:
					
					if (EXP >= 1 && skrym <= 0)System.out.println(Rprismark + EXPtill + "kr" + "   -->   " + Rprismark + " kr porto + " + "\n" + EXPtill + " kr expresstillägg");
					if (EXP <= 0 && skrym <= 0)System.out.println(Rprismark + " kr");
					if (EXP >= 1 && skrym >= 1)System.out.println(Rprismark + EXPtill + SKRYM + "   -->   " + Rprismark + " kr porto + " + "\n" + EXPtill + " kr expresstillägg + "  + "\n" + SKRYM + " kr skrymmandetillägg eller 2 valörlösa frimärken");
					if (EXP <= 0 && skrym >= 1)System.out.println(Rprismark + SKRYM + " kr" + "   -->   " + Rprismark + "kr porto" + SKRYM + " kr skrymmandetillägg eller 2 valörlösa frimärken");
					break;
				case 163:
					
					if (EXP >= 1 && skrym <= 0)System.out.println(Rprismark + EXPtill + "kr" + "   -->   " + Rprismark + " kr porto + " + "\n" + EXPtill + " kr expresstillägg");
					if (EXP <= 0 && skrym <= 0)System.out.println(Rprismark + " kr");
					if (EXP >= 1 && skrym >= 1)System.out.println(Rprismark + EXPtill + SKRYM + "kr" +"  -->   " + Rprismark + " kr porto + " + "\n" + EXPtill + " kr expresstillägg + "  + "\n" + SKRYM + " kr skrymmandetillägg eller 2 valörlösa frimärken");
					if (EXP <= 0 && skrym >= 1)System.out.println(Rprismark + SKRYM + " kr" + "   -->   " + Rprismark + "kr porto" + SKRYM + " kr skrymmandetillägg eller 2 valörlösa frimärken");
					break;
				
}
break;
	    	case 2:
	    		System.out.println("Rekvikt");
	    	Rvikt = input.nextInt();
	    	
	    	if (Rvikt > 2000) System.out.println("Detta paket är för tungt för att skicka.");
				if (Rvikt <= 50 && Rvikt >= 0) Rprisdir = 67;
				if (Rvikt <= 100 && Rvikt > 50) Rprisdir = 76;
				if (Rvikt <= 250 && Rvikt > 100) Rprisdir = 94;
				if (Rvikt <= 500 && Rvikt > 250) Rprisdir = 112;
				if (Rvikt <= 1000 && Rvikt > 500) Rprisdir = 130;
				if (Rvikt <= 2000 && Rvikt > 500) Rprisdir = 148;
				
				
	    	}
	    	System.out.println("Expresstillägg: Ja: Tryck 1 + ENTER    -    Nej: Tryck 0 + ENTER");
			EXP = input.nextInt();
			if (EXP >= 1 ) EXPtill = 168;
			System.out.println("Skrymmande:" + "\n" +  "brev/rulle med större tjocklek/diameter än 30 mm" + "\n" + "eller större kortsida än 250 mm (gäller ej Rek utrikes)");
			System.out.println("Ja: Tryck 1 + ENTER    -    Nej: Tryck 0 + ENTER");
			skrym = input.nextInt();
			if (skrym > 0) SKRYM = 18;
			System.out.println("Kostnad:");
				switch (Rprisdir) {
				
				case 67:
					
					if (EXP >= 1 && skrym <= 0)System.out.println(Rprisdir + EXPtill + "kr" + "   -->   " + Rprisdir + " kr porto + " + "\n" + EXPtill + " kr expresstillägg");
					if (EXP <= 0 && skrym <= 0)System.out.println(Rprisdir + " kr");
					if (EXP >= 1 && skrym >= 1)System.out.println(Rprisdir + EXPtill + SKRYM + "   -->   " + Rprisdir + " kr porto + " + "\n" + EXPtill + " kr expresstillägg + "  + "\n" + SKRYM + " kr skrymmandetillägg eller 2 valörlösa frimärken");
					if (EXP <= 0 && skrym >= 1)System.out.println(Rprisdir + SKRYM + " kr" + "   -->   " + Rprisdir + "kr porto" + SKRYM + " kr skrymmandetillägg eller 2 valörlösa frimärken");
					break;
				case 76:
					
					if (EXP >= 1 && skrym <= 0)System.out.println(Rprisdir + EXPtill + "kr" + "   -->   " + Rprisdir + " kr porto + " + "\n" + EXPtill + " kr expresstillägg");
					if (EXP <= 0 && skrym <= 0)System.out.println(Rprisdir + " kr");
					if (EXP >= 1 && skrym >= 1)System.out.println(Rprisdir + EXPtill + SKRYM + "   -->   " + Rprisdir + " kr porto + " + "\n" + EXPtill + " kr expresstillägg + "  + "\n" + SKRYM + " kr skrymmandetillägg eller 2 valörlösa frimärken");
					if (EXP <= 0 && skrym >= 1)System.out.println(Rprisdir + SKRYM + " kr" + "   -->   " + Rprisdir + "kr porto + " + SKRYM + " kr skrymmandetillägg eller 2 valörlösa frimärken");
					break;
				case 94:
					
					if (EXP >= 1 && skrym <= 0)System.out.println(Rprisdir + EXPtill + "kr" + "   -->   " + Rprisdir + " kr porto + " + "\n" + EXPtill + " kr expresstillägg");
					if (EXP <= 0 && skrym <= 0)System.out.println(Rprisdir + " kr");
					if (EXP >= 1 && skrym >= 1)System.out.println(Rprisdir + EXPtill + SKRYM + "   -->   " + Rprisdir + " kr porto + " + "\n" + EXPtill + " kr expresstillägg + "  + "\n" + SKRYM + " kr skrymmandetillägg eller 2 valörlösa frimärken");
					if (EXP <= 0 && skrym >= 1)System.out.println(Rprisdir + SKRYM + " kr" + "   -->   " + Rprisdir + "kr porto" + SKRYM + " kr skrymmandetillägg eller 2 valörlösa frimärken");
					break;
				case 112:
					
					if (EXP >= 1 && skrym <= 0)System.out.println(Rprisdir + EXPtill + "kr" + "   -->   " + Rprisdir + " kr porto + " + "\n" + EXPtill + " kr expresstillägg");
					if (EXP <= 0 && skrym <= 0)System.out.println(Rprisdir + " kr");
					if (EXP >= 1 && skrym >= 1)System.out.println(Rprisdir + EXPtill + SKRYM + "   -->   " + Rprisdir + " kr porto + " + "\n" + EXPtill + " kr expresstillägg + "  + "\n" + SKRYM + " kr skrymmandetillägg eller 2 valörlösa frimärken");
					if (EXP <= 0 && skrym >= 1)System.out.println(Rprisdir + SKRYM + " kr" + "   -->   " + Rprisdir + "kr porto" + SKRYM + " kr skrymmandetillägg eller 2 valörlösa frimärken");
					break;
				case 130:
					
					if (EXP >= 1 && skrym <= 0)System.out.println(Rprisdir + EXPtill + "kr" + "   -->   " + Rprisdir + " kr porto + " + "\n" + EXPtill + " kr expresstillägg");
					if (EXP <= 0 && skrym <= 0)System.out.println(Rprisdir + " kr");
					if (EXP >= 1 && skrym >= 1)System.out.println(Rprisdir + EXPtill + SKRYM + "   -->   " + Rprisdir + " kr porto + " + "\n" + EXPtill + " kr expresstillägg + "  + "\n" + SKRYM + " kr skrymmandetillägg eller 2 valörlösa frimärken");
					if (EXP <= 0 && skrym >= 1)System.out.println(Rprisdir + SKRYM + " kr" + "   -->   " + Rprisdir + "kr porto" + SKRYM + " kr skrymmandetillägg eller 2 valörlösa frimärken");
					break;
				case 148:
					
					if (EXP >= 1 && skrym <= 0)System.out.println(Rprisdir + EXPtill + "kr" + "   -->   " + Rprisdir + " kr porto + " + "\n" + EXPtill + " kr expresstillägg");
					if (EXP <= 0 && skrym <= 0)System.out.println(Rprisdir + " kr");
					if (EXP >= 1 && skrym >= 1)System.out.println(Rprisdir + EXPtill + SKRYM + "   -->   " + Rprisdir + " kr porto + " + "\n" + EXPtill + " kr expresstillägg + "  + "\n" + SKRYM + " kr skrymmandetillägg eller 2 valörlösa frimärken");
					if (EXP <= 0 && skrym >= 1)System.out.println(Rprisdir + SKRYM + " kr" + "   -->   " + Rprisdir + "kr porto" + SKRYM + " kr skrymmandetillägg eller 2 valörlösa frimärken");
					break;
					
					}
break;
	    case 3:
	    	
	    	int Lpris = 0;
	    	
	    	System.out.println("Vikt g");
	    	int Lvikt = input.nextInt();
	    	System.out.println("Längd cm:");
	    			int L = input.nextInt();
	    			System.out.println("Bredd cm:");
	    			int B = input.nextInt();
	    			System.out.println("Höjd cm:");
	    			int H = input.nextInt();
	    	if (Lvikt <= 1000 && L + B + H <= 90) Lpris = 58;
	    	if (Lvikt > 1000 && Lvikt <= 2000 && L + B + H <= 90) Lpris = 95;
	    	if (L + B + H > 90) System.out.println("Detta paket är för stort för att skicka.");
	    	if (Lvikt > 2000) System.out.println("Detta paket är för tungt för att skicka");
	    	System.out.println("Expresstillägg: Ja: Tryck 1 + ENTER    -    Nej: Tryck 0 + ENTER");
			EXP = input.nextInt();
			if (EXP >= 1 ) EXPtill = 183;
			System.out.println("Skrymmande:" + "\n" +  "brev/rulle med större tjocklek/diameter än 30 mm" + "\n" + "eller större kortsida än 250 mm (gäller ej Rek utrikes)");
			System.out.println("Ja: Tryck 1 + ENTER    -    Nej: Tryck 0 + ENTER");
			skrym = input.nextInt();
			if (skrym > 0) SKRYM = 18;
			System.out.println("Kostnad:");
			
			if (EXP >= 1 && skrym <= 0)System.out.println(Lpris + EXPtill + "kr" + "   -->   " + Lpris + " kr porto + " + "\n" + EXPtill + " kr expresstillägg");
			if (EXP <= 0 && skrym <= 0)System.out.println(Lpris + " kr");
			if (EXP >= 1 && skrym >= 1)System.out.println(Lpris + EXPtill + SKRYM + "   -->   " + Lpris + " kr porto + " + "\n" + EXPtill + " kr expresstillägg + "  + "\n" + SKRYM + " kr skrymmandetillägg eller 2 valörlösa frimärken");
			if (EXP <= 0 && skrym >= 1)System.out.println(Lpris + SKRYM + " kr" + "   -->   " + Lpris + "kr porto" + SKRYM + " kr skrymmandetillägg eller 2 valörlösa frimärken");
	    	input.close();
	    
	    }
	    	}
		}


	

