public class Driver {
    public static void main(String[] args) {
//   class car is blueprint and objects are the real values
//        declaring objects syntax class/object name/new/constructor
        Car myCar = new Car();
//        to access the properties of any class use the refrences and then put a dot after that it will show
//        you all the methods and properties
//        you can get access properties using the . oprator like--> product.price

        myCar.addFuel(6);
        myCar.drive();
        myCar.drive();
        myCar.drive();
        myCar.drive();
        myCar.drive();
        myCar.drive();
        myCar.drive();
        System.out.println(myCar.getCurrentFuelInLevel());
    }
}
