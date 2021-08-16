package oop;

public class EncapsulationExample {

    public static void main(String[] args) {
        Employee e1 = new Employee();
        //e1.empID = 1; // Will not work since empID is private in Employee class
        //e1.empName = "John";
        e1.setEmpID(1);
        e1.setEmpName("John");
        
        Employee e2 = new Employee();
        //e2.empID = 2;
        //e2.empName = "David";
        e2.setEmpID(2);
        e2.setEmpName("David");
        
        
        System.out.println(e1.getEmpName() + " & " + e2.getEmpName());
    }
    
}

class Employee{
    private int empID; //Cannot be accessed outside the class
    private String empName;

    public int getEmpID() { //Getter for empID variable
        return empID;
    }

    public void setEmpID(int empID) { //Setter for empID variable
        this.empID = empID;
    }

    public String getEmpName() { //Getter for empName variable
        return empName;
    }

    public void setEmpName(String empName) { //Setter for empName variable
        this.empName = empName;
    }
    
    
}
