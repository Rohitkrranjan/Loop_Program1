import java.util.Scanner;

public class EvenNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter number : ");
        int n  = input.nextInt();
        for(int i=0;i<=n;i++)
        {
            if(i % 2 == 0)
                System.out.print(i + " ");

        }

    }
}