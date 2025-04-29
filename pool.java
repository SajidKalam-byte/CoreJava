public class pool {
    public static void main(String arg[])
    {
        String s1= "Python";
        String s2= "Python";
        System.out.println("String s1 is "+ s1);
        System.out.println("String s2 "+ s2);
        System.out.println(s1==s2);
        s1= s1+" lang";
        System.out.println("String s1 is "+ s1);
        System.out.println("String s2 "+ s2);

        String s3 = new String ("Python");
        System.out.println("String s3 "+ s3);
        System.out.println(s2==s3);
        String s4 = new String ("Python").intern();
        System.out.println("String s4 "+ s4);
        System.out.println(s2==s4);
    }
}
