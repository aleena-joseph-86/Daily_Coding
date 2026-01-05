import java.util.Scanner;

class Day3 {
  public static void main(String args[]) {
    // Get the value of N from the user
    System.out.print("Enter the value of N: ");
    Scanner scanner = new Scanner(System.in);
    int N = scanner.nextInt();
    scanner.close();

    // Declare all the variables required
    int lastDigit = 0; 
    int count = 0;

    while(N!=0) {
      // Extract the last digit 
      lastDigit = N%10;
      // Check if lastDigit is divisible by 3
      if(lastDigit%3 == 0) count++;
      // Leave the last digit and extract the remaining digits
      N/=10;
    }

    System.out.print(count);
  }
}