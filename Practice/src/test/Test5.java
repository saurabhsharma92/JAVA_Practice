package test;

class Car{
    int model, no;
    Car(int model, int no)
    {
        this.model = model;
        this.no = no;
    }

    void print()
    {
        System.out.println("no = " + no +
                ", model = " + model);
    }
}
public class Test5{
    public static void swap(Car c1, Car c2)
    {
        Car temp = c1;
        c1 = c2;
        c2 = temp;
    }

    // Driver method
    public static void main(String[] args)
    {
        Car c1 = new Car(101, 1);
        Car c2 = new Car(202, 2);
        swap(c1, c2);
        c1.print();
        c2.print();
    }
}
