
public class ExactChange {
	
	public static double round100th(double x){
		x= Math.round(100*x)/((double)100);
		return x;
	}
	
	public static int IntgDivWDble (double dble1, double dble2){
		double num3, num4, numx;
		int num5;
		num3 = dble1/dble2;
		num4 = dble1%dble2;
		numx = num4 / dble2;
		
		num5 = (int) (num3 - numx);
		return num5;
		
	}

	
	public static void main (String [] ags){
	double amountowed, amountgiven, change, changetype, dollaholder, topdolla = 0, dollalevel = 0 ;
	int count, dollar20, dollar10 = 0, dollar5 = 0, dollar1 = 0, cent25 = 0, cent10 =0 , cent5 = 0, cent1 = 0;
	System.out.print("enter amount owed booglahbooglah: ");
	
	
	amountowed = IO.readDouble();
	
	System.out.print("enter amount given: ");
	amountgiven = IO.readDouble();
	change = amountgiven - amountowed;
	
	if (change < 0){
		System.out.println("Error, more was owed than given");
		return;
	}
	else if (change == 0){
		System.out.println("No change necessary");
		return;
	}
	topdolla = change - dollalevel;
	
	for(count = 1, dollar20 = 0; count < 9&&topdolla != 0; count++){
		if (count == 1){
			changetype = 20;
			topdolla = change - dollalevel;
			dollar20 = IntgDivWDble(topdolla, changetype);
			dollaholder = changetype * dollar20;
			dollalevel = dollalevel + dollaholder;
	
		}
	else if (count == 2){
			changetype = 10;
			topdolla = change - dollalevel;
			dollar10 = IntgDivWDble(topdolla, changetype);
			dollaholder = changetype * dollar10;
			dollalevel = dollalevel + dollaholder;
		}
	else if (count == 3){
			changetype = 5;
			topdolla = change - dollalevel;
			dollar5 = IntgDivWDble(topdolla, changetype);
			dollaholder = changetype * dollar5;
			dollalevel = dollalevel + dollaholder;
		}
	else if (count == 4){
			changetype = 1;
			topdolla = change - dollalevel;
			dollar1 = IntgDivWDble(topdolla, changetype);
			dollaholder = changetype * dollar1;
			dollalevel = dollalevel + dollaholder;
		}
	else if (count == 5){
			
			changetype = .25;
			topdolla = change - dollalevel;
			cent25 = IntgDivWDble(topdolla, changetype);
			dollaholder = changetype * cent25;
			dollalevel = dollalevel + dollaholder;
		}
	else if (count == 6){
			changetype = .10;
			topdolla = change - dollalevel;
			cent10 = IntgDivWDble(topdolla, changetype);
			dollaholder = changetype * cent10;
			dollalevel = dollalevel + dollaholder;
		}
	else if (count == 7){
			changetype = .05;
			topdolla = change - dollalevel;
			cent5 = IntgDivWDble(topdolla, changetype);
			dollaholder = changetype * cent5;
			dollalevel = dollalevel + dollaholder;
		}
	else if (count == 8){
			changetype = .01;
			topdolla = change - dollalevel;
			cent1 = IntgDivWDble(topdolla, changetype);
			
		
		}
		
	
				}
	change = round100th(change); 
	System.out.println("Your change is : $"+ change);
	
	System.out.println("You need "+dollar20+" twenty dollar bills");
	System.out.println("You need "+dollar10+" ten dollar bills");
	System.out.println("You need "+dollar5+" five dollar bills");
	System.out.println( "You need "+dollar1+" one dollar bills");
	System.out.println("You need "+cent25+" quarters");
	System.out.println("You need "+cent10+" dimes");
	System.out.println("You need "+cent5+" nickels");
	System.out.println("You need "+cent1+" pennies");
	
	
	
	
	}
}
