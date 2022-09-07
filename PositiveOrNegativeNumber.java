import java.util.Scanner;

public class PositiveOrNegativeNumber {

    public static void main(String[] args) {
        System.out.println("How to check Given Number is Positive or Negative?");
        Scanner _Scanner = new Scanner(System.in);
        int posNegNumber = _Scanner.nextInt();
        System.out.println(posNegNumber);  
        if(posNegNumber<0.0){
            System.out.println("Negative Number");
        } else{
            System.out.println("Positive Number");
        }
    }
}