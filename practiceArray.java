// 40. create a program to find the sum and avrage of all elements in an array.
// to get the method of the array utility use the array
// int[] ArrayName = arrayUtility.inputArray();

import java.util.Scanner;

class ArraySumAvrage {

    public static void main(String[] args) {
        System.out.println("welcome to array sum avarage");
        int[] numArray = arrayUtility.inputArray();
        long sum = sum(numArray);
        double avg = avg(numArray);
        System.out.println("here is your sum: " + sum);
        System.out.println("here is your avrage: " + avg);
    }
    public static long sum ( int[] numArray){
        long sum = 0;
        int i = 0;
        while (i < numArray.length) {
            sum += numArray[i];
            i++;
        }
        return sum;
    }

    public static double avg (int[] numArray){
        double sum = sum(numArray);
        return (sum / numArray.length);
    }
}





// 41> create a program to find the number of occurences of an element in an array.
 
class Occurences {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to array occurences");
        int [] numArray = arrayUtility.inputArray();
        System.out.print("Enter the element to check occurence: ");
        int numArr = input.nextInt();
        int occurence = noOfOccurences(numArray , numArr);

        System.out.println("Your element was found " + occurence + " Times in the array");
    }

    public  static int noOfOccurences(int[] numArray, int numArr) {
        int i = 0;
        int occ = 0;
        while (i < numArray.length) {
            if (numArray[i] == numArr) {
                occ++;
            }
            i++;
        }
        return occ;
    }
}







// 42> create a program to find the max and min element in an array.
class MaxMInArray {

    public static void main(String[] args) {
        System.out.println("Welcome to check the minimum and maximum in an array\n");
        int[] numArr1 = arrayUtility.inputArray();
        int minArray = min(numArr1);
        int maxArray = max(numArr1);
        System.out.println("Min of the Aray is: " + minArray);
        System.out.println("Max of the Aray is: " + maxArray);

    }
    public static int min (int[] numArr1){
        int min = Integer.MAX_VALUE;
        int i = 0;
        while (i < numArr1.length) {
            if (min > numArr1[i]) {
                min = numArr1[i];
            }
            i++;
        }
       return min;
    }
    public static int max (int[] numArr1){
        if (numArr1.length == 0) {
            return Integer.MIN_VALUE;
        }
        int max = numArr1[0];
        int i = 1;
        while (i < numArr1.length) {
            if (max < numArr1[i]) {
                max = numArr1[i];
            }
            i++;
        }
        return max;
    }
}


// 43> create a program to check if the given array is shorted.
class shorted {

    public static void main(String[] args) {
        System.out.println("Welcome to check the array shorting.");
        int[] numbers = arrayUtility.inputArray();
        boolean isInc = increaseShort(numbers);
        boolean isDec = decreaseShort(numbers);
        if (isDec || isInc) {
            System.out.println("your array is shorted");
        }else {
            System.out.println("your array is not shorted");
        }


    }
    public static boolean increaseShort(int [] numbers){
        int i = 1;
        while (i < numbers.length) {
            if (numbers[i] < numbers[i-1]) {
                return false;
            }
            i++;
        }
        return true;
    }
    public static boolean decreaseShort(int [] numbers){
        int i = 1;
        while (i < numbers.length) {
            if (numbers[i] > numbers[i-1]) {
                return false;
            }
            i++;
        }
        return true;
    }
}




// 44> create a program to return a new array deleting a specific element
class elementDelete {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to array element deleting..");
        int[] numArr = arrayUtility.inputArray();
        System.out.print("Enter the element to delete in the array: ");
        int numToDelete = input.nextInt();
        int[] newArr = deleteElement(numArr, numToDelete);
        System.out.println("here is your new array");
        arrayUtility.displayArray(newArr);  //to display array we created the method in the utility

    }
    public static int[] deleteElement (int[] numArr, int numToDelete) {
        int occ = Occurences.noOfOccurences(numArr, numToDelete);
        if (occ == 0) {
            return numArr;
        }
        int newSize = numArr.length - occ;
        int[] newArr = new int[newSize];
        int i = 0 , j = 0;
        while (i < numArr.length) {
            if (numArr[i] != numToDelete) {
                newArr[j] = numArr[i];
                j++;
            }
            i++;
        }
        return newArr;
    }
}






// 45>create a program to reverse the array.
class reverseArray {

    public static void main(String[] args) {
        System.out.println("Welcome to swaping array");
        int[] numArr = arrayUtility.inputArray();
        reverse(numArr);
        System.out.println("your reversed array is: ");
        arrayUtility.displayArray(numArr);


    }
    public static void reverse (int[] numArr){
        int i = 0;
        while (i < numArr.length/2) {
            int swap = numArr[i];
            numArr[i] = numArr[(numArr.length - 1) - i];
            numArr[(numArr.length - 1) -i] = swap;
            i++;  
        }
    }
}









//46> create a program to check if the array is palindrom or not.
class ArrayPalindrom {

    public static void main(String[] args) {
        System.out.println("Welcome to check if the array is palindrome");
        int[] numArr = arrayUtility.inputArray();
        boolean isPal = isPalindrome(numArr);
        if (isPal) {
            System.out.println("the array is palindrom");

        } else{
            System.out.println("the array is not palindrom");
        }

    }
    public static boolean isPalindrome (int [] numArr) {
        int i = 0;
        while (i < numArr.length/2) {
            if (numArr[i] != numArr[numArr.length -1 - i]) {
                return false;
            }
            i++;
        }
        return true;
    }
}






// 47> create a program to merge two shorted arrays.
class mergeTwoArrays{

    public static void main(String[] args) {
        System.out.println("Welcome to merge two shorted arrays");
        int[] arr1 = arrayUtility.inputArray();
        int[] arr2 = arrayUtility.inputArray();
        int[] mergeArray = merge(arr1, arr2);
        System.out.println("your merged array is: ");
        arrayUtility.displayArray(mergeArray);

    }
    public static int[] merge (int[]arr1, int[] arr2) {
        int newSize = arr1.length + arr2.length;
        int [] newArr = new int[newSize];
        int i = 0, j = 0, k = 0;
        while (i < arr1.length || j < arr2.length) {
            if (j == arr2.length || 
                    (i < arr1.length && arr1[i] < arr2[j])) {
                newArr[k] = arr1[i];
                i++;
                k++;
            }else {
                newArr[k] = arr2[j];
                k++;
                j++;
            }
        }
        return newArr;
    }
}



// 48> create a program to search an element in 2D Array.
class search2DArray {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to 2D array search");
        int[][] numArr = twoDArrayUtility.input2DArray();
        System.out.print("Now, enter the number you want to search: ");
        int num = input.nextInt();
        
        boolean isFound = searchElement(numArr, num);
        if (isFound) {
            System.out.println("your number was found");
        }else{
            System.out.println("your number was not found");
        }
        

    }
    public static boolean searchElement (int[][]numArr, int num){
        int i = 0;
        while (i < numArr.length) {
            int j = 0;
            while (j < numArr[i].length) {
                if (numArr[i][j] == num) {
                    return true;
                }
                j++;
            }
            i++;
        }
        return false;

    }
}







// create a program to d sum and avrage of all element in a 2-D array.
class sumAvrage2DArray {

    public static void main(String[] args) {
        System.out.println("Welcome to sum and avrage of 2D array");
        int[][] numArr = twoDArrayUtility.input2DArray();
        long sum = sum(numArr);
        double avrage = avrage(numArr);
        System.out.println("your sum of aray is: " + sum);
        System.out.println("your avrage of aray is: " + avrage);
    }
    public static double avrage (int[][] numArr){
        if (numArr.length == 0) {
            return 0;
        }
        int rows = numArr.length;
        int cols = numArr[0].length;
        double size = rows * cols;
        return sum(numArr) / size;
    }
    public static long sum(int[][] numArr){
        long sum = 0;
        int i = 0;
        while (i < numArr.length) {
            int j = 0;
            while (j < numArr[i].length) {
                sum += numArr[i][j];
                j++;
            }
            i++;
        }
        return sum;
    }
}






// create a program to find the sum of two diagonal elements.
class sumOfDagonal2DArray {

    public static void main(String[] args) {
        System.out.println("Welcome to sum of diagonals..");
        int[][] numArr = twoDArrayUtility.input2DArray();
        long sum = sumOfDagonals(numArr);
        System.out.println("sum of diagonals is: " +sum);
    }
    public static long sumOfDagonals (int[][] numArr) {
        long leftSum = sumOfLeftDagonal(numArr);
        long rightSum = sumOfRightDagonal(numArr);
        long sum = leftSum + rightSum;
        if (numArr.length % 2 != 0) {
            int ind = numArr.length / 2;
            sum -= numArr[ind][ind];
        }
        return sum;
    }

    public static long sumOfLeftDagonal (int[][] numArr) {
        long sum = 0;
        int i = 0;
        while (i < numArr.length) {
            sum += numArr[i][i];
            i++;
        }
        return sum;
    }

    public static long sumOfRightDagonal (int[][] numArr) {
        long sum = 0;
        int i = 0;
        while (i < numArr.length) {
            int col = numArr.length - 1 - i;
            sum += numArr[i][col];
            i++;
        }
        return sum;
    }
}