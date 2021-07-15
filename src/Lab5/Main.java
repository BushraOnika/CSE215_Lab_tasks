package Lab5;
/*Create a class Named Students with a method highestScore.
public void highestScore(String[]name,double[] cgpa,int[] total)
        Take ten students name,total marks,cgpa in main method.Then print highest scorer’s information using
        highestScore method.

 */
import java.util.Scanner;
class Student {
    public void highestScore(String[] name, double[] cgpa, int[] total) {
        Scanner sc = new Scanner(System.in);
        double max = 0;
        int maxTotal=0;
        int count=0;

        for (int i = 0; i < 10; i++) {

            System.out.printf("Enter %d number of  student's name: ", i + 1);
            name[i] = sc.nextLine();
            System.out.printf("Enter %d number of student's CGPA : ", i + 1);
            cgpa[i] = sc.nextDouble();
            System.out.printf("Enter course code of the student number %d : ", i + 1);
            total[i] = sc.nextInt();
            sc.nextLine(); // clear out the /n from input  buffer.
            max=cgpa[0];
            maxTotal=total[0];
            if (cgpa[i]>max && total[i]>maxTotal) {
                max=cgpa[i];
                maxTotal=total[i];
                System.out.println(max);
                System.out.println(maxTotal);
            }
        }

    }
}
public class Main {

    public static void main(String[] args) {
	// write your code here
        int b=0;
        Student s = new Student();

       // s.highestScore("Bushra , onika, fghguki,rtui7i,ghyu7",2.45,435);
    }
}
