public class Car {

    int noOfWheels;
    String color;
    float maxSped;
    float currentFuelInLiters;
    int noOfSeats;



    public Car start() {
        if (currentFuelInLiters == 0) {
            System.out.println("car is out of fuel,can not start");
        } else if (currentFuelInLiters < 5) {
            System.out.println("car is in the reserved mode, please refuel");
        } else {
            System.out.println("car is started....bruhhhhh....");
        }
        return this;
    }

    public void drive() {
        if (currentFuelInLiters == 0) {
            System.out.println("car is out of fuel");
        } else if (currentFuelInLiters < 5) {
            System.out.println("car is in the reserved mode, please refuel");
            currentFuelInLiters--;
        } else {
            System.out.println("car is driving");
            currentFuelInLiters--;
        }

    }
    public void addFuel(float currentFuelInLiters) {
        this.currentFuelInLiters += currentFuelInLiters;
//       this. makes the current object of my class
    }
    public float getCurrentFuelInLevel() {
        return currentFuelInLiters;
    }
}
//current instance:refers to the current class instance variable.
//constructor call:can be used to invoke a constructor of the same class (this()).
//method call: invoke a method of the current object.
//pass as argument:can be as an argument in the method call
//return the current class instance in the method.

