import java.util.Scanner;

public class PalindromeNumber {

    public static void main(String[] args) {
        System.out.println("How to do factorial of given number:");
        Scanner scanner=new Scanner(System.in);
        int originalNumber= scanner.nextInt();
        int reversedNum=0 , num=0;
        int remainder=0;
        num = originalNumber;
        while(num>0){
            remainder=num%10;
            num=num/10;
            reversedNum=reversedNum*10+remainder;
        }
        if(originalNumber==reversedNum){
            System.out.println("Plaindrome Number");
        }else{
            System.out.println("Not a Plaindrome Number");
        }
    }
}       
        