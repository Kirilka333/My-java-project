public class AvarageCalculator {
    int[] nums = {10, 29, 23, 50, 100};

public static int findAvarage(int[] numsParameter) {
     int sum = 0;
     for (int i = 0; i < numsParameter.length; i++) {
        sum += numsParameter[i];
     }
     return sum / numsParameter.length;
}

    public static void main(String[] args) {
        int[] localNums = {50, 80, 23, 50, 100};
        int avarage = findAvarage(localNums);
        System.out.println("Средна стойност: " + avarage);
    }    
}
