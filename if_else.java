public class if_else {

    public static void main(String[] args) {
        boolean isSeniorCitizen = false;
        boolean isAnAdult = true;

        if (isSeniorCitizen) {
            System.out.println("hello senior citizen");
        }
        else if (isAnAdult) {
            System.out.println("hello adult");
        }
        else {
            System.out.println("hello child");
        }
    }
}