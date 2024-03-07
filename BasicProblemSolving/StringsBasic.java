public class StringsBasic {
    public static void main(String[] args) {
        String a="NISCHAY";
        String b="H R";

        //string.length();
        System.out.println(a+"\nstring length:"+a.length());

        //string.charAt();
        System.out.println( "character at first index :"+a.charAt(0));

        //string1.compareTo(string2);
        if(a.compareTo(b)==0)
            System.out.println("strings are equal");
        else{
            if(a.compareTo(b)>0)
                System.out.println("strings A is greater than B");
            else
                System.out.println("string B is greater than A");

        }

        //string2=string1.substring();
        String c=a.substring(0,3);
        System.out.println("substring of A: "+c);

//------------------------------------- StringBuilders -------------------------------------------
        System.out.println("-------------------- StringBuilders --------------");

        //declaration and initialisation;
        StringBuilder d=new StringBuilder(a);  // or  StringBuilder d=new String Builder("NISCHAY");
        System.out.println(d);

        // string.setCharAt();
        d.setCharAt(0,'n');
        System.out.println("setChar at zeroth index replacement: "+d);

        //string.insert();
        d.insert(1,"N");
        System.out.println("inserted string : "+d);

        //string.delete();
        d.delete(0,1);
        System.out.println("string with deleted first index: "+d);

        //string.append();
        d.append(".");
        System.out.println("string with appended character at end : "+d);
    }
    
}
