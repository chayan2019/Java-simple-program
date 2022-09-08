import java.util.Scanner;

public class PalindromeString {

    public static void main(String[] args) {
        System.out.println("How to check Plaimdrome of given number:");
        Scanner scanner=new Scanner(System.in);
        String originalString= scanner.next();//chayan
        String reversedString="";
        for (int i = originalString.length()-1; i >=0 ; i--) {
            reversedString=reversedString+originalString.charAt(i);
        }
        if(originalString.toLowerCase().equals(reversedString.toLowerCase())){
            System.out.println("Plaindrome String");
        }else{
            System.out.println("Not a Plaindrome String");
        }
    }
}       
        