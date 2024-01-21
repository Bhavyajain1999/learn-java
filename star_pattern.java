public class star_pattern  {
    public static void pattern(){
        int rows = 0;
        while (rows < 5){
            System.out.print("*");
            int stars = 0;
            while (stars < rows) {
                System.out.print(" *");
                stars++;
                                 }
            System.out.println();
            rows++;
            }
        }
    public static void main(String[] args) {
        pattern();
    }

}



