import java.util.Scanner;

public class CheckPrimeOrNot {

    public static void main(String[] args) {
        System.out.println("How to Check Prime or not given number");
        Scanner scanner= new Scanner(System.in);
        int number = scanner.nextInt();
        boolean checkPrime =false;
        for (int i = 2; i <=number/2; i++) {
            if(number%i == 0){
                checkPrime=true;
                break;
            }
        } 
        
        if(!checkPrime){
            System.out.println("prime Number");
        }else{
            System.out.println("Not a prime Number");

        }
    } 
}