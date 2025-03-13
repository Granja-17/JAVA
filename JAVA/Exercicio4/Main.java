public class Main {
    public static void main(String[] args) {
      int[][] myNumbers = { {1, 2, 3}, {7, 8, 9} };
        int somar = 0;
      for (int i = 0; i < myNumbers.length; i++) {
         for(int j = 0; j < myNumbers[i].length; j++) {
            System.out.println(myNumbers[i][j]);
            somar += myNumbers[i][j];
         }
         System.out.println(somar);
      }
    }
 }
 