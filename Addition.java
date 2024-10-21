import java.util.Scanner;
public class Addition {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the first number:");
        int a = sc.nextInt();
        Systrm.out.print("Please enter the second number:");
        int b = sc.nextInt();
        int sum = a + b;
        System.out.print("Addition is:" + sum);
    }
}
