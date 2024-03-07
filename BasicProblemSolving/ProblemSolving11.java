import java.util.Scanner;
public class ProblemSolving11 {
    public static void main(String[] args) {
       // table

       System.out.println("ENTER THE NUMBER:");
       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       for(int i=1;i<=10;i++){
           System.out.println(n*i);
       }

//sum;

       System.out.println("ENTER THE NUMBER:");
       int n1=sc.nextInt();
       int s=0;
       for(int i=1;i<=n1;i++){
           s=s+i;
       }
       System.out.println("SUM:"+s);

//factorial;

     System.out.println("ENTER THE NUMBER:");
     int n2=sc.nextInt();
     long s1=1;
     for(int i=1;i<=n2;i++){
         s1=s1*i;
     }
       System.out.println("FACTORIAL :"+s1);
    }
    
}
