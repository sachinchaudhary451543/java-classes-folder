// import java.util.Scanner;

// public class practical_set {
//     public static void main(String[] args) {
//         Scanner input = new Scanner(System.in);

//         System.out.println("welcome to arithmetic calculation....");
//         System.out.print("Enter the first number.: ");
//         int a = input.nextInt();
//         System.out.print("Enter the second number.: ");
//         int b = input.nextInt();

//         int c = a + b;
//         int d = a-b;
//         int e = a*b;
//         int fx = a/b;
//         int g = a%b;
//         System.out.println("bodmas calculation...\n");
//         System.out.println(
//             c+"\n"
//          +d +"\n" 
//          +e +"\n" 
//          +fx +"\n" 
//          +g +"\n");



//         System.out.println("Welcome to calculate parameter of rectangle....");
//         System.out.print("enter the first parameter: ");
//         double A = input.nextDouble();
//         System.out.print("enter the second parameter: ");
//         double B = input.nextDouble();
//         System.out.print("enter the third parameter: ");
//         double C = input.nextDouble();
//         System.out.print("enter the fourth parameter: ");
//         double D = input.nextDouble();

//         double parameter = A+B+C+D;
//         System.out.println("parameter is : " + parameter);


//         System.out.println("Welcome to calculate Area of Triangle....");
//         System.out.print("Enter the hight: ");
//         int hight = input.nextInt();
//         System.out.print("Enter the Base: ");
//         int base = input.nextInt();
//         System.out.println("Area of tringle is : ");
//         int Area = (base*hight)/2;

//         System.out.println(Area);


//         System.out.println("Welcome to calculate Simple intrest....");
//         System.out.print("Enter Principle Amount: ");
//         int Principle = input.nextInt();
//         System.out.print("Enter Rate: ");
//         float Rate = input.nextFloat();
//         System.out.print("Enter time: ");
//         float time = input.nextFloat();
//         float simple_intrest = (Principle * Rate * time)/100;
//         System.out.println("Simple intrest is ....: "+ simple_intrest );



//         System.out.println("Welcome to calculate compaound intrest....");
//         System.out.print("Enter Principle Amount: ");
//         int P = input.nextInt();
//         System.out.print("Enter Rate: ");
//         float R = input.nextFloat();
//         System.out.print("Enter time: ");
//         float t = input.nextFloat();
//         double compound_intrest = P * Math.pow((1 + R / 100), t);
//         System.out.println("compound intrest is : " + compound_intrest);


//         System.out.println("Welcome to convert fahrenheit to celsius....");
//         System.out.print("Enter Fahrenheit temprature:  ");
//         float F = input.nextFloat();
//         float celsius = (F - 32)*5/9;
//         System.out.println( "Your teemprature is : "+ celsius + "c");


//     }
// }



// question> create a programe that determine if a number is positive,negative, or zero

// import java.util.Scanner;

// class PositiveNegativeZero {

//     public static void main(String[] args) {
//         Scanner input = new Scanner(System.in);
//         System.out.println("Welcome to number checker\n");
//         System.out.print("Please enter your number ");
//         int num = input.nextInt();

//         if (num > 0){
//             System.out.println("number is positive");
//         }
//         else if ( num == 0) {
//             System.out.println("number is zero");

//         }
//         else{
//             System.out.println("number is negative");
//         }

//     }
// }





// create a program that determines if a nmber is odd or even.

// import java.util.Scanner;

// class oddEven {

//     public static void main(String[] args) {
//         Scanner input = new Scanner(System.in);
//         System.out.print("Enter anumber to check if a odd or even.: ");
//         int num = input.nextInt();
//         if (num % 2 == 0) {
//             System.out.println("Number is even..");
//         }
//         else{
//             System.out.println("number is odd..");
//         }
//     }
// }













// create a program that determines the greatest of thethree numbers

// import java.util.Scanner;

// class Greatest_number {

//     public static void main(String[] args) {
//         Scanner input = new Scanner(System.in);
//         System.out.println("Welcome to check greatest number of the three");
//         System.out.print("Enter the first number= ");
//         int a = input.nextInt();
//         System.out.print("Enter the second number= ");
//         int b = input.nextInt();
//         System.out.print("Enter the third number= ");
//         int c = input.nextInt();


//         if (a >= b && a >= c) {
//             System.out.println("greater number is= " + a);
//         }

//         else if (b >= a && b >= c) {
//             System.out.println("greater number is= " +b);
//         }
//         else {
//             System.out.println("greater number is= "+ c);
//         }
        
//     }
// }









// create a program that determines if a given year is a leap year
// (considering conditions like divisible by 4 but not 100, unless also divisible by 400).

// import java.util.Scanner;

// class leep_year {

//     public static void main(String[] args) {
//         Scanner input = new Scanner(System.in);
//         System.out.print("Enter the year to check leep OR not.= ");
//         int year = input.nextInt();


//         if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
//             System.out.println("this year is leep...");
//         }
//         else {
//             System.out.println("your year is not leep year");
//         }
//     }
// }




// create a program that calculates grades based on marks
// A-> above 90%, B-> above 75%, C-> above 60%, D-> above 30%, F-> below 30%

// import java.util.Scanner;

// class Grade {

//     public static void main(String[] args) {
//         Scanner input = new Scanner(System.in);
//         System.out.println("Welcome to your grade card");
//         System.out.print("Enter your marks: ");
//         int Marks = input.nextInt();
//         System.out.print("Please, Enter Total subjects: ");
//         int subject = input.nextInt();
//         float Grade = Marks/subject;


//         if (Grade >= 90){
//             System.out.println("You achieved the Grade: A");
//         }
//         else if ( Grade >= 75){
//             System.out.println("you achieved the Grade: B");
//         }
//         else if ( Grade >= 60){
//             System.out.println("you achieved the Grade: C");
//         }
//         else if ( Grade >= 30){
//             System.out.println("you achieved the Grade: D");
//         }
//         else if (Grade <= 30){
//             System.out.println("Sorry, you have failed and got the Grade: F");
//         }
//         else {
//             System.out.println("enter valid marks details.....");
//         }

//     }
// }






// create  a program that categoriz a person into diffrent age groups
// child-> below 13, teen-> below 20, adult-> below 60, senior-> above 60


// import java.util.Scanner;

// class categoriz {

//     public static void main(String[] args) {
//         Scanner input = new Scanner(System.in);
//         System.out.println("Welcome to categorize the person");
//         System.out.print("Enter your age: ");
//         int age = input.nextInt();
        
//         if (age >= 60){
//             System.out.println("you are in the category of Senior");
//         }
        
//         else if (age >= 20){
//             System.out.println("you are in the Category of Adult");
//         }
//         else if (age >= 13){
//             System.out.println("you are in the category of Teen");
//         }
//         else{
//             System.out.println("you are in the category of Child");
//         }

//     }
// }








// wap to create a table of numbers----------------

// import java.util.Scanner;

// class table {
//     public static void main(String[] args) {
//         Scanner input = new Scanner(System.in);
//         System.out.println("Welcome to multiplication table..");
//         System.out.print("Enter your number: ");
//         int num = input.nextInt();
//         printMultiplicationTable(num);
//     }

//     public static void printMultiplicationTable(int num) {
//         int i = 1;
//         while (i <= 10) {
//             System.out.println(num + " X " +i + " = " + (num*i));
//             i++;
//         }
//     }
    
// }




// create a program to sum all the od numbers from 1 to a specifies number N

// import java.util.Scanner;

// class sumOfOddNumbers {

//     public static void main(String[] args) {
//         Scanner input = new Scanner(System.in);
//         System.out.println("Welcome to sum of odd numbers..");
//         System.out.print("Enter the number: ");
//         int num = input.nextInt();
//         int sum = OddNumbers(num);
//         System.out.println("Odd sum till " + num + " is: " + sum);
//     }

//     public static int OddNumbers(int num) {
//         int sum = 0;
//         int i = 1;
//         while (i <= num) {
//             sum +=i;
//             i +=2;

//             }
//             return sum;
//         }
// }






// create a program to calculate the factorial of a given number

// import java.util.Scanner;

// class factorial {

//     public static void main(String[] args) {
//         Scanner input = new Scanner(System.in);
//         System.out.println("Welcome to calculate the factorial..");
//         System.out.print("Enter the number to calculate factorial: ");
//         int num = input.nextInt();
//         long fact = calculation(num);
//         System.out.println("Factorial is: " + fact);


//     }

//     public static long calculation(int num) {
//         if (num < 2) {
//             return 1;
//         }
//         long fact = 1;
//         int i = 2;
//         while (i <= num) {
//             fact *=i;
//             i++;
//         }
//         return fact;
//     }

// }






// create a program that computes the sum of the digits of an integer.

// import java.util.Scanner;

// class sumOfDigit {

//  public static void main(String[] args) {
//     Scanner input = new Scanner(System.in);
//     System.out.println("Welcome to sum of digits..");
//     System.out.print("Please enter the number: ");
//     int num = input.nextInt();
//     int sum = sum_of_digits(num);
//     System.out.println("Sum of digits is: " +sum);

//  }  
//  public static int sum_of_digits (int num) {
//     int sum = 0;
//     while (num > 0) {
//             sum += num % 10;
//             num /= 10;
//     }
//     return sum;
//  } 
// }



// create a program to find the latest common multiple(LSM) of two numbers.

// import java.util.Scanner;

// class lcm {

//     public static void main(String[] args) {
//         Scanner input = new Scanner(System.in);
//         System.out.println("Welcome to find  lcm...");
//         System.out.print("enter the first number: ");
//         int first = input.nextInt();
//         System.out.print("enter the second number: ");
//         int second = input.nextInt();
//         int LCM = leastCommon(first, second);
//         System.out.print("LCM OF THE DIGITS IS: " +LCM);
//     }
//     public static int leastCommon (int first, int second) {
//         int i  = 1;
//         while (true) {
//             int factor = first *i;
//             if (factor % second == 0) {
//                 return factor;
//             }
//             i++;
//         }
//     }
// }


// create a program to find the greatest comon fivisor(gdc) of two integers.

// import java.util.Scanner;

// class GCD {

//     public static void main(String[] args) {
//         Scanner input = new Scanner(System.in);
//         System.out.println("Wecome to find GCD..");
//         System.out.print("Enter he first number: ");
//         int first = input.nextInt();
//         System.out.print("Enter the second number: ");
//         int second = input.nextInt();
//         int great = gdc(first, second);
//         System.out.println("here is the GCD: " +great);

    
//     }
//     public static int gdc(int first, int second) {
//         int i = 2;
//         int great = 1;
//         int least = least(first, second);
//         while (i<= least) {
//             if (first % i == 0 && second % i == 0) {
//                 great = i;
//             }
//             i++;
//         }
//         return great;
//     }
//     public static int least(int first, int second){
//         if (first < second) {
//             return first;
//         }
//         else{
//             return second;
//         }
//     }
// }








// create a program to check whether a given number is prime.

// import java.util.Scanner;

// class primeNumbers {

//     public static void main(String[] args) {
//         Scanner input =new Scanner(System.in);
//         System.out.println("Welcome to check the prime number");
//         System.out.print("Enter the number: ");
//         int number = input.nextInt();
//         boolean isPrime = prime(number);
//         if (isPrime) {
//             System.out.println("your number is prime.");
//         }
//         else{
//             System.out.println("your number is not prime.");
//         }
//     }

//     public static boolean prime(int number){
//         int i = 2;
//         while (i < number) {
//             if (number % i == 0) {
//                 return false;
//             }
//             i++;
//         }
//         return true;
//     }
// }




// simple intrest calculation
// import java.util.Scanner;

// public class practical_set {

//     public static void main(String[] args) {
//         Scanner input = new Scanner(System.in);
//         System.out.println("welcome to calculate the simple intrest");
//         System.out.print("Enter the the principle value: ");
//         int Amount = input.nextInt();
//         System.out.print("enter the rate: ");
//         int rate = input.nextInt();
//         System.out.print("enter the time: ");
//         int time = input.nextInt();

//         int simple_intrest = (Amount*rate*time)/100;
//         int final_amouunt = Amount + simple_intrest;
//         System.out.println("Here is your simple intrest: " + simple_intrest);
//         System.out.println("Here is your amount after intrest: " + final_amouunt);
//     }
// }

// import java.util.Scanner;

// public class practical_set {

//     public static void main(String[] args) {
//         Scanner input = new Scanner(System.in);

//         System.out.println("Welcome to check number");
//         System.out.print("enter the number: ");
//         int number = input.nextInt();
        
//         if (number >= 0) {
//             System.out.println("It's positive number");
//         }
//         else{
//             System.out.println("the number is negative..");
//         }
//     }
// }





// create a programm that shows bitwise ANDof two numbers.

// import java.util.Scanner;

// public class practical_set {

//     public static void main(String[] args) {
//         Scanner input = new Scanner(System.in);
//         System.out.println("showing bitwise AND oprator \n");
//         System.out.print("Enter the first number: ");
//         int first = input.nextInt();
//         System.out.print("enter the second number: ");
//         int second = input.nextInt();

//         int result = first & second;
//         System.out.println("here is the answer: " + result);
//     }
// }


// public class practical_set {

//     public static void main(String[] args) {
//         int a = 1;
//         while (a <= 10) {
//             System.out.println(a);
//             a++;
            
//         }
//     }
// }







// public class practical_set {

//     public static void main(String[] args) {
//         System.out.println("welcome to function & loop class");

//         pattern();
//     }

//     public static void pattern(){
//         int rows = 0;
//         while (rows < 5) {
//             System.out.print("*");

//             int i = 0;
//             while (i < rows) {
//                 System.out.print(" *");
//                 i++;
//             }
//             System.out.println();

//             rows++;
//         } 
//     }
// }









// return statement

// import java.util.Scanner;

// public class practical_set {

//     public static void main(String[] args) {
//         int first = returnStatement();
//         int second = returnStatement();

//         int sum = first + second;
//         System.out.println("here is the the result: " + sum);
//     }

//     public static int returnStatement(){
//         Scanner input = new Scanner(System.in);
//         System.out.print("Please enter the number: ");
//         int number = input.nextInt();

//         return number;
//     }
// }


// public class practical_set {

//     public static void main(String[] args) {
//         System.out.println(argument_parameters(4, 9));
//     }

//     public static int argument_parameters(int first, int second){
//         System.out.println("the number recieved: " + first);
//         System.out.println("the number recieved: " + second);
        
//         return first + second;
//     }
// }



// multiplication table__________________

// import java.util.Scanner;

// public class practical_set {

//     public static void main(String[] args) {
//         Scanner input = new Scanner(System.in);
//         System.out.println("Welcome to get the table..");
//         System.out.print("Enter the number: ");
//         int table = input.nextInt();
//         number_table(table);
//     }

//     public static int number_table(int table) {
//         int i = 1;
//         while (i <= 10) {
//             System.out.println(table + " X " + i + " = " + (i*table));
//             i++;
//         }
//         return table;
//     }
// }



// get the sum of he odd ---------------------

// import java.util.Scanner;

// public class practical_set {
 
//     public static void main(String[] args) {
//         Scanner input = new Scanner(System.in);
//         System.out.println("welcom to get sum of all odd...");
//         System.out.print("Enter the number: ");
//         int num = input.nextInt();
//         int sum = OddSum(num);
//         System.out.println("oddsum till " + num + " is: " + sum);
//     }
//     public static int OddSum(int num) {
//         int sum = 0;
//         int i = 1;
//         while (i <= num) {
//             sum += i;
//             i += 2;
//         }
//         return sum;
//     }
// }






// get the factorial of the number ________________

// import java.util.Scanner;

// public class practical_set {

//     public static void main(String[] args) {
//         try (Scanner input = new Scanner(System.in)) {
//             System.out.println("welcome to get the factorial...");
//             System.out.print("Enter the number: ");
//             int number = input.nextInt();
//             long fact = factorial(number);
//             System.out.println("here is the factorial: "+fact +" of the number " + number );
//         }
        
//     }
//     public static long factorial(int number) {
//         if (number < 2) {
//             return 1;
//         }

//         int i = 2;
//         long fact = 1;

//         while (i <= number) {
//             fact *= i;
//             i++;
//         }
//         return fact;
//     }
// }





// create the program to calculate the sum of the digits of an integer.

// import java.util.Scanner;

// public class practical_set {

//     public static void main(String[] args) {
//         Scanner input = new Scanner(System.in);
//         System.out.print("Enter the number: ");
//         int number = input.nextInt();
//         int sum = sum_of_digits(number);
//         System.out.println("here is the sum: " + sum);
//     }

//     public static int sum_of_digits(int number){
//         int sum = 0;
//         while (number > 0) {
//             sum += number % 10;
//             number /= 10;
//         }
//         return sum;
//     }
// }






// create the program to find the lcm of two numbers.

// import java.util.Scanner;

// public class practical_set {

//     public static void main(String[] args) {
//         Scanner input = new Scanner(System.in);
//         System.out.print("enter te first number: ");
//         int first = input.nextInt();
//         System.out.print("enter the second number: ");
//         int second = input.nextInt();
//         int lcm = LCM(first, second);
//         System.out.println("lcm of the two numbers: " +lcm);
//     }
//     public static int LCM(int first, int second){
//         int i = 1;
//         while (i <= second) {
//             int factor = first * i;
//             if (factor % second == 0 ) {
//                 return factor; 
//             }
//             i++;
//         }
//         return 0;
//     }
// }







// create the program to find the gcd (gratest commen divisor)
// of the two numbers.

// import java.util.Scanner;

// public class practical_set {

//     public static void main(String[] args) {
//         Scanner input = new Scanner(System.in);
//         System.out.print("Enter the first number: ");
//         int first = input.nextInt();
//         System.out.print("enter the second number: ");
//         int second = input.nextInt();
//         int gcd = gcd(first, second);
//         System.out.println("here is your gcd: " + gcd);
//     }
//     public static int gcd (int first, int second){
//         int gcd = 1;
//         int i = 2;
//         int least = least(first, second);
//         while (i <= least) {
//             if (first % i == 0 && second % i == 0) {
//                 gcd = i;
//             }
//             i++;
//         }
//         return gcd;
//     }
//     public static int least(int first, int second){
//         if (first < second) {
//             return first;
//         }else {
//             return second;
//         }
//     }
// }






// create a program to check weather a given number is prime.

// import java.util.Scanner;

// class primeNumbers {

//     public static void main(String[] args) {
//         Scanner input = new Scanner(System.in);
//         System.out.println("welcome to prime number checker..");
//         System.out.print("enter your number: ");
//         int num = input.nextInt();
//         boolean isPrime = isPrime(num);
//         if (isPrime) { 
//             System.out.println("number is prime");
//         }else {
//             System.out.println("yoour number is not prime..");
//         }
//     }

//     public static boolean isPrime(int num){
//         int i = 2;
//         while (i < num) {
//             if (num % i == 0) {
//                 return false;
//             }
//             i++;
//         }
//         return true;
//     }
// }






// create a program to reverse the digits of a number.

// import java.util.Scanner;

// class reverseDigits {

//     public static void main(String[] args) {
//         Scanner input = new Scanner(System.in);
//         System.out.println("welcome to reverse the digits");
//         System.out.print("enter the digits: ");
//         int num = input.nextInt();
//         int reverse = reverse(num);
//         System.out.println("reverse of your number is: " + reverse);
//     }
//     public static int reverse(int num){

//         int newNum = 0;
//         while (num > 0) {
//             int digit = num % 10;
//             newNum = newNum * 10 + digit;
//             num /= 10;
//         }

//         return newNum;

//     }
// }









// create a program to print the fibonacci series up to a certain number.
