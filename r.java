import java.util.*;
class r{
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
    }
}


