import java.util.Scanner;

public class Check_Prime_Number {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a number : ");
        int n = input.nextInt();
        int flag = 0;

        for(int i=2;i<n-1;i++)
        {
            if(n%i == 0)
            {
                flag =1;
                System.out.print("Not a prime number");
                break;
            }
        }
        if(flag == 0)
        {
            System.out.print("Given number is a prime number");
        }
    }
}
