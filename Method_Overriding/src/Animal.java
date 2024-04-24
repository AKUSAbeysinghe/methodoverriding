class Animal {
    public void print(){
        System.out.println("I am Animal!");
    }
}

class Dog extends Animal{
    public  void print(){
        System.out.println("I am Dog!");
    }

}


class Test{
    public static void main(String[] args) {
        Dog d=new Dog();
        d.print();
    }
}