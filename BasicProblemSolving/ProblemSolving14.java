import java.util.Scanner;
public class ProblemSolving14 {
    public static void main(String[] args) {
        // reversing the number;

       System.out.println("ENTER THE NUMBER:");
       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();int s1=0;int r1;
       while(n!=0){
           r1=n%10;
           s1=10*s1+r1;
           n=n/10;
       }
       System.out.println("REVERSED NUMBER :"+s1);

            //palindrome number;

       System.out.println("ENTER THE NUMBER:");
        n=sc.nextInt();int n1=n;int s=0;int r;
       while(n!=0){
           r=n%10;
           s=10*s+r;
           n=n/10;
       }
       if(n1==s)
       System.out.println("IT IS A PALINDROME NUMBER.");
       else
           System.out.println("IT IS NOT A PALINDROME NUMBER.");
    }
    
}
