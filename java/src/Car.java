public class Car {
    int noOfWheels;
    String color;
    float maxspace;
    float currentFuelInLiters;
    int noOfSeats;
    public void drive(){
        System.out.println("Car is driving");
    
    }
    public void addFuel(float fuel){
        currentFuelInLiters = currentFuelInLiters + fuel ;
    }
    public float getCurrentFuel(){

        return currentFuelInLiters;

    }
    
    
}
