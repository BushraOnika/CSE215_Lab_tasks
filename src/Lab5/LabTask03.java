package Lab5;

import java.util.Scanner;

public class LabTask03 {
    public static void main(String[] args) {
        int row,col;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter rows : ");
        row = sc.nextInt();
        System.out.print("Enter columns : ");
        col = sc.nextInt();
        int[] [] arr = new int[row][col];
        int[][] arr2 = new int[row][col];
        int [][] arr3 = new int[row][col];
        System.out.println("Enter 1st matrix elements: ");
        for(int r=0;r<row;r++) {
            for (int c = 0; c < col; c++) {
                System.out.print("Enter 1st matrix [" + r + "][" + c + "] = ");
                arr[r][c] = sc.nextInt();


            }
        }
            System.out.println();
        System.out.println("Enter 2nd matrix elements: ");
        for(int r=0;r<row;r++) {
            for (int c = 0; c < col; c++) {
                System.out.print("Enter 2nd matrix [" + r + "][" + c + "] = ");
                arr2[r][c] = sc.nextInt();


            }
        }
        for(int r=0;r<row;r++) {
            for (int c = 0; c < col; c++) {

                arr3[r][c] = arr[r][c]+arr2[r][c];

            }
        }
        System.out.println();
        System.out.println("First Matrix: ");
        for(int r=0;r<row;r++) {
            for (int c = 0; c < col; c++) {
                System.out.print(arr[r][c] +"\t");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("Second Matrix: ");
        for(int r=0;r<row;r++) {
            for (int c = 0; c < col; c++) {
                System.out.print(arr2[r][c] +"\t");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("Sum: ");
        for(int r=0;r<row;r++) {
            for (int c = 0; c < col; c++) {
                System.out.print(arr3[r][c] +"\t");
            }
            System.out.println();
        }
        System.out.println();

        }
    }

