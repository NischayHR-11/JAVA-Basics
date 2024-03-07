import java.util.Scanner;
public class ProblemSolving12 {
    public static void main(String[] args) {
        //display digit or *reversing number*;

     System.out.println("ENTER THE NUMBER:");
     Scanner sc=new Scanner(System.in);
     int n=sc.nextInt();int p;
       while(n!=0){
           p=n%10;
           System.out.print(p);
           n=n/10;
       }

//sum  of the digits;

       System.out.println("ENTER THE NUMBER:");
        n=sc.nextInt();int n1=0;
       while(n!=0){
           n1=n1+n%10;
           n=n/10;
       }
       System.out.println("SUM:"+n1);
    }
    
}
