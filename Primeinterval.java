import java.util.Scanner;

public class Primeinterval {

    public static void main(String[] args) {
        System.out.println("How to calcualte DigitCount");
        Scanner _scanner=new Scanner(System.in);
        int low = _scanner.nextInt();
        int high = _scanner.nextInt();
        while(low<high){
            boolean flag = false;
            for (int i = 2; i < low/2; i++) {
                if(low%i==0){
                    flag=true;
                    break;
                }
            }
            if (!flag){
                System.out.println("Low Counts : "+low);
            }
            low++;
            }
    }
}