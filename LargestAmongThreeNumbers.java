import java.util.Scanner;

public class LargestAmongThreeNumbers {

    public static void main(String[] args) {

        System.out.println("How to Check Largest Number Among three Numbers");
        Scanner _scanner = new Scanner(System.in);        
        Scanner _scanner1 = new Scanner(System.in);        
        Scanner _scanner2 = new Scanner(System.in);        

        int firsNo=_scanner.nextInt();//5
        int SecNo=_scanner1.nextInt();//7
        int thirNo=_scanner2.nextInt();//9
        
         if(firsNo>SecNo && firsNo>thirNo){
             System.out.println("First number is Largest");
         }else if(SecNo>firsNo && SecNo>thirNo){
            System.out.println("Second number is Largest");
         }else{
            System.out.println("Third number is Largest");
         }   
    }
    
}