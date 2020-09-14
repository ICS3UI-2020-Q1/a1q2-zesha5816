import java.util.Scanner;
/**
 *program that will ask the user for two numbers and then calculate the quotient of that number and the remainder
 * @author Ahmad Zeshan 
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.println("Please enter in two integers, on seperate lines, to divide.");
		int dividend = input.nextInt();
		int divisor = input.nextInt();
    // TODO code application logic here
    int quotient = dividend / divisor;
    int remainder = dividend % divisor;
		System.out.println(dividend + "/" + divisor + " is " + quotient + " with a remainder of " + remainder + ".");
        
				
  }
}
