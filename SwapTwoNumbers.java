public class SwapTwoNumbers {

    public static void main(String[] args) {
        
        int fNum=10,sNum=15;
        int swapNum=0;
        System.out.println("Before swap value for fNum:" +fNum +" and "+sNum);
        swapNum=fNum;
        fNum=sNum;
        sNum=swapNum;
        System.out.println("After swap value for fNum:" +fNum +" and "+sNum);

    }

}