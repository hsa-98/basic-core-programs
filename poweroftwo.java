import java.util.Scanner;

public class poweroftwo {
    public static void main(String args[]){
        System.out.println("Enter the value of power you want(should be less than 31)");
        Scanner sc= new Scanner(System.in);
        int pow = sc.nextInt();
        if(pow<31){
            for(int i=1;i<=pow;i++){
                System.out.println("2^"+i+"="+Math.pow(2,i));
            }

        }
        else{
            System.out.println("Enter a number less than 31");
        }
    }
}
