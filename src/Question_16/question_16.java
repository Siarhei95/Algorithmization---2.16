package Question_16;
import java.util.Scanner;

public class question_16 {
    public static void main(String args[]) {
        Scanner in = new Scanner (System.in);
        System.out.print("Enter: n = ");
        int n = in.nextInt();
        int[][] a = new int[n][n];
        if (n % 4 > 0) {
            System.out.print("Error: Enter a multiple of 4."); // вводить числа кратные 4, 8, 16, 32 и т.д.
        } else {
            System.out.println("Original matrix: ");
            question_16.CreateArray1(a);
            question_16.CreateArray2(a);
            System.out.println("Magic square: ");
            question_16.ChangeArray1(a);
            question_16.ChangeArray2(a);
            question_16.CreateArray2(a);
        }
    }
    private static void CreateArray1(int a[][]) {
        int k = 1;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                a[i][j] = k;
                k++;
            }
        }
    }
    private static void CreateArray2(int a[][]) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                System.out.print(a[i][j] + "\t");
            }
            System.out.println();
        }
    }
    private static void ChangeArray1(int a[][]) { //замена главной диагонали зеркальным способом
        int t;
        for (int i = 0; i < a.length / 2; i++) {
            for (int j = 0; j < a.length / 2; j++) {
                if (i == j) {
                    t = a[i][j];
                    a[i][j] = a[a.length - 1 - i][a.length - 1 - j];
                    a[a.length - 1 - i][a.length - 1 - j] = t;
                }
            }
        }
    }
    private static void ChangeArray2(int a[][]) { //замена второстепнной диагонали зеркальным способом
        int t;
        for (int i = 0, j = a.length - 1 - i; i <= (a.length / 2) - 1; ++i, --j) {
            t = a[i][j];
            a[i][j] = a[j][i];
            a[j][i] = t;
        }
    }
}