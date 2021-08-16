package oop;

public class Static_method {

    public static void main(String[] args) {
        A.num2 = 5;
        
        A obj1 = new A();
        A obj2 = new A();
        A obj3 = new A();
        
        //Every object will have different value for num1
        obj1.num1 = 1;
        obj2.num1 = 2;
        obj3.num1 = 3;
        
        obj1.show();
    }
    
}

class A
{
    int num1;
    static int num2;
    
    public void show(){//Non-static methods can access static variables and functions
        num2 = 9; // This value of num2 will be shared by all the objects of this class.
        System.out.println(num2);
    }
    
    public static void increment()
    {
         //num1++; 
        /* Error because if we call this method by class name A.increment(), then
           compiler doesn't know which object's variable to increment, because there
           are 3 objects each object has a different value for num1. */
        
    }
}
