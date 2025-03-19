import java.util.Scanner;

public class loop {

    public static void main(String[] args) {
        // int num = 1;
        // while (num <= 10) {
        //     System.out.println(num);
        //     num = num + 1;
        // }
        // System.out.println("here is your series 1 to 100");
    

        // int num2 = 10;
        // while (num2 >= 1) {
        //     System.out.println(num2);
        //     num2 = num2 -1;
        // }


        Scanner input = new Scanner(System.in);
        int i = 0;
        while (i < 2) {
            System.out.print("enter the number: ");
            int inp = input.nextInt();
            System.out.println("number is "+inp);
            i = i + 1;
        } 
        
    }
}