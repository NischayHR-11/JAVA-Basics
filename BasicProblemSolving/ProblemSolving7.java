import java.util.Scanner;
public class ProblemSolving7 {
    public static void main(String[] args) {
        
       System.out.println("ENTER THE YEAR:");
       Scanner sc=new Scanner (System.in);
       int n=sc.nextInt();
       if(n%4==0){
           if(n%100==0){
               if(n%400==0){
                   System.out.println("IT IS A LEAP YEAR.");
               }else{
                   System.out.println("IT IS NOT A LEAP YEAR.");
               }

           }else{
               System.out.println("IT IS A LEAP YEAR.");
           }

       }else{
           System.out.println("IT IS NOT A LEAP YEAR.");
       }
    }
}
