import java.util.Scanner;

public class coinflip {
    public static void main(String args[]){
        double val,percentageHeads,percentageTails;
        int noHeads, noTails;
        noHeads=noTails=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the num of times u want to toss the coin");
        int num = sc.nextInt();
        for (int i =0;i<num;i++){
            val = Math.random();
            if(val<0.5){
                System.out.println("Heads");
                noHeads+=1;
                System.out.println(noHeads);
            }
            else{
                System.out.println("Tails");
                noTails+=1;
                System.out.println(noTails);
            }
        }
        percentageHeads= noHeads/(double)num*100;
        percentageTails=noTails/(double)num*100;
        System.out.println("Heads was"+percentageHeads +"% of tosses and tails was "+percentageTails+"%of tosses");
    }
}
