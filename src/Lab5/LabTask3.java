package Lab5;

public class LabTask3 {
        public static boolean isPrime(int num){
            if(num ==0 || num == 1){
                return false;
            }
            else {
                for (int i = 2; i < num; i++) {
                    if (num % i == 0) {

                        return false;
                    }
                }
            }
            return true;
        }
        public static  void generatePrime(int a,int b) {
            System.out.println("Prime number between 0 to 100 ");

            for (int i = a; i <= b; i++) {

                if (!isPrime(i)) {
                    continue;
                }
                System.out.print(i + " ");
            }
        }


        public static void main (String[]args){
            generatePrime(0, 100);
        }



    }


