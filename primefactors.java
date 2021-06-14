import java.util.Scanner;

public class primefactors {
    public static boolean prime(int num){
        if(num==0 || num == 1){
            return false;
        }
        for(int i=2;i<=Math.sqrt(num);i++){
            if (num%i == 0){
                return false;
            }
        }
        return true;
    }
    public static void primefactor(int num){
        if(prime(num)){
            System.out.println(num+"Is the prime factor");
        }
        else{
            for(int i=2;i<num/2;i++){
                if( num % i == 0 && prime(i)){
                    System.out.println(i+" Is a prime factor");
                }
            }

        }

    }
    public static void main(String args[]){
        System.out.println("Enter the number");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        primefactor(number);
    }
}
