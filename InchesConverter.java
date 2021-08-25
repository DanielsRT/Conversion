import java.util.*;

public class InchesConverter {
    
    static Scanner keyb = new Scanner(System.in);
    
    static final int INCHES_PER_MILE = 1760 * 3 * 12;
    static final int INCHES_PER_YARD = 3 * 12;
    static final int INCHES_PER_FOOT = 12;
    
    public static void main(String[] args) {
        System.out.println("Welcome to the Inches Program");
        
        // input section
        System.out.print("What's the total distance in inches? ");
        int total_inches = keyb.nextInt();
        
        // calculation section
        int miles = total_inches / INCHES_PER_MILE;
        int inches_left_1 = total_inches % INCHES_PER_MILE;
        
        int yards = inches_left_1 / INCHES_PER_YARD;
        int inches_left_2 = inches_left_1 % INCHES_PER_YARD;
        
        int feet = inches_left_2 / INCHES_PER_FOOT;
        int just_inches = inches_left_2 % INCHES_PER_FOOT;
        
        // output section
        System.out.printf("%,d total inches is:\n", total_inches);
        if (miles > 0){
            System.out.printf("\t%,d miles\n", miles);
        }
        if (yards > 0){
          System.out.printf("\t%,d yards\n", yards);  
        }
        if (feet > 0){
            System.out.printf("\t%,d feet\n", feet);
        }
        if (just_inches > 0){
            System.out.printf("\t%d inches\n", just_inches);
        }
          
        System.out.println("Thanks for using the Inches Program");
    }
}