public class Z1_EnhanceForLoop {
    public static void main(String[] args) {
        int n[]=new int[4];
        n[0]=4;
        n[1]=8;
        n[2]=3;
        n[3]=9;

        // for(int i=0; i<n.length; i++)
        // {
        //     System.out.println(n[i]);
        // }
        for(int i:n)
        {
            System.out.println(i);
        }
    }
}
