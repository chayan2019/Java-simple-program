import java.util.Arrays;

public class OneDArray {

    public static void main(String[] args) {
            
      int [] oneDArray={5,10,15,20,25,30,35,40,45,50,60,70,75,80,85,90,95,100};  
      
      int [] newArray=new int[5];
      
      for (int i = 0; i < oneDArray.length; i++) {
        System.out.println("List of element in Array : " +oneDArray[i]);
      }
       
      newArray[0]=10000;
      newArray[1]=1001;
      newArray[2]=1002;
      newArray[3]=1003;
      newArray[4]=1004;

      System.out.println("One D Array :    " +Arrays.toString(newArray));

    }
    
  }