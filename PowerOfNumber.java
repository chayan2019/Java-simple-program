public class PowerOfNumber {

    public static void main(String[] args) {
        System.out.println("How to do Power of number!!");
        int base =2 , exponential=5;
        long result=1;
        while(exponential!=0){
            result=result*base;
            --exponential;
        }
        System.out.println("Power of Number" +result);
    }
}