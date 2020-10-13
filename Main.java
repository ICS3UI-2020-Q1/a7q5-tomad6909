/**
 * This program is a method named firstDigit that returns the first digit of an integer
 * @author David Toma
 */
public class Main {

  // create a method
  public static int firstDigit(int integer){
    // create a while statement to divide the integer by 10 until you get the first digit
    while(integer > 10 || integer < -10){
      integer = integer / 10;
    // return the integer to the user
    }return integer;
  } 
  
  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // create new variable and input the integer that you want the first digit to
    int totalFirst = firstDigit(2567);
    // print the first digit
    System.out.println(totalFirst);
    
  }
}

