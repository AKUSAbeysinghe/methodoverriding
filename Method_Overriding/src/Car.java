public class Car {
    public  void drive(){
        System.out.println("Car drive!");
    }
}

class Audi extends Car{
    public  void reverse(){
        System.out.println("Reverse through conner!");
    }

    public  void breakCar(){
        System.out.println("Break through slope!");
    }

    public  void autoDrive(){
        super.drive();
        reverse();
    }
}

class test5{
    public static void main(String[] args) {
        Audi a=new Audi();
        a.autoDrive();
    }
}
