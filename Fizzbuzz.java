import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(new FileReader(args[0]));
        while (console.hasNext()) {
            int x = in.nextInt();
            int y = in.nextInt();
            int n = in.nextInt();

            for (int i = 1; i <= n; i++) {
                if (i % x == 0 && i % y == 0) {
                    System.out.printf("FB ");
                }
                else if (i % x == 0) {
                    System.out.printf("F ");
                } 
                else if (i % y == 0) {
                    System.out.printf("B ");
                } 
                else {
                    System.out.printf("%d ", i);
                }
            }
            System.out.println();
        }
        in.close();
    }
}
