
public class tesa {
	
	public static boolean isValid(String str){
		for(int i = 0; i<str.length(); i++){
			char ch = str.charAt(i);
			if(!Character.isLetterOrDigit(ch) ){
				return false;
				
				
			}
			
		}
		return true;
	}
	
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
	
	public static boolean IsPrime (int num) {
		
		for (int i = 2; i<num; i++){
			  if (num % i == 0){
				return false;
			}
				 
		}
		if (num==1|| num == 0){
			 return false;
		 }
		else{
		return true;
		}
	}

public static void main (String [] args){
		double num3, num4, numx, dble1 = 0, dble2 = 0;
		int num5;
		System.out.print("enter dble1: ");
		dble1 = IO.readDouble();
		System.out.print("enter dble2: ");
		dble2 = IO.readDouble();
		num3 = dble1/dble2;
		num4 = dble1%dble2;
		numx = num4 / dble2;
		
		num5 = (int) (num3 - numx);
		IO.outputDoubleAnswer(num5);
		
	}

}
