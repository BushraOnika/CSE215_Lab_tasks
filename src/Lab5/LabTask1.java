package Lab5;

import java.util.Scanner;

public class LabTask1 {
    public static int  isPerfect(int num) {
        int sum =0;
        for(int i=1;i<num;i++){
            if(num%i==0){
                sum+=i;
            }
        }
        if (sum==num){
            return 1;
        }
        return 0;

   }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        for (int i=2;i<=n;i++){
            int num=isPerfect(i);
            if(num ==1){
                System.out.print(i+" ");
            }
        }
    }

    }