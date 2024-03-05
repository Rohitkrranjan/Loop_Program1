import java.util.Scanner;

public class Print_GreaterThen_5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter number : ");
        int n = input.nextInt();
        int count=0;
        while (n>0)
        {
            int digit = n % 10;
            if(digit >=5)
                count++;
            n = n/10;
        }
        System.out.print(count);
    }
}
