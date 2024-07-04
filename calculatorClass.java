class calculator {
    public void print() {
        String str = "Hey this is a class method that use to create a object to call them";
        System.out.println(str);
    }

    public void addition(int x, int y) {
        int z = x + y;
        System.out.println("The addition of two number is : "+z);
    }
    
    public void subtraction(int x, int y) {
        int z = x - y;
        System.out.println("The subtraction of given number is : "+z);
    }
}

class calculator2 {
    public void print() {
        System.out.println("This is calculator2 class in this class we will solve the question related to multiply and dividion");
    }

    public void mul(int x, int y) {
        int z = x * y;
        System.out.println("The multiplication of these two numbers is : "+z);
    }

    public void div(int x, int y) {
        try {
            int z = x / y;
            System.out.println("The division of these two number is : "+z);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

public class calculatorClass {
    public static void main(String args[]) {
        
        // create object of a class 
        // create object for class calculator 
        calculator cal = new calculator();
        cal.print();
        cal.addition(5, 10);
        cal.subtraction(45, 65);

        // create object for class calculator2
        calculator2 calculator = new calculator2();
        calculator.mul(10, 10);
        calculator.div(45, 9);

    }
}
