import java.util.Scanner;
public class ProblemSolving16 {
    public static void main(String[] args) {
        //ap series;

       System.out.println("ENTER THE 1ST TERM ,COMMON DIFFERENCE AND NO OF TERMS REQUIRED FOR AP SERIES");
       Scanner sc=new Scanner(System.in);
       int a=sc.nextInt(),d=sc.nextInt(),n=sc.nextInt();
       System.out.print("AP SERIES :");
       int n1=a;
       for(int i=1;i<n;i++){
           System.out.print(n1+",");
           n1=n1+d;
       }

//go series;

       System.out.println("ENTER THE 1ST TERM ,COMMON RATIO AND NO OF TERMS REQUIRED FOR GP SERIES");
       a=sc.nextInt();int r=sc.nextInt();n=sc.nextInt();
       System.out.print("GP SERIES :");
       int t=a;
       for(int i=0;i<n;i++){
           System.out.print(t+",");
           t=t*r;
       }

//fibonacci series;

       System.out.println("ENTER THE NUMBER :");
        n=sc.nextInt();
       int f=0/*0th term*/;int s=1;int t1;
       System.out.print("FIBONACCI SERIES : "+f+","+s+",");
       for(int i=2;i<n;i++){
           t1=f+s;
           System.out.print(t1+",");
           f=s;
           s=t1;
       }

    }
    
}
