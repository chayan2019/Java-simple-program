import java.util.Scanner;

public class CheckAlphabet {

    public static void main(String[] args) {
        System.out.println("How to Check Given Character is Alphabet or not?");
        Scanner _Scanner = new Scanner(System.in);
        char character =_Scanner.nextLine().charAt(0);
        System.out.println("Given Character  :  " +character);

        if(character>='a' && character<'z' || character>='A' && character <'Z'){
            System.out.println("GIVEN CHARACTIER IS ALPHABET");
        }else{
            System.out.println("GIVEN CHARACTIER IS NOT ALPHABET");
        }
        
    }
}