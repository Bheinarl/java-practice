package loop.ex;

public class NestedEx2 {
    public static void main(String[] args) {
        int rows = 5;
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

//        int rows = 5;
//        String txt = "";
//
//        for (int i = 1; i <= rows; i++) {
//            txt += "*";
//            System.out.println(txt);
//        }
    }
}
