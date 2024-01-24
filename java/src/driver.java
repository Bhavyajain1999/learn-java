public class driver {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.currentFuelInLiters = 10;
        myCar.drive();
        System.out.println(myCar.currentFuelInLiters);
        
    }
    
}
