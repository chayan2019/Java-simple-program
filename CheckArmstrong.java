import java.util.Scanner;

public class CheckArmstrong {

    public static void main(String[] args) {
        System.out.println("How to check given number is Armstrong or not");
        Scanner _Scanner =new Scanner(System.in);
        int number = _Scanner.nextInt();
        int remainder,originalNumber,result=0;
        originalNumber = number;
        while(originalNumber>0){
              remainder=originalNumber%10;
              result += Math.pow(remainder, 3);
              originalNumber=originalNumber/10;
        }
        if(number == result){
            System.out.println("Armstrong Numbers");
        }else{
            System.out.println("Not an Armstrong Number");

        }
    }
}