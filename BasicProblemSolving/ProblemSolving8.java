import java.util.Scanner;
public class ProblemSolving8 {
    public static void main(String[] args) {
        
        // type and protocol of website;

       System.out.println("ENTER A URL:");
       Scanner sc=new Scanner(System.in);
       String s=sc.nextLine();
       if(s.startsWith("http"))
           System.out.println("TYPE OF PROTOCOL :HYPER TEXT TRANSFER PROTOCOL.");
       if(s.startsWith("ftp"))
           System.out.println("TYPE OF PROTOCOL:FILE TRANSFER PROTOCOL.");
       if(s.endsWith("com"))
           System.out.println("TYPE OF WEBSITE:COMMERCIAL WEBSITE.");
       if(s.endsWith("org"))
           System.out.println("TYPE OF WEBSITE:ORGANISATION WEBSITE.");
       if(s.endsWith("net"))
           System.out.println("TYPE F WEBSITE: NETWORK BASED WEBSITE.");
    }
    
}
