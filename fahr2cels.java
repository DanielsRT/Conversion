import java.util.*;
public class fahr2cels {
    public static void main(String[] args) {
        System.out.println("Convert Fahrenheit to Celsius");
        double celsius;
        System.out.print("Enter Fahrenheit Temperature: ");
        Scanner key = new Scanner(System.in);
        double fahrenheit = key.nextDouble();
        System.out.println("You entered " + fahrenheit);
        celsius = 5.0/9.0 * (fahrenheit - 32);
        //Unformatted output
        System.out.println("celsius equivalent is " + celsius + " degrees");
        
        //Formatted output
        System.out.printf("celsius equivalent is %,.1f degrees\n", celsius);
        
        
        int myint = 2309;
        System.out.printf("myint %,d\n", myint);
            
        
        String mystring = "hello world";
        System.out.printf("the message is: %s\n", mystring);
        
        System.out.printf("%,.1f celsius is %,.1f fahrenheit\n",
                         celsius, fahrenheit);
        
        String message = String.format("%,.2f fahrenheit is %,.2f celsius\n",
                                      fahrenheit, celsius); 
        System.out.print(message);
        
    }
}