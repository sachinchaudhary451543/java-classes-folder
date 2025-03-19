/*method syntex-->
modifier return-type method-name(parameter-ist){
                 body of the method
}

public int adition(int oprand1, int oprand2){
         int sum;
            sum = oprand1 + oprand2:
            return sum;
}
*/
/*
 * 1. follow same ruless as variable name
 * 2.use() to contain parmeters
 * 3.invoke by using the function name followed by ()
 * fundamental for code organization and reusability
 */



public class methodsArrays {
    public static void main(String[] args) {
        // method call
        printPattern();
        printSecondPattern();
    }
// this is the mothed
    public static void printPattern() {
        int raw = 0;
        while (raw < 5) {
            System.out.print("*");
            int i = 0;
            while (i < raw) {
                System.out.print(" *");
                i++;
            }
            System.out.println();
            raw++;
        }
    }
    public static void printSecondPattern() {
        int raw = 5;
        while (raw > 0) {
            System.out.print("*");
            int i = 1;
            while (i < raw) {
                System.out.print(" *");
                i++;
            }
            System.out.println();
            raw--;
        }
    }
}
