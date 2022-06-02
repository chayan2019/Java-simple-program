import java.util.Scanner;

public class ReversedNumber {

    public static void main(String[] args) {

        System.out.println("How to do Reverse Number!!");

        Scanner scanner= new Scanner(System.in);
        int number = scanner.nextInt();
        int remainder,result=0;

        while(number!=0){
              
              remainder=number%10;
              result=result*10+remainder; 
              number=number/10;

        }
        System.out.println("Reverse Number of %d!!" +result);
    } 
}