
public  class  TestRandom {
	public static void main(String[]  args) {
	    

  int N = Integer.parseInt(args[0]);
  int above = 0;
  int below = 0;
  for(int i = 0; i < N; i++){
	double random = Math.random();   
        	   
        
         if(random > 0.5){
            above++;
        } else { below++;
          
          }
        }

            System.out.println("> 0.5: " + above + " times" );     
            System.out.println("<= 0.5: " + below + " times" );
        
           if ( below != 0) {
            
          System.out.println( "ratio: " + above / (double)below);
          
          }
        
       
        }


   }
