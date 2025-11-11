
public class CalcPi {
	public static void main(String [] args) { 
	  
		int N = Integer.parseInt(args[0]);
		double sum = 0.0;
		
		for(int i = 0 ; i < N; i++) {

	    double number = 1.0 / (2 * i + 1);
		  
		if (i % 2 == 0) {
	       sum = sum + number;
	     
	
	   } else { sum = sum - number;

     }   

	}

      System.out.println("pi according to java: " + Math.PI);
	  System.out.println("pi, approximated " + (sum * 4));
 
}


}



