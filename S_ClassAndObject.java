class calculator{    //it is a class
    int a;
    public int add(int num1,int num2)    //i= what i want to return;; add=method;; public =to call from other class
    {
        int r=num1+num2;
        return r;
    }
}


public class S_ClassAndObject {
   
    public static void main(String[] args) {
        
        int num1=4;
        int num2=5;

        calculator calc= new calculator();     //calculator=to give location of the class;calc
        int result=calc.add(num1,num2);
        
        System.out.println(result);
    }
}




//Object Oriented Programming
//Object - Properties and behaviors
//Class - Blueprint of Programme