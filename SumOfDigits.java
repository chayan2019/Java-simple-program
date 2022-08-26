import java.util.Scanner;

public class SumOfDigits {

    public static void main(String[] args) {
        System.out.println("Sum of Digits");
        Scanner _Scanner=new Scanner(System.in);
        int number=_Scanner.nextInt();
        int result =0,remainder=0,originalNumber=0;
        originalNumber=number;
        while(originalNumber>0){
            remainder=originalNumber%10;
            result=result+remainder*10;
            originalNumber/=10;
        }
        System.out.println("number and Result " +number +":::"+result);
    }
}