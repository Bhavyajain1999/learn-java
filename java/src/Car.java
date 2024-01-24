public class Car {
    int noOfWheels;
    String color;
    float maxspace;
    float currentFuelInLiters;
    int noOfSeats;
    public void drive(){
        if (currentFuelInLiters == 0){
            System.out.println("car is out of fuel");
        }
        else if (currentFuelInLiters < 5){
                System.out.println("car is in reserve mode please refuel");
                currentFuelInLiters--;

            }
            else{
                System.out.println("car is driving");
                currentFuelInLiters--;
            }
        
        
    
    }
    public void addFuel(float fuel){
        currentFuelInLiters = currentFuelInLiters + fuel ;
    }
    public float getCurrentFuel(){

        return currentFuelInLiters;

    }
    
    
}
