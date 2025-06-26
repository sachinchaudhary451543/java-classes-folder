// in the array utility we make the utility class in other then file
// to store the reusable function to use in the main file
// create the method as->
// public static int[] AnyName(){
//      your function code here
// }



// now to call this method to your main file use the array
// int[] ArryName = arrayUtility.inputArray();


import java.util.Scanner;

public class arrayUtility {
    public static int[] inputArray(){
        Scanner input = new Scanner(System.in);
        System.out.print("please enter the number of elements: ");
        int size = input.nextInt();
        int[] nums = new int[size];
        
        int i = 0;
        while (i < size) {
            System.out.print("Enter the element no " + (i + 1) + " : ");
            nums[i] = input.nextInt();
            i++;
        }
        return nums;
    }
    public static void displayArray (int[] numArray) {
         int i = 0;
         while (i < numArray.length) {
            System.out.print(numArray[i] + " ");
            i++;
         }
         System.out.println();
    }
}
