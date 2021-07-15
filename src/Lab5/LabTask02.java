package Lab5;

import java.util.Scanner;

public class LabTask02 {
    public static void main(String[] args) {
        int[][] arr = new int[3][3];
        int sum=0;
        Scanner sc = new Scanner(System.in);
        for(int r=0;r<3;r++) {
            for (int c = 0; c < 3; c++) {
                System.out.print("Enter A [" + r + "][" + c + "] = ");
                arr[r][c] = sc.nextInt();
                if(r==c){
                    sum +=arr[r][c];
                }
            }
        }
        System.out.println();
        System.out.println("The input Matrix is :  ");
        for(int r=0;r<3;r++) {
            for (int c = 0; c < 3; c++) {
                System.out.print(arr[r][c] +"\t");
            }
            System.out.println();
        }
        System.out.println();
        System.out.print("The sum of the matrix's main diagonal elements is : ");
        System.out.println(sum);



    }
}
