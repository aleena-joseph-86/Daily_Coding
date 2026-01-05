import java.util.Scanner;

class Day1 {
  public static void main(String args[]) {
    // Get input from the user
    System.out.print("Enter the value of N: ");
    Scanner scanner = new Scanner(System.in);
    int N = scanner.nextInt();
    scanner.close();

    for(int i = 1; i <= N; i++) {
      for(int j = 1; j <= N;  j++) {
        if(i+j <=  N) // Logic to print spaces
          System.out.print(" ");
        else  // Logic to print stars
          System.out.print("*");
      }
      System.out.print("\n");
    }
  }
}