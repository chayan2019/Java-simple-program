import java.util.Scanner;

public class factorialOfNumber {

    public static void main(String[] args) {
        System.out.println("How to do factorial of given number:");
        Scanner scanner=new Scanner(System.in);
        int factorialNumber= scanner.nextInt();
        int fact=1;
        for(int i=1;i<=factorialNumber;i++){
            fact=fact*i;
        }
        System.out.println("Factorial value : " +fact);
    }

}