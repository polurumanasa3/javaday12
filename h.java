import java.util.*;
class h{
    public static void main(String args[])
    {
        LinkedHashSet<String> a=new LinkedHashSet<>();
        a.add("Hello");
        a.add("hello");
        a.add("students");
        a.add("Rajesh");
        a.add("students");
        //printing using iterater
        Iterator itr=a.iterator();
        while(itr.hasNext())
        {
            System.out.print(itr.next()+" ");
        }
    }
}
        
    
