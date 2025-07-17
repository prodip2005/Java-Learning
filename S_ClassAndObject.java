class calculator{    //it is a class
    int a;   //instant variable
    public int add(int num1,int num2) //(method decleration)   //i= what i want to return;; add=method;; public =to call from other class
    {
        int r=num1+num2; //r= local variable
        return r; // returnning r
    }
}


public class S_ClassAndObject {
   
    public static void main(String[] args) {
        
        calculator calc= new calculator();  //(object creation)    //calculator=to give location of the class;calc //new=creating space in memory
        int num1=4;
        int num2=5;

        int result=calc.add(num1,num2);

        System.out.println(result);
    }
}




//Object Oriented Programming
//Object - Properties and behaviors
//Class - Blueprint of Programme