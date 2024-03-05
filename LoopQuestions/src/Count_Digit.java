import java.util.Scanner;

public class Count_Digit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter number : ");
        int num = input.nextInt();
        int count = 0;
        while (num>0)
        {
            int digit = num %10 ;
            count++;
            num=num/10;
        }
        System.out.print(count);
    }
}
