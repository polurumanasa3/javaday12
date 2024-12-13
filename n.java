import java.util.*;
class n{
    public static void main(String args[])
    {
        LinkedHashSet<String> a=new LinkedHashSet<>();
        a.add("Hello");
        a.add("Hello");
        a.add("students");
        a.add("rajesh");
        a.add("students");
        for(String s:a)
        {
            System.out.println(s+" ");

        }
    }
}