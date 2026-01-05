import java.util.Scanner;

class Day5 {

    // Function to find the total number of digits
    public static int findNoOfDigits(int n) {
      int count = 0;
      int lastDigit = 0;
      while(n>0) {
        lastDigit = n%10;
        count++;
        n/=10;
      }
      return count;
    }

    public static void main(String args[]) {
      // Get the input from the user
      Scanner scanner = new Scanner(System.in);
      int num = scanner.nextInt();
      scanner.close();

      int sum = 0;

      if(num<0) {
        System.out.println("Only positive inputs are allowed");
      } else {
        // Find the power to be raised to (here Power = total number of digits)
        int power = findNoOfDigits(num);

        // Declare the required variables
        int numCopy = num;
        int lastDigit = 0;
        int poweredValue =  1;

        while(numCopy > 0) {
          lastDigit = numCopy%10; // Get the last digit
          for(int i = 1; i <= power; i++) poweredValue*=lastDigit; // find lastDigit raised to the power
          sum+=poweredValue;
          poweredValue = 1; // free powredValued 
          numCopy/=10;
        }
      }

     if(sum == num) System.out.println("Armstrong Number");
     else System.out.println("Not Armstrong Number");
    }
}