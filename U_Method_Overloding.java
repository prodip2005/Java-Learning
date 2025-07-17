class calculator
{
    public int add(int n1,int n2,int n3)
    {
        
        return n1+n2+n3;
    }
    public int add(int n1,int n2)
    {
        return n1+n2;
    }
    public double add(double n1,double n2)
    {
        return n1+n2;
    }
}

public class U_Method_Overloding {
    public static void main(String[] args) 
    {
        calculator obj=new calculator();
        int r1=obj.add(3, 4);
        System.out.println(r1);
    }
}
//Since Java is method-friendly, whatever I send through the main method will be matched with the corresponding method, and the method that matches will receive the data.=====method overloding