import java.util.Scanner;
class bentley {

    void calculate(int wheels, int glass, int doors) {
        System.out.println("The cost for bentley is:"+ wheels * glass * doors * 100);
    }
}

class polo extends bentley {
   
     void calculate(int wheels, int glass, int doors) {
        System.out.println("The cost for Polo is:"+ wheels * glass * doors * 100);
    }
}

class trailer extends polo {
    
     void calculate(int wheels, int glass, int doors) {
        System.out.println("The cost for Trailer is:"+ wheels * glass * doors * 100);
    }
}

class Main {
    public static void main(String[] args) {
        bentley obj = new bentley();
        polo obj1 = new polo();
        trailer obj2 = new trailer();

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your choice: \n1.Bentley\n2.Polo\n3.Trailer");
        int choice;
        choice = sc.nextInt();
        if(choice==1)
            obj.calculate(1,2,3);
        else if(choice==2)
            obj1.calculate(2,3,4);
        else if(choice==3)
            obj2.calculate(3,4,5);
        else
            System.out.println("Wrong choice :(");
    }
}