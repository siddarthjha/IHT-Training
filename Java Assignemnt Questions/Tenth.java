import java.util.Scanner;
class Vehicle {
    int serial;
    Vehicle() {
        this.serial = 0;
    }
}
class maruti extends Vehicle {
    serial = 1;
    void vehicle() {
        System.out.println("Maruti car:\n Nice Car :)" );
    }
}

class harley extends first {
    serial = 2
    void vehicle () {
        System.out.println("Harley bike:\n Nice bike :)");
    }
}

class air extends second {
    serial = 3
    void vehicle () {
        System.out.println("This is Airway:\n Nice Airway :) ");
    }
}

class Main {
    public static void main(String[] args) {
        
        air obj = new air();
        maruti obj2 = new air();
        harley obj3 = new air();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your choice: \n1.Maruti\n2.Harley\n3.Air");
        int choice;
        choice = sc.nextInt();
        if(obj.serial == choice)
            obj.vehicle();
        else if(obj2.serial == choice)
            obj2.vehicle();
        else if(obj3.serial == choice)
            obj3.vehicle();
        else
            System.out.println("Wrong choice :(");
    }
}