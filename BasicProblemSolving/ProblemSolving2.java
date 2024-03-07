import java.util.Scanner;

public class ProblemSolving2 {
    public static void main(String[] args) {
               String s;
       Scanner sc=new Scanner(System.in);
       System.out.println("ENTER THE ID :");
       s=sc.next();
       int n=s.indexOf('@');
       if(s.contains("gamil"))
           System.out.println("THE EMAIL ID IS ON GMAIL.");
       System.out.println("USER NAME :"+s.substring(0,n));
       System.out.println("DOMAIN NAME:"+s.substring(n+1));
    }
    
}
