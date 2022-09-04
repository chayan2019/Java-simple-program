import java.util.Scanner;

public class DigitCount {

    public static void main(String[] args) {
        System.out.println("How to calcualte DigitCount");
        Scanner _scanner=new Scanner(System.in);
        int number = _scanner.nextInt();
        int divident=0,remainder=0,count=0;
        while(number>0){
            number=number/10;
            remainder=number%10;
            count++;
        }
        System.out.println("Digit Counts : "+count);
    }
}