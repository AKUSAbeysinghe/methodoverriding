public class Human {
    public void show(){
        System.out.println("I am a Animal");
    }
}

class  Gawesh extends Human{
    public  void show(){
        super.show();
        System.out.println("I am Gawesh!");

    }
}

class Test4{
    public static void main(String[] args) {
        Gawesh g=new Gawesh();
        g.show();
    }
}
