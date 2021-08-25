import java.util.*;
public class MoneyConverter {
    
    static Scanner keyb = new Scanner(System.in);
    public static void main(String[] args){
        System.out.println("\nWelcome to the Money Conversion Program");
        
        System.out.print("Enter start, stop, and update values: ");
        int startAmount = keyb.nextInt();
        int stopAmount = keyb.nextInt();
        int updateAmount = keyb.nextInt();
        
        // input validation loop, forces updateAmount to be at least 1
        while (updateAmount < 1) {
            System.out.println("Update amount must be 1 or greater.");
            System.out.print("Re-enter update amount: ");
            updateAmount = keyb.nextInt();
        }
        
        double EURO_RATE = 0.82;
        double JAMA_RATE = 150.76;
        System.out.println("Dollars     Euros       Jamaican Dollars");
        for (int dollars = startAmount; dollars <= stopAmount; dollars += updateAmount) {
            double euros = dollars * EURO_RATE;
            double jamaDollars = dollars * JAMA_RATE;
            System.out.printf("$%,7d    E%,7.2f    JD%,15.0f\n",
                              dollars, euros, jamaDollars);
        }
        System.out.println("Thanks for using the Money Conversion Program\n");
    }
}