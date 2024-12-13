import java.util.*;
class e
{
    public static void main(String args[])
    {
        LinkedHashSet<String> a=new LinkedHashSet<>();
        a.add("hello");
        a.add("hello");
        a.add("students");
        a.add("Rajesh");
        a.add("students");
        System.out.println(a);
        a.remove("Rajesh");
        System.out.println(a);
        a.clear();
        System.out.println(a);
    }
}