import java.util.Scanner;

public class CheckDivisibleBy_7 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.print("Please enter a number  :  ");
        int n = input.nextInt();

        int i=0;
//        int digit = n%10;
        while (i<=n)
        {
            if( i % 7 == 0)
            {
                System.out.print(i + " ");
            }
            i++;

        }
    }
}
