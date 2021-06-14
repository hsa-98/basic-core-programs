import java.util.Scanner;

public class quadratic {
    public static void main(String args[]){
        System.out.println("a^2x+bx+c: ");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a");
        int a = sc.nextInt();
        System.out.println("enter b");
        int b = sc.nextInt();
        System.out.println("enter c");
        int c = sc.nextInt();
        double delta = Math.pow(b,2)-(4*a*c);
        double root1 = (-b+(Math.sqrt(delta)))/(double) (2*a);
        System.out.println(root1);
        double root2 = (-b-(Math.sqrt(delta)))/(double) (2*a);
        System.out.println(root1);
        System.out.println(root1+" and "+root2+" are the two roots");
    }
}
