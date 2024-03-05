import java.util.Scanner;

public class Count_All_Factors {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a number : ");
        int n = input.nextInt();

        int i=1;
        int count =0;
        while (i<n)
        {
            if(n%i==0)
            {
                count++;
            }
            i++;
        }
        System.out.print(count);
    }
}
