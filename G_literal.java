class G_literal {
    public static void main(String[] a){
        int num1=0b101;
        int num2= 0x7E;
        int num3=1_00_00_00_00;
        double num4=12e10;

        char c='a';
        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);
        System.out.println(num4);
        System.out.println(c);
        
        c++;
        System.out.println(c);
    }
}
