import java.util.Arrays;

public class InsertSpecificElementInLastPositionArray {

    public static void main(String[] args) {
      
      System.out.println("Insert Specific Element In last Position Array!!");
  
      int [] listOfElement={5,10,15,20,25,30,35,40,45,50,60,70,75,80,85,90,95,100};  
      
      int n=listOfElement.length;
      
      int [] newArray=new int[n+1];
    
      int newValue=1070; 
      
      
      for (int i = 0; i < n; i++) {
              newArray[i]=listOfElement[i];
      }
      newArray[n]= newValue;
      System.out.println("Insert Specific Element In last Position Array :     " +Arrays.toString(newArray));
  
      
    }
    
  }