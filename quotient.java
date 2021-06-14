import java.util.Scanner;

public class quotient {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the divisor");
        int divisor = sc.nextInt();
        System.out.println("Enter the dividend");
        int dividend = sc.nextInt();
        int quotient = dividend/divisor;
        int remainder = dividend % divisor;
        System.out.println("Quotient is "+quotient+" remainder is "+remainder);
    }
}
