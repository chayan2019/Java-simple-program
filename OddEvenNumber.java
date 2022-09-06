import java.util.Scanner;

public class OddEvenNumber {

    public static void main(String[] args) {

        // How to check given Number is odd or even
        
        System.out.println("Please enter Input value : ");
        // create reader instance and take infrom from keyboad through user
        Scanner _Scanner=new Scanner(System.in);
        int numberToCheck=_Scanner.nextInt();

        if(numberToCheck%2==0){
            System.out.println("Even Number");
        }else{
            System.out.println("ODD Number");
        }
        
    }

}