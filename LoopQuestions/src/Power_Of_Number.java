import java.util.Scanner;

public class Power_Of_Number {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the value of a : ");
        int a= input.nextInt();
        System.out.print("Please enter the value of b : ");
        int b = input.nextInt();
        int prod = 1;
        for(int i=1;i<=b;i++)
        {
            prod = prod *a;
        }
        System.out.print("Power of a to b is : " + prod);

    }
}
