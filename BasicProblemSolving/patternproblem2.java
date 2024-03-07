import java.util.Scanner;

public class patternproblem2 {
    public static void main(String[] args) {
                System.out.print("ENTER THE NUMBER :");
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int count=1;
      for(int i=1;i<=n;i++){
           for(int j=1;j<=i;j++){
              System.out.print("*");
            }
            for(int j=1;j<=2*(n-i);j++){
                System.out.print(" ");
            }
          for(int j=1;j<=i;j++){
              System.out.print("*");
          }
      //5
        System.out.println();
      }
        for(int i=n;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            for(int j=1;j<=2*(n-i);j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            //5
            System.out.println();
        }
    }
}
