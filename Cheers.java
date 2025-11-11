
public class Cheers {
        public static void main(String[] args) {
	    
        String s = args[0].toUpperCase();
        
        int n = Integer.parseInt(args[1]);
        
        String a = "AEFHILMNORSXaefhilmnorsx";
        
        for( int k = 0; k < s.length(); k++) {
           
          if ((a.indexOf(s.charAt(k))) == -1) {
            
           System.out.println( "Give me a  " + s.charAt(k) + ": " + s.charAt(k) + "!");
       
      } else {   System.out.println( "Give me an " + s.charAt(k) + ": " + s.charAt(k) + "!");
            
        
            }   
          }  
             System.out.println("What does that spell?");
        
             for( int i = 0; i < n; i++) {
             System.out.println(args[0].toUpperCase() + "!!!");

              }


        }


        }


