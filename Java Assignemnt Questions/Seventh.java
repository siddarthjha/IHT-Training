import java.util.Scanner;

public class Seventh {
    public  static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr1[][] = new int[2][3];
        int arr2[][] = new int[2][3];
        System.out.println("Enter elements of 2x3 matrix-1 for addition");
        for(int i = 0; i < 2; i++) {
            for(int j = 0; j < 3; j++) {
                arr1[i][j] = sc.nextInt();
            }
        }
        
        System.out.println("Enter elements of 2x3 matrix-2 for addition");
        for(int i = 0; i < 2; i++) {
            for(int j = 0; j < 3; j++) {
                arr2[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(arr1[i][j]+ " ");
            }
            System.out.println();
        }

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(arr2[i][j]+ " ");
            }
            System.out.println();
        }
        
        System.out.println("Addition:");
        for(int i = 0; i < 2; i++) {
            for(int j = 0; j < 3; j++) {
                System.out.print(arr1[i][j]+arr2[i][j]+ " ");
            }
            System.out.println();
        }
    }
}