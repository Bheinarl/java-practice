package loop;

public class While2_3 {
    public static void main(String[] args) {
        int sum = 0;
        int i = 1;
        int endNum = 10;

        // i = 1, endNum = 3
        // i = 2
        // i = 3
        // i = 4
        while (i <= endNum) {
            sum = sum + i;
            System.out.println("i = " + i + " sum = " + sum);
            i++;
        }
    }
}
