// Demonstrates the Collatz conjecture.
public class Collatz {
	public static void main(String args[]) {
	    
		int n = Integer.parseInt(args[0]);
		String mode = args[1];
		
		if (mode.equals("v")){
	        for (int i = 1; i <= n; i++) {
			    int seed = i;
			    int count = 1;

				System.out.print(seed +" ");
			    while (seed != 1 || count == 1) {
				    if(seed % 2 == 0) {
					    seed = seed / 2;
				    } else {seed = seed * 3 + 1;}
				    System.out.print(seed +" ");
				    count++;
			    }
			    System.out.println("(" + count + ")");
	        }
		}
		
		System.out.println("Every one of the first " + n + " hailstone sequences reached 1.");
	    
	}

}