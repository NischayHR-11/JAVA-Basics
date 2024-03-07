import java.util.Scanner;
public class ProblemSolving13 {
    public static void main(String[] args) {
        // number of digits;

       System.out.println("ENTER THE NUMBER:");
       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();int n2=0;
       while(n!=0){
           n=n/10;
           n2++;
       }
       System.out.println("NUMBER OF DIGITS IN NUMBER:"+n2);

// armstrong number;

       System.out.println("ENTER THE NUMBER:");
        n=sc.nextInt();int n1=n;int s=0;int p;
       while(n!=0){
           p=n%10;
           s=s+p*p*p;
           n=n/10;
       }
       if(n1==s)
           System.out.println("IT IS A ARMSTRONG NUMBER.");
       else
           System.out.println("IT IS NOT A ARMSTRONG NUMBER.");
    }
    
}
