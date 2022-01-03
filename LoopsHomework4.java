package Loops.Homework4;

public class LoopsHomework4 {
    public static void main(String[] args) {
        int end = 100;

        for(int i = 2;i<end ;i++){
            boolean isPrime=true;
            for (int j = 2; j <=i/2; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime){
                System.out.print(i+" ");
            }
        }

     
    }
}
