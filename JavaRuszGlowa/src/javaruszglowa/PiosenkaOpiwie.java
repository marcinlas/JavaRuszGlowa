
package javaruszglowa;

public class PiosenkaOpiwie {

    public static void main(String[] args) {
    
        int iloscButelek = 99; 
        String slowo = "bootles";
        
        while (iloscButelek > 0) {
            if (iloscButelek == 1) {
                slowo = "bootle"; // liczba pojedyńcza
            }
                       
            System.out.println(iloscButelek + " " + slowo + " of beer on the wall");
            System.out.println(iloscButelek + " " + slowo + " of beer.");
            System.out.println("Take one down");
            System.out.println("Pass it around");
            System.out.println("");
            
                      
            iloscButelek = iloscButelek - 1;
         
            if (iloscButelek>0)  {
                System.out.println (" " + slowo + " of beer on the wall");
            } else {
                System.out.println("No more bootles of beer on the wall");
            } // koniec elset
        }
      }
   }
