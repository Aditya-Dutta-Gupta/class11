import java.util.*;
class unique
{
    Scanner sc=new Scanner(System.in);
    int n,m,l,c=0,a=0;
    char ch,ch1;
    int a2[]=new int[10];
    void input()
    {
        System.out.println("Enter two number where the first number should be greater than the other");
        m=sc.nextInt();
        n=sc.nextInt();
    }
    boolean check(String s)
    {
        l=s.length();
        boolean U = true;
        for(int j=0;j<l;j++)
            {
                ch=s.charAt(j);
                for(int k=j+1;k<l;k++)
                {
                    ch1=s.charAt(k);
                    if(ch==ch1)
                    {
                        U = false;
                        break;
                     
                    }
                }
            }
                        return U;
    }
    void display()
    {
        for(int i=m;i<=n;i++)
        {
            String a1=String.valueOf(i);
            boolean a=check(a1);
            if(a==true)
            System.out.println(i);
        }
    }
    public static void main(String[]args)
    {
        unique ob=new unique();
        ob.input();
        ob.display();
    }
}