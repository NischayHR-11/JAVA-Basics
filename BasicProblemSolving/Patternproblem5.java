import java.util.Scanner;

public class Patternproblem5 {
    public static void main(String[] args) {
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER THE NUBER :");
        n=sc.nextInt();

        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(" ");
            }
            for(int k=n;k>=i;k--){
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i=n;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print(" ");
            }
            for(int k=n;k>=i;k--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    
}
