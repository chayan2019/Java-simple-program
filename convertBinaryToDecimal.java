public class convertBinaryToDecimal {

    public static void main(String[] args) {
        System.out.println("Hello World");
        int num = 10001111,decimalNumber=0,remainder=0,i=0;
        while(num!=0){
            remainder=num%10;
            num=num/10;
            decimalNumber += remainder * Math.pow(2, i);
            ++i;
        } 
        System.out.println("convertBinaryToDecimal "+decimalNumber);
    }
}