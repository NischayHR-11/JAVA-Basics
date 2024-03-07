import java.util.Scanner;

public class ProblemSolving3 {
    public static void main(String[] args) {
        
         String s1="11/12/2004";int b=100101011;
         String s=String.valueOf(b);
         if(s.matches("[01]+"))
             System.out.println("IT IS A BINARY NUMBER.");
         if(s.matches("[0-9A-F]+"))
             System.out.println("IT IS A HEXADECIMAL VALUE.");
         if(s1.matches("[0-3][0-9]/[01][0-9]/[0-9]{4}"))
             System.out.println("IT IS A DATE.");
    }
    
}
