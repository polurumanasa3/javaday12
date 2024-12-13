import java.util.*;
class d
{
    public static void main(String args[])
    {
        LinkedList<Integer> a=new LinkedList<>();
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        for(int i=0;i<size;i++)
        {
            int s=sc.nextInt();
          a.addFirst(s);
        }
         LinkedList<String> b=new LinkedList<>();
         b=(LinkedList)a.clone();
         System.out.println(b);

        }
}