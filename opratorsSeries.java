// time 3:45:00 = assignment oprator
// // oprators/if - else/ & number system >
// 1. assignment oprators> assign the right-hand oprand's value to teh left-hand oprand.[example: int a = 5;]
// 2. arithmetic oprators>    +,-,*,/,%
// 3. order oprators
// 4. shorthand oprators
// 5. unary oprators
// 6. if-else 
// 7. relational oprators 
// 8. logical oprators 
// 9. oprator precedence
// 10. intro to number system 
// 11. intro to bitwise oprators 


// ************************************assignment oprators***********************************************
// import java.util.Scanner;

// class opratorsExamples {
//     public static void main(String[] args) {
//         Scanner input = new Scanner(System.in);
//         System.out.println("here is the assigning oprators");
//         System.out.println("Welcome to swapping station\n\n");
//         System.out.print("Enter value of A: ");
//         int a = input.nextInt();
//         System.out.print("Enter value of B: ");
//         int b = input.nextInt();


//         int c = a;
//         a = b;
//         b = c;
        

//         System.out.println("Swapping done...");
//         System.out.println("Value of A is: " +a);
//         System.out.println("Value of B is: "+b);

//     }
// }




// *****************arithmetic oprators******************************************************************

// class oprators {
//     public static void main(String[] args) {
//         int a = 8;
//         int b = 5;
//         System.out.println("here is your aritmetic oprators");
//         System.out.println(a+b);
//         System.out.println(a-b);
//         System.out.println(a*b);
//         System.out.println(a/b);
//         System.out.println("modulus aritmetic oprators to get reminder in division:");
//         System.out.println(a%b+"\n\n");


//         float x = 8;
//         float y = 5;
//         System.out.println("aritmetic oprators in double:");
//         System.out.println(x+y);
//         System.out.println(x-y);
//         System.out.println(x*y);
//         System.out.println(x/y);
//         System.out.println(x%y);


//     }
// }







// *********************************order of opration**************************************************
// It's like a BODMAS METHOD to calcuate oprations

// class orderOfOpration {
//     public static void main(String[] args) {
//         System.out.println(8-9+22*2);

//         System.out.println(9/3/3);

//         System.out.println(9/(3/3 + 2));
//     }
    
// }





// ******* shorthand oprator**************************
// these are the assignment also to add,sub etc as> a += b
// equivalent construct --> [x= x+4, x= x-4, x= x*4, x= x/4, x= x%4]
// examples -->             [x+=4, x-=4, x/=4, x*=4,x%=4]




// ***********unary oprators****************************
// 1> - converts a positive value to a negative as x = -y
// class opratorsSeries {
//     public static void main(String[] args) {
//         int x = 5;
//         int y = -x;
//         int z = -y;
//         System.out.println(z);
// }
    
// }


// 2> pre increment -> increment the value by 1 and then use it in our statement as x = ++y
// 3> pre decrement -> decrement the value by1 and then use it in our statement as x = --y
// 4> post inccrement -> use current value in the statement and then increment it by 1 as x = y++
// 5> post decrement -> use curent value in the statement and then increment it by 1 as x = y--
// class opratorsSeries {
//     public static void main(String[] args) {
//         int a = 5;
//         System.out.println(a++);
//         System.out.println(a + " pre increment");
//         System.out.println(a--);
//         System.out.println(a + " pre decrement ");
//         System.out.println(++a);
//         System.out.println(a + " post increment");
//         System.out.println(--a);
//         System.out.println(a + " post decrement");
//     }
    
// }






// **********************7relational oprators-----------------------------------
// equality> (== checks value equality)
// inequality> (!= checks value inequality)
// relational> (> greater than, < les than, >= greater than equal to, <= less than equal to)

// import java.util.Scanner;

// class relationalOprator {
//     public static void main(String[] args) {
//         Scanner input = new Scanner(System.in);
//         System.out.println("Welcome to driving licence portal.");
//         System.out.print("Please enter your age: ");
//         int age = input.nextInt();

//         if (age >= 18) {
//             System.out.println("You are eligible to drive");
//         } else{
//             System.out.println("beta cycle use karo...!");
//         }

//     }
    
// }




// ************logical oprators *********************------------
// AND(&&)-> ALL CONDITION MUST BE TRUE FOR THE RESULT TO BE TRUE,
// OR(||)-> ONLY ONE CONDITION MUST BE TRUE FOR THE RESULT TO BE TRUE,
// NOT(!)-> Inverts the boolean value of a condition
// lower priority than math and comparation oprators

import java.util.Scanner;

class logicalOprators {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to shopping discount");
        System.out.print("Enter your age: ");
        int age = input.nextInt();
        System.out.print("Are you a female? (true/false)");
        boolean isFemale = input.nextBoolean();

        if (age < 5 ) {
            System.out.println("you got 75% discount");
        }
        else if (isFemale) {
            System.out.println("you got 58% discount");
        }
        else if (age > 60 && !isFemale) {
            System.out.println("you got 25% discount");
        }
        else {
            System.out.println("you are not eligible for discount..");
        }
    }
}