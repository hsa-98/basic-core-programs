import java.io.*;
import java.util.Scanner;

public class array2D {
    public static int[][] read(int row, int column) {
        Scanner sc = new Scanner(System.in);
        int[][] mat = new int[row][column];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.println("Enter the value ");
                mat[i][j] = sc.nextInt();

            }
        }
        return mat;
    }

    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number ow rows");
        int row = sc.nextInt();
        System.out.println("Enter the number of columns");
        int column = sc.nextInt();
        int[][] mat = read(row,column);
        for (int i = 0; i < row; i++) {
            System.out.println("");

            for (int j = 0; j < column; j++) {
                System.out.print(mat[i][j]+" ");
            }
        }

    }
}



