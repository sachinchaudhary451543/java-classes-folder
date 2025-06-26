import java.util.Scanner;
public class twoDArrayUtility {
    public static int[][] input2DArray(){
        Scanner input = new Scanner(System.in);
        System.out.print("please enter the number of raws: ");
        int raws = input.nextInt();
        System.out.print("please enter the number of columns: ");
        int columns = input.nextInt();
        int[][] numArr = new int[raws][columns];
        
        int i = 0;
        while (i < raws) {
            int j = 0;
            while (j < columns) {
                System.out.print("Enter the element rows " + ":" + (i + 1)  + ", columns: " + (j + 1) + " :");
            numArr[i][j] = input.nextInt();
            j++;
        }
            i++; 
        }
        return numArr;
    }
    public static void displayArray (int[][] numArray) {
         int i = 0;
         while (i < numArray.length) {
            System.out.print(numArray[i] + " ");
            i++;
         }
         System.out.println();
    }
}