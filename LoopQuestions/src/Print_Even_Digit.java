import java.util.Scanner;

public class Print_Even_Digit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a number : ");
        int n = input.nextInt();
        while (n > 0)
        {
            int digit = n % 10;

            if(digit % 2 == 0)
            {
                System.out.print(digit);
            }
            n=n/10;

        }
    }
}
