import java.util.Scanner;

public class sumof3 {
    public static void triplet(int [] list){
        for(int i=0;i< list.length-2;i++){
            for(int j=i+1;j<list.length-1;j++){
                for(int k=j+1;k< list.length;k++){
                    if((list[i] + list[j] + list[k])==0){
                        System.out.println(list[i] +" "+list[j]+" "+ list[k]+" Add to 0");
                    }
                }
            }
        }
    }
    public static void main(String args[]){
        System.out.println("Enter the number of integers");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int [] list = new int[num];
        for(int i=0;i<num;i++){
            System.out.println("Enter the next num");
            list[i] = sc.nextInt();
        }
        triplet(list);


    }
}
