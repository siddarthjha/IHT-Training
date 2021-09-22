class first {
    
    void house(int n_house) {
        System.out.println("The number of houses for First Parent (Grand Parent): " + n_house);
    }
}

class second extends first {
    
    void house (int n_house) {
        System.out.println("The number of houses for Second Parent (Parent): " + n_house);
    }
}

class third extends second {
    
    void house (int n_house, int cars) {
        System.out.println("The number of houses for Son (Current Son): " + n_house);
        System.out.println("The number of cars for the son:" + cars);
    }
}

class Main {
    public static void main(String[] args) {
        int h1, h2, h3, c;
        h1 = 1;
        h2 = 2;
        h3 = 3;
        c= 2;
        first obj = new first();
        obj.house(h1);
        second obj2 = new second();
        obj2.house(h2);
        third obj3 = new third();
        obj3.house(h3, c);
    }
}