import java.util.Scanner;

public class Print_Factor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a number : ");
        int n = input.nextInt();

        int i=1;
        while (i<n)
        {
            if(n%i == 0)
                System.out.print(i + " ");
            i++;
        }

    }
}
