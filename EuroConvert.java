import java.util.*;
public class EuroConvert {
    static Scanner keyb = new Scanner(System.in);
    
    public static void main(String[] args){
        
        String answer = "";
        while (!answer.equals("no")) {
            System.out.print("Amount in euros: ");
            double euros = keyb.nextDouble();
            double dollars = euros * 1.212;
            System.out.printf("$%,.2f in dollars\n", dollars);
            
            System.out.print("Convert another amount: ");
            answer = keyb.next();
        }
        System.out.println("Goodbye");
    }
}