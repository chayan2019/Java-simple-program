public class Without3rdVariableSwap {

    public static void main(String[] args) {
        
        int fNum=10,sNum=15;
        System.out.println("Before swap value for fNum : " +fNum +" and "+sNum);
        fNum=fNum+sNum;
        sNum=fNum-sNum;
        fNum=fNum-sNum;
        System.out.println("After swap value for fNum : " +fNum +" and "+sNum);

    }

}