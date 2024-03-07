import java.util.Scanner;
public class ProblemSolving5 {
    public static void main(String[] args) {

       Scanner sc=new Scanner(System.in);
       System.out.println("ENTER THE NUMBER :");
       int n=sc.nextInt();
       if(n%2==0)
           System.out.println("NUMBER IS EVEN.");
       else
           System.out.println("NUMBER IS ODD.");
       System.out.println("ENTER YOUR AGE:");
       int a=sc.nextInt();
       if(a>=18)
           System.out.println("YOU ARE NOT YOUNG.");
       else
           System.out.println("YOU ARE YOUNG STILL.");
       System.out.println("ENTER YOUR 3 SUBJECT MARKS :");
       int m1=sc.nextInt(),m2=sc.nextInt(),m3=sc.nextInt();
       int m=(m1+m2+m3)/3;
       if(m>=90)
           System.out.println("A+");
       else if (m>=75 && m<90)
           System.out.println("A");
       else if (m>=50 && m<75)
           System.out.println("B");
       else if (m>=35 && m<50 )
           System.out.println("C");
       else
           System.out.println("FAIL");
    }
    
}
