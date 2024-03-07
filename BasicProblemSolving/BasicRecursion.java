import java.util.Scanner;
public class BasicRecursion {
    
    public static int fib(int n) {
        if(n==1 )
            return 1;
        if(n==0)
            return 0;
    return fib(n-1) +fib(n-2) ;
    }

    public static void rev(String a,int n){
        if(n==0)
            return;
        System.out.print(a.charAt(n-1));
        rev(a,n-1);
    }

    static boolean prime(int n) {
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }

    static int hcf(int x, int y) {
        while (x != y) {
            if (x > y)
                x = x - y;
            else
                y = y - x;
        }
        return x;
    }

    static int max(int a[]) {
        int max = 0;
        for (int i = 0; i < a.length; i++) {
            max = Math.max(max, a[i]);
        }
        return max;
    }

    public static void sor(int a[],int n){
        if((n-1)==0){
            System.out.println("given array is sorted array .");
            return;
        }
        if(a[n-1]<=a[n-2]){
            System.out.println("given array is not sorted .");
            return;
        }
        sor(a,n-1);
    }
    public static void main(String[] args) {
        
// prime or not by method call;

       Scanner sc=new Scanner(System.in);
       System.out.println("ENTER THE NUMBER:");
       int n=sc.nextInt();
       System.out.println(prime(n));

//greatest common factor or highest common factor (HCF);

       System.out.println("ENTER TWO NUMBERS TO FIND HCF:");
       int x=sc.nextInt(),y=sc.nextInt();
       System.out.println("HCF or GCF OF "+x+" and "+y+" :"+hcf(x,y));

// maximum element in array by method call;

       int a[]={1,2,3,4,5,6,7};
       System.out.println("MAXIMUM ELEMENT IN A GIVEN ARRAY :"+max(a));
    }
    
}
