import java.util.Scanner;

public class CheckLeapYear {

    public static void main(String[] args) {
        System.out.println("How to check given year leap year or not ?");
     
        Scanner _Scanner=new Scanner(System.in);
        
        int year=_Scanner.nextInt();

        if(year%4 ==0 || year %400 ==0){
            System.out.println("Given year is Leap year");
        }else{
            System.out.println("Given year is Not Leap year");
        }
    }

}