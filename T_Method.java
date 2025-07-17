class computer{
    public void playMusic()//define behavior; void= not to return
    {
        System.out.println("Music Playing...");
    }

    public String getmeAPen(int cost)  //if i have to return i also have to give something
    {   
        if (cost>=10) {
            
            return "Pen";
        }
        return "You bitch";
    }
}

public class T_Method {
    public static void main(String[] args) 
    {
        computer obj=new computer();
        obj.playMusic();
        String s= obj.getmeAPen(2);
        System.out.println(s);
    }
}
