public class Program12 {
    public static void main(String [] args) {
         int x = 10;
         int y = 10;
         int z = 20;
         // TRUE && TRUE = TRUE
        if ((x >= y) && (x <= z)) {
            System.out.println(x + " is greater than or equal to " + y + " and less than or equal to " + z);
        }
		// True || False = False || True = True || True = True
        if ((x > y) || (x <= z)) {
            System.out.println(x + " is greater than or equal to " + y + " or less than or equal to " + z);
        }
 
        if ((x > y) || (x >= z)) {
            System.out.println(x + " is greater than or equal to " + y + " or less than or equal to " + z);
        }
        // !false = True (and) !true = False
        if ((x > y) || !(x >= z)) {
            System.out.println("Not Condition: " + x + " is greater than or equal to " + y + " or less than or equal to " + z);
        }          
    } 
 }