import java.util.*;
class g
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
    HashSet<String> a=new HashSet<>();
    //accepting the values into hash set
    int n=sc.nextInt();
    for(int i=0;i<n;i++)
    {
        String s=sc.nextLine();
        a.add(s);
    }
    System.out.println(a);
    }
}

