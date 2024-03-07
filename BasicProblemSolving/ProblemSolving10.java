import java.util.Scanner;
public class ProblemSolving10 {
    public static void main(String[] args) {
        
       System.out.println("MENU:");
       System.out.println("1.ADD");
       System.out.println("2.SUBTRACT");
       System.out.println("3.MULTIPLY");
       System.out.println("4.DIVIDE");
       Scanner sc=new Scanner(System.in);
       System.out.println("ENTER TWO NUMBERS:");
       int n,m;String s;
       n=sc.nextInt();m= sc.nextInt();
       System.out.println("ENTER THE CHOICE IN WORDS:");
       s=sc.nextLine();//because enter is taken as input;
       s=sc.nextLine();
       switch (s){
           case "ADD":
               System.out.println("SUM OF TWO NUMBERS :"+(n+m));
               break;
           case "SUBTRACT":
               System.out.println("DIFFERENCE OF TWO NUMBERS :"+(n-m));
               break;
           case "MULTIPLY":
               System.out.println("PRODUCT OF TWO NUMBERS :"+(n*m));
               break;
           case "DIVIDE":
               System.out.println("DIVISION OF TWO NUMBERS :"+(n/m));
               break;
           default:
               System.out.println("INVALID ENTER.");
       }
    }
    
}
