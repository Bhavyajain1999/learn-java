package Challenges.example.lastChallenge;

public class testarray {
    public static void main(String[] args) {
        ArrayOperations opr = new ArrayOperations(new int[]{1,2,3,4,5});
        ArrayOperations.statistics statistics = opr.new statistics();
        System.out.println((long)statistics.mean());

    }
}
