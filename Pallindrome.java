import java.util.Scanner;

public class Pallindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no-:");
        int no = sc.nextInt();
        int rev = 0;
        int digit = 0;
        int temp=no;
        while (no != 0) {
            rev = no % 10;
            digit = digit * 10 + rev;
            no = no / 10;
        }
        System.out.println(digit);
        if (rev == temp) {
            System.out.println("pallindrome");
        }
        else 
        {
            System.out.println("not pallindrome of a number");
        }
       
    }
}

