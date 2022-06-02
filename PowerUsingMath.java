import java.util.Scanner;

public class PowerUsingMath {

    public static void main(String[] args) {
        System.out.println("How to do Power of given Number");
        Scanner _Scanner=new Scanner(System.in);
        int poweNumberer=_Scanner.nextInt();
        int result=(int) Math.pow(3, poweNumberer);
        System.out.println("poweNumberer   : "+result);
    }
}