import java.util.Scanner;
public class ProblemSolving9 {
    public static void main(String[] args) {
        // switch case;

       System.out.println("ENTER THE URL :");
       Scanner sc=new Scanner(System.in);
       String s=sc.nextLine();
       s=s.substring(s.lastIndexOf(".")+1);
       switch (s){
           case "com":
               System.out.println("COMMERCIAL WEBSITE.");
               break;
           case "org":
               System.out.println("ORGANISATION WEBSITE.");
               break;
           case "net":
               System.out.println("NETWORK WEBSITE.");
               break;
           case "gov":
               System.out.println("GOVERNMENT WEBSITE.");
               break;
           default:
               System.out.println("INVALID WEBSITE.");
       }
    }
    
}
