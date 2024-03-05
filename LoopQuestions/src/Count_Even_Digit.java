import java.util.Scanner;

public class Count_Even_Digit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a number : ");
        int n = input.nextInt();
        int count=0;
        while (n>0)
        {
            int digit = n %10;
            if(digit % 2 ==0)
                count++;
            n=n/10;
        }
        System.out.print(count);
    }
}
