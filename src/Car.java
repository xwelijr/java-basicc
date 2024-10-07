public class Car {
    private String make;
    private String model;
    private int year;

    public Car(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    public void displayInfo(){
        System.out.println("Car Make : " + make + " Model : " +model + " Year :" + year);
    }

    public static void main(String[] args) {
        Car myCar = new Car("TESLA X" , "TESLA", 2019);
        myCar.displayInfo();
    }
}
