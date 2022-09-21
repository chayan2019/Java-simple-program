import java.util.Arrays;

public class TwoDArray {

    public static void main(String[] args) {
            
      final int[][] matrix = {
        { 1, 2, 3 ,5},
        { 4, 5, 6,55 },
        { 7, 8, 9 }
     };

     for (int i = 0; i < matrix.length; i++) {
      //System.out.print(matrix[i]+" ");
      for (int j = 0; j < matrix[i].length; j++) {
           System.out.print(matrix[i][j]+" ");
        }
    
        System.out.println(); 
     }
  }
    
  }