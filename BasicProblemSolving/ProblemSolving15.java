import java.util.Scanner;
public class ProblemSolving15 {
    public static void main(String[] args) {
        // number in words;

       System.out.println("ENTER THE NUMBER:");
       Scanner sc=new Scanner(System.in);
       String s=sc.next();String s1="";
       for(int i=0;i<s.length();i++){
           char n1=s.charAt(i);
           switch (n1){
               case '0':
                   s1=s1+"ZERO ";
                   break;
               case '1':
                   s1=s1+"ONE ";
                   break;
               case '2':
                   s1=s1+"TWO ";
                   break;
               case '3':
                   s1=s1+"THREE ";
                   break;
               case '4':
                   s1=s1+"FOUR ";
                   break;
               case '5':
                   s1=s1+"FIVE ";
                   break;
               case '6':
                   s1=s1+"SIX ";
                   break;
               case '7':
                   s1=s1+"SEVEN ";
                   break;
               case '8':
                   s1=s1+"EIGHT ";
                   break;
               case '9':
                   s1=s1+"NINE ";
                   break;
           }
       }
       System.out.println(s1);
    }
    
}
