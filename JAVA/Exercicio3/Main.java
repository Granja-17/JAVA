public class Main {
    public static void main(String[] args) {
      int[][] myNumbers = { {1, 3}, {7, 9} };
      for (int i = 0; i < myNumbers.length; i++) {
         for(int j = 0; j < myNumbers[i].length; j++) {
            System.out.println(myNumbers[i][j]);
         }
         System.out.println("..");
      }
    }
 }
 