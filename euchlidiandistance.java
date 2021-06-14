import java.util.Scanner;

public class euchlidiandistance {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the x coordinate of first point");
        int x1 = sc.nextInt();
        System.out.println("Enter the y coordinate of first point");
        int y1 = sc.nextInt();
        double len = Math.sqrt(Math.pow(x1,2) + Math.pow(y1,2));
        System.out.println("Length of line is: "+len);
    }
}
