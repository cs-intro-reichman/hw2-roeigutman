
public class Cheers {
        public static void main(String[] args) {
	    
        String s = args[0];
        
        int N = Integer.parseInt(args[1]);
        
        String a = "AEFHILMNORSX";
        
        for( int k = 0; k < s.length(); k++) {
           
          if ((a.indexOf(s.charAt(k))) == -1) {
            
           System.out.println( "give me an " + s.charAt(k) + ": " + s.charAt(k) + "!");
       
      } else {   System.out.println( "give me a " + s.charAt(k) + ": " + s.charAt(k) + "!");
            
        
            }   
          }  
             System.out.println("What does that spell?");
        
             for( int i = 0; i < N; i++) {
             System.out.println(args[0] + "!!!");

              }


        }


        }


