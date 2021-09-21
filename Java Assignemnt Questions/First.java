import java.util.Scanner;
class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println("Factors are:");
        for (int i = 1; i < num; ++i) {
            if (num % i == 0) 
                System.out.print(i+ ",");
        }
        System.out.println();
        int sr = (int)Math.sqrt(num);
        String res;
        res =  (sr == num) ? "Square Exists" : "No Square Exists";
        System.out.println(res);
    }
}
