import java.util.Scanner;

public class harmonicnum {
    public static void main(String args[]){
        double a = 0;
        System.out.println("Enter number of harmonics you want");
        Scanner sc= new Scanner(System.in);
        int pow = sc.nextInt();
            for(int i=1;i<=pow;i++){
                a+=1/(double)i;
                System.out.println(a);

            }
    }
}
