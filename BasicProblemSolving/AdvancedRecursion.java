public class AdvancedRecursion {
    public static boolean a[]=new boolean[26];
    public static void last(String p,int n,String q,int count) {
        if(n==p.length()){
            for(int i=0;i<count;i++){
                q=q+'X';
            }
            System.out.print(q);
            return;
        }
        if(p.charAt(n)=='X'||p.charAt(n)=='x'){
            count++;
        }else{
            q=q+p.charAt(n);
        }
        last(p,n+1,q,count);

    }
    public static void dup(String q,int n,String news) {
        if(n==q.length()){
            System.out.print(news);
            return;
        }
        char current=q.charAt(n);
        if (a[q.charAt(n)-'a']==true){
            dup(q,n+1,news);
        }else{
            a[q.charAt(n)-'a']=true;
            dup(q,n+1,news+current);
        }
    }
    public static void subsequence(String q,int n,String news) {
        if(n==q.length()){
            System.out.println(news);
            return;
        }
        subsequence(q,n+1,news+q.charAt(n));
        subsequence(q,n+1,news);
    }

    public static void tower(String a,String b,String c,int n) {
        if(n==1){
            System.out.println("TRANSFER DISC "+n+" FROM "+a+" TO "+c);
            return;
        }
        tower(a,c,b,n-1);
        System.out.println("TRANSFER DISC "+n+" FROM "+a+" TO "+c);
        tower(b,a,c,n-1);
    }

    public static void main(String[] args) {
        //1st

//        System.out.println("enter the string :");
//        Scanner sc=new Scanner (System.in);
//        int count =0;String s="";
//       String k=sc.next();
//       System.out.println("New String :");
//       last(k,0,s,count);

       //2nd
//
//        System.out.println("enter the string :");
//        Scanner sc=new Scanner (System.in);
//        String k=sc.next();
//        System.out.println("New String :");
//        subsequence(k,0,"");

        //3rd
//        System.out.println("ENTER THE NAME OF THE TOWERS :");
//        String a,b,c;int n;
//        Scanner sc=new Scanner(System.in);
//        a=sc.nextLine();b=sc.nextLine();c=sc.nextLine();
//        System.out.println("ENTER TOTAL NUMBER OF DISCS :");
//        n=sc.nextInt();
//        tower(a,b,c,n);
    }
}
