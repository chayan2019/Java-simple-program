import java.util.Arrays;

public class TwoDArray {

    public static void main(String[] args) {
            
      final int[][] rowColumn = {
        { 1, 2, 3 ,5},
        { 4, 5, 6,55 },
        { 7, 8, 9 },
        { 10, 11, 12 }
     };

     final int [][] rowColumn1={
        
      { 1,32,0,6,6},
      { 2,32,23,3,6},
      { 3,32,1,8,6},
      { 4,32,10,7,6}
     
    };

     for (int i = 0; i < rowColumn.length; i++) {

      for (int j = 0; j < rowColumn[i].length; j++) {
           System.out.print(rowColumn[i][j]+" ");
        }
    
        System.out.println(); 
     }

     System.out.println();

     for (int i = 0; i < rowColumn1.length; i++) {

      for (int j = 0; j < rowColumn1[i].length; j++) {
           System.out.print(rowColumn1[i][j]+" ");
        }
    
        System.out.println(); 
     }

  }
    
  }