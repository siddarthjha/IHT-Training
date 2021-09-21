import java.util.Scanner;
class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int count = 0;
        while (num != 0) {
            num = num / 10;
            ++count;
        }
        if (count % 3 == 0)
        {
            System.out.println("The cube is " +count * count * count);
        }
        else if (count % 2 == 0)
            System.out.println("The Square is " +count * count);
        else if (count % 2!= 0) {
            count--;
            System.out.println("The nearest square is"+ count * count);
        }
        System.out.println("Number of digits:"+count);
    }
}
