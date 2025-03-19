/*
 * 1.sends a value back from a function
 * 2.example: ek glass paani laao
 * 3.what can be returned: value,variable,calculation,ect
 * 4.return ends the function immediatly
 * 5,function calls makes code jump around
 * 6.prefer returning values over using global variables
 */

import java.util.Scanner;

public class returnStatement {
    public static void main(String[] args) {
        greet();
        int first = readNumber();
        int second = readNumber();
        int sum = first + second;

        System.out.println("sum of your numbers is: " +sum);
    }
    public static int readNumber(){
        Scanner input = new Scanner(System.in);
        System.out.print("please enter the number: ");
        int number = input.nextInt();
        return number;

    }
    public static void greet(){
        System.out.println("Welcome to calculation...");
    }
}
