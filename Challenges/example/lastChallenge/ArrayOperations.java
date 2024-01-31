package Challenges.example.lastChallenge;

public class ArrayOperations {
    private  int[] number;

    public ArrayOperations(int[] number) {
        this.number = number;
    }

    public   class statistics{
        double mean(){
            double sum = 0;
            for (int i : number) {
                sum += i;

            }
            return sum/ number.length;
        }
        double median(){
            return 0;
        }

    }
}
