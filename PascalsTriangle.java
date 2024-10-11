public class PascalsTriangle {
    public static void main(String[] args) {
        int n = 5;
        for (int line = 0; line < n; line++) {
            int number = 1;
            for (int i = 0; i <= line; i++) {
                System.out.print(number + " ");
                number = number * (line - i) / (i + 1);
            }
            System.out.println();
        }
    }
}
