import java.util.Scanner;

public class ProblemSolving6 {
    public static void main(String[] args) {
       System.out.println("ENTER THE NUMBER :");
       Scanner sc=new Scanner(System.in);
       String s=sc.next();
       if(s.matches("[01]+"))
           System.out.println("IT IS A BINARY NUMBER .");
       if (s.matches("[0-7]+"))
           System.out.println("IT IS A HEXA DECIMAL NUMBER.");
       if(s.matches("[0-9A-F]+"))
           System.out.println("IT IS OCTA DECIMAL NUMBER.");
       if(s.matches("[0-9]+"))
           System.out.println("IT IS A DECIMAL NUMBER.");
    }
    
}
