import java.util.Scanner;

class Day4 {
    // Function to calculate factorial of a number
    public static int factorial(int n) {
      if(n == 0 || n == 1) return 1;
      int fact = 1;
      for(int i = 2; i <= n; i++)
        fact*=i;
      return fact;
    }

  public static void main(String args[]) {
    // Get the input
    Scanner scanner = new Scanner(System.in);
    int num = scanner.nextInt();
    scanner.close();
  
    // Declare all the variables requried
    int lasDigit = 0;
    int sum = 0;
    int remNum = num; // reassigning because we need the value of num to check it's equality with sum later

    while(remNum>0) {
      lasDigit = remNum%10;
      sum+=factorial(lasDigit);
      remNum/=10;
    }

    if( sum == num ) 
      System.out.print("Strong Number");
    else 
      System.out.print("Not Strong Number");
  }
}