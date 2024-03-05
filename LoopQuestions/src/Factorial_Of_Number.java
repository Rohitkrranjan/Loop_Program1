import java.util.Scanner;

public class Factorial_Of_Number {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a number : ");
        int n = input.nextInt();
        int prod = 1;
        for(int i=1;i<=n;i++)
        {
            prod = prod * i;
        }
        System.out.print("Factorial of a given number is : "+ prod );
    }
}
