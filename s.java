import java.util.*;
class s{
    public static void main(String args[])
    {
        HashMap<String,String> a=new HashMap<>();
        a.put("SNO","01");
        a.put("SNAME","Muraja");
        a.put("CITY","Chennai");
        System.out.println(a);
        //Modifying value for akey
        a.put("SNO","90");
        System.out.println(a);
        //removing key in ahashmap
        a.remove("SNAME");
        System.out.println(a);
        a.clear();
        System.out.println(a);

    }
}

