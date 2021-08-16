package oop;

public class Static_Keyword {

    public static void main(String[] args) {
        Abc obj = new Abc();
        obj.show();
        
        Abc.show2();
    }
    
}

class Abc{
    public void show()
    {
        System.out.println("Hello");
    }
    
    public static void show2()
    {
        System.out.println("Hello 2");
    }
}
