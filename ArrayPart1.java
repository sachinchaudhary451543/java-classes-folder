// type 1 to take the array with the seprate indexes (multiple variable) and call them seprately

import java.util.Scanner;

class ArrayPart1 {
    public static void main(String[] args) {
        int [] myArr = new int[5];
        myArr[0] = 98;
        myArr[1] = 78;
        myArr[2] = 8;
        myArr[3] = 18;
        myArr[4] = 9;
        System.out.println(myArr[0]);
        System.out.println(myArr[1]);
        System.out.println(myArr[2]);
        System.out.println(myArr[3]);
        System.out.println(myArr[4]);        
    }
}





// type 2 to store the array in single variable
class Array2 {

    public static void main(String[] args) {
        int [] myArr2 = {23,2,3,12,14};
        System.out.println(myArr2[0]);
        System.out.println(myArr2[1]);
        System.out.println(myArr2[2]);
        System.out.println(myArr2[3]);
        System.out.println(myArr2[4]);
    }
}



// method 3 we can print the array vriable directly
class indexArray {

    public static void main(String[] args) {
        int [] myArr3 = {2,3,5,6};
        int index = 2;
        System.out.println(myArr3[index]);
    }
}



// method 4 to print the array with the help of loop
class arrayLoop {
    public static void main(String[] args) {
        int [] myArr4 = {23,33,45,2,5};
        int index = 0;
        while (index < 5) {
            System.out.println(myArr4[index]);
            index++;
        }
    }    
}


// its also called array traversel (called to move around the things)
// method 5 when we dont know the index length
class arrayLength {

    public static void main(String[] args) {
        int [] myarr5 = {23,34,56,62,13,45};
        int index = 0;
        while (index < myarr5.length) {
            System.out.println(myarr5[index]);
            index++;
        }
    }
}


// string type array
class arrayStr  {

    public static void main(String[] args) {
        String[] strArr = new String[4];
        strArr[0] = "my string";

        String[] newStrArr = {"first", "second", "third"};
        System.out.println(newStrArr.length);
    }
}





// array searching-----------------
class  arraySearching {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr = {3,4,5,6,7,234,54,33,55,64,32,35,56,77,11,2,33};
        System.out.println("welcome to Array searching \n");
        System.out.print("Enter your number you want tosearch: ");
        int num = input.nextInt();
        boolean isFound = isFound(arr, num);
        if (isFound) {
            System.out.println("your number was foud in the array");
        }else{
            System.out.println("your number was not fond..");
        }

    }
    public static boolean isFound(int[] arr, int num){
        int index = 0;
        while (index < arr.length) {
            if (arr[index] == num) {
                return true;
            }
            index++;
        }
        return false;
    }
}