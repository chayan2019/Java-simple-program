import java.util.Scanner;

public class  FibonaciSeries {
    
    public static void main(String[] args) {

    System.out.println("How to print Fibinaci Series");
    Scanner scanner=new Scanner(System.in);
    int n = scanner.nextInt();
    //Fibinaci Series ::--- 0,1,1,2,3,5,8,13,21,34...
    int firstNum=0;
    int secNumber=1;
    int next=0;

    for (int i = 0; i < n; i++) {
        System.out.print(secNumber + ", ");
        next=firstNum+secNumber;
        firstNum=secNumber;
        secNumber=next;
    } 

    }
}
