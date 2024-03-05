import java.util.Scanner;

public class CheckNumIsDivisibleOrNot {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a number : ");
        int n = input.nextInt();

        int i=0;
        while(i<=n)
        {
            if(i % 8 == 0)
            {
                System.out.print(i + " ");
            }
            i++;
        }
    }
}
