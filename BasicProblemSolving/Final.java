public class Final {
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
        static boolean valid(String s) {
        if (s.matches("[0-9!@#$%^&*()_]+"))
            return false;
        else
            return true;
        }
        static boolean valid(int n){
        if(n>=3&&n<=15)
            return true;
        return false;
        }
        static int max1(int...n){
            int high=0;
            for(int x:n){
                high=Math.max(high,x);
            }
          return high;
        }
    static int sum(int...n){
        int high=0;
        for(int x:n){
            high=high+x;
        }
        return high;
    }
    static float dis(float...n){
        float high=0;
        for(float x:n){
            high=high+x;
        }
        if(high>=500)
            high=high-high*0.01f;
        else if(high>=1000)
            high=high-high*0.02f;
        return high;
        }
        static double str(String ...s){
            double sum=0;
            for(String x:s){
                if(x.matches("[^0-9\\.]*"))
                    continue;
                sum=sum +Double.parseDouble(x);
            }
            return sum;
        }


        public static void main(String[]args){

//
//            int x = 0b1010, y = 0b0010;
//            System.out.println("BEFORE SWAPPING : X :" + x + " ,Y:" + y);
//            //SWAPPING BITWISE;
//            x = x ^ y;
//            y = x ^ y;
//            x = x ^ y;
//            System.out.println("AFTER SWAPPING : X :" + x + " ,Y:" + y);
//
//            //storing 2 numbers in one byte;
//
//            byte a = 9, b = 12;
//            byte c;
//            c = (byte) (a << 4);
//            c = (byte) (c | b);
//            System.out.println("merged:" + c);

//task1;

//        String s;
//        Scanner sc=new Scanner(System.in);
//        System.out.println("ENTER THE ID :");
//        s=sc.next();
//        int n=s.indexOf('@');
//        if(s.contains("gamil"))
//            System.out.println("THE EMAIL ID IS ON GMAIL.");
//        System.out.println("USER NAME :"+s.substring(0,n));
//        System.out.println("DOMAIN NAME:"+s.substring(n+1));

//task2 ;

//
//          String s1="11/12/2004";int b=100101011;
//          String s=String.valueOf(b);
//          if(s.matches("[01]+"))
//              System.out.println("IT IS A BINARY NUMBER.");
//          if(s.matches("[0-9A-F]+"))
//              System.out.println("IT IS A HEXADECIMAL VALUE.");
//          if(s1.matches("[0-3][0-9]/[01][0-9]/[0-9]{4}"))
//              System.out.println("IT IS A DATE.");

            //task 3;

//            String s="a!b@c#1$2%3&";
//        System.out.println("SPECIAL CHARACTERS REMOVED STRING IS :"+s.replaceAll("[^a-zA-Z0-9]",""));
//        String s1="    abc     def  ghi   klm     ";
//     System.out.println("EXTRA SPACES REMOVED STRING :"+s1.replaceAll("\\s+"," ").trim());
//        //separate;
//       s1= s1.replaceAll("\\s+"," ").trim();
//        String s2[]=s1.split(" ");
//        System.out.println("NUMBER OF WORDS :"+s2.length);

//new task;

//        Scanner sc=new Scanner(System.in);
//        System.out.println("ENTER THE NUMBER :");
//        int n=sc.nextInt();
//        if(n%2==0)
//            System.out.println("NUMBER IS EVEN.");
//        else
//            System.out.println("NUMBER IS ODD.");
//        System.out.println("ENTER YOUR AGE:");
//        int a=sc.nextInt();
//        if(a>=18)
//            System.out.println("YOU ARE NOT YOUNG.");
//        else
//            System.out.println("YOU ARE YOUNG STILL.");
//        System.out.println("ENTER YOUR 3 SUBJECT MARKS :");
//        int m1=sc.nextInt(),m2=sc.nextInt(),m3=sc.nextInt();
//        int m=(m1+m2+m3)/3;
//        if(m>=90)
//            System.out.println("A+");
//        else if (m>=75 && m<90)
//            System.out.println("A");
//        else if (m>=50 && m<75)
//            System.out.println("B");
//        else if (m>=35 && m<50 )
//            System.out.println("C");
//        else
//            System.out.println("FAIL");

//task;

//        System.out.println("ENTER THE NUMBER :");
//        Scanner sc=new Scanner(System.in);
//        String s=sc.next();
//        if(s.matches("[01]+"))
//            System.out.println("IT IS A BINARY NUMBER .");
//        if (s.matches("[0-7]+"))
//            System.out.println("IT IS A HEXA DECIMAL NUMBER.");
//        if(s.matches("[0-9A-F]+"))
//            System.out.println("IT IS OCTA DECIMAL NUMBER.");
//        if(s.matches("[0-9]+"))
//            System.out.println("IT IS A DECIMAL NUMBER.");

//leap year

//        System.out.println("ENTER THE YEAR:");
//        Scanner sc=new Scanner (System.in);
//        int n=sc.nextInt();
//        if(n%4==0){
//            if(n%100==0){
//                if(n%400==0){
//                    System.out.println("IT IS A LEAP YEAR.");
//                }else{
//                    System.out.println("IT IS NOT A LEAP YEAR.");
//                }
//
//            }else{
//                System.out.println("IT IS A LEAP YEAR.");
//            }
//
//        }else{
//            System.out.println("IT IS NOT A LEAP YEAR.");
//        }

// type and protocol of website;

//        System.out.println("ENTER A URL:");
//        Scanner sc=new Scanner(System.in);
//        String s=sc.nextLine();
//        if(s.startsWith("http"))
//            System.out.println("TYPE OF PROTOCOL :HYPER TEXT TRANSFER PROTOCOL.");
//        if(s.startsWith("ftp"))
//            System.out.println("TYPE OF PROTOCOL:FILE TRANSFER PROTOCOL.");
//        if(s.endsWith("com"))
//            System.out.println("TYPE OF WEBSITE:COMMERCIAL WEBSITE.");
//        if(s.endsWith("org"))
//            System.out.println("TYPE OF WEBSITE:ORGANISATION WEBSITE.");
//        if(s.endsWith("net"))
//            System.out.println("TYPE F WEBSITE: NETWORK BASED WEBSITE.");

// switch case;

//        System.out.println("ENTER THE URL :");
//        Scanner sc=new Scanner(System.in);
//        String s=sc.nextLine();
//        s=s.substring(s.lastIndexOf(".")+1);
//        switch (s){
//            case "com":
//                System.out.println("COMMERCIAL WEBSITE.");
//                break;
//            case "org":
//                System.out.println("ORGANISATION WEBSITE.");
//                break;
//            case "net":
//                System.out.println("NETWORK WEBSITE.");
//                break;
//            case "gov":
//                System.out.println("GOVERNMENT WEBSITE.");
//                break;
//            default:
//                System.out.println("INVALID WEBSITE.");
//        }

// task;

//        System.out.println("MENU:");
//        System.out.println("1.ADD");
//        System.out.println("2.SUBTRACT");
//        System.out.println("3.MULTIPLY");
//        System.out.println("4.DIVIDE");
//        Scanner sc=new Scanner(System.in);
//        System.out.println("ENTER TWO NUMBERS:");
//        int n,m;String s;
//        n=sc.nextInt();m= sc.nextInt();
//        System.out.println("ENTER THE CHOICE IN WORDS:");
//        s=sc.nextLine();//because enter is taken as input;
//        s=sc.nextLine();
//        switch (s){
//            case "ADD":
//                System.out.println("SUM OF TWO NUMBERS :"+(n+m));
//                break;
//            case "SUBTRACT":
//                System.out.println("DIFFERENCE OF TWO NUMBERS :"+(n-m));
//                break;
//            case "MULTIPLY":
//                System.out.println("PRODUCT OF TWO NUMBERS :"+(n*m));
//                break;
//            case "DIVIDE":
//                System.out.println("DIVISION OF TWO NUMBERS :"+(n/m));
//                break;
//            default:
//                System.out.println("INVALID ENTER.");
//        }

//table

//        System.out.println("ENTER THE NUMBER:");
//        Scanner sc=new Scanner(System.in);
//        int n=sc.nextInt();
//        for(int i=1;i<=10;i++){
//            System.out.println(n*i);
//        }

//sum;

//        System.out.println("ENTER THE NUMBER:");
//       Scanner sc=new Scanner(System.in);
//        int n=sc.nextInt();
//        int s=0;
//        for(int i=1;i<=n;i++){
//            s=s+i;
//        }
//        System.out.println("SUM:"+s);

// factorial;

//      System.out.println("ENTER THE NUMBER:");
//      Scanner sc=new Scanner(System.in);
//      int n=sc.nextInt();
//      long s=1;
//      for(int i=1;i<=n;i++){
//          s=s*i;
//      }
//        System.out.println("FACTORIAL :"+s);

//display digit or *reversing number*;

//      System.out.println("ENTER THE NUMBER:");
//      Scanner sc=new Scanner(System.in);
//      int n=sc.nextInt();int p;
//        while(n!=0){
//            p=n%10;
//            System.out.print(p);
//            n=n/10;
//        }

//sum  of the digits;
//
//        System.out.println("ENTER THE NUMBER:");
//        Scanner sc=new Scanner(System.in);
//        int n=sc.nextInt();int n1=0;
//        while(n!=0){
//            n1=n1+n%10;
//            n=n/10;
//        }
//        System.out.println("SUM:"+n1);

// number of digits;

//        System.out.println("ENTER THE NUMBER:");
//        Scanner sc=new Scanner(System.in);
//        int n=sc.nextInt();int n1=0;
//        while(n!=0){
//            n=n/10;
//            n1++;
//        }
//        System.out.println("NUMBER OF DIGITS IN NUMBER:"+n1);

// armstrong number;

//        System.out.println("ENTER THE NUMBER:");
//        Scanner sc=new Scanner(System.in);
//        int n=sc.nextInt();int n1=n;int s=0;int p;
//        while(n!=0){
//            p=n%10;
//            s=s+p*p*p;
//            n=n/10;
//        }
//        if(n1==s)
//            System.out.println("IT IS A ARMSTRONG NUMBER.");
//        else
//            System.out.println("IT IS NOT A ARMSTRONG NUMBER.");

// reversing the number;

//        System.out.println("ENTER THE NUMBER:");
//        Scanner sc=new Scanner(System.in);
//        int n=sc.nextInt();int s=0;int r;
//        while(n!=0){
//            r=n%10;
//            s=10*s+r;
//            n=n/10;
//        }
//        System.out.println("REVERSED NUMBER :"+s);

            //palindrome number;

//        System.out.println("ENTER THE NUMBER:");
//        Scanner sc=new Scanner(System.in);
//        int n=sc.nextInt();int n1=n;int s=0;int r;
//        while(n!=0){
//            r=n%10;
//            s=10*s+r;
//            n=n/10;
//        }
//        if(n1==s)
//        System.out.println("IT IS A PALINDROME NUMBER.");
//        else
//            System.out.println("IT IS NOT A PALINDROME NUMBER.");

// number in words;
//
//        System.out.println("ENTER THE NUMBER:");
//        Scanner sc=new Scanner(System.in);
//        String s=sc.next();String s1="";
//        for(int i=0;i<s.length();i++){
//            char n1=s.charAt(i);
//            switch (n1){
//                case '0':
//                    s1=s1+"ZERO ";
//                    break;
//                case '1':
//                    s1=s1+"ONE ";
//                    break;
//                case '2':
//                    s1=s1+"TWO ";
//                    break;
//                case '3':
//                    s1=s1+"THREE ";
//                    break;
//                case '4':
//                    s1=s1+"FOUR ";
//                    break;
//                case '5':
//                    s1=s1+"FIVE ";
//                    break;
//                case '6':
//                    s1=s1+"SIX ";
//                    break;
//                case '7':
//                    s1=s1+"SEVEN ";
//                    break;
//                case '8':
//                    s1=s1+"EIGHT ";
//                    break;
//                case '9':
//                    s1=s1+"NINE ";
//                    break;
//            }
//        }
//        System.out.println(s1);

//ap series;

//        System.out.println("ENTER THE 1ST TERM ,COMMON DIFFERENCE AND NO OF TERMS REQUIRED FOR AP SERIES");
//        Scanner sc=new Scanner(System.in);
//        int a=sc.nextInt(),d=sc.nextInt(),n=sc.nextInt();
//        System.out.print("AP SERIES :");
//        int n1=a;
//        for(int i=1;i<n;i++){
//            System.out.print(n1+",");
//            n1=n1+d;
//        }

//go series;
//
//        System.out.println("ENTER THE 1ST TERM ,COMMON RATIO AND NO OF TERMS REQUIRED FOR GP SERIES");
//        Scanner sc=new Scanner(System.in);
//        int a=sc.nextInt(),r=sc.nextInt(),n=sc.nextInt();
//        System.out.print("GP SERIES :");
//        int t=a;
//        for(int i=0;i<n;i++){
//            System.out.print(t+",");
//            t=t*r;
//        }

//fibonacci series;
//
//        System.out.println("ENTER THE NUMBER :");
//        Scanner sc=new Scanner(System.in);
//        int n=sc.nextInt();
//        int f=0/*0th term*/;int s=1;int t;
//        System.out.print("FIBONACCI SERIES : "+f+","+s+",");
//        for(int i=2;i<n;i++){
//            t=f+s;
//            System.out.print(t+",");
//            f=s;
//            s=t;
//        }

//patterns;
//
//        int r=5,c=5;int n=4;
//        for(int i=1;i<=n;i++){
//            for(int j=1;j<=n-i;j++) {
//                System.out.print(" ");
//            }
//            for(int j=1;j<=i;j++){
//                System.out.print("*");
//            }
//            for(int j=2;j<=i;j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//        for(int i=n-1;i>=1;i--){
//            for(int j=1;j<=n-i;j++) {
//                System.out.print(" ");
//            }
//            for(int j=1;j<=i;j++){
//                System.out.print("*");
//            }
//            for(int j=2;j<=i;j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }

//easy way to print array;

//            int a[]={1,2,3,4,5};
//            for(int x:a) {
//                System.out.print(x + " ");
//            }

//array;
//
//        int a[]={3,9,7,8,12,6,15,5,4,10};int sum=0;
//        for(int x:a){
//            sum=sum+x;
//        }
//        System.out.println("SUM:"+sum);

//search;

//        int a[]={3,9,7,8,12,6,15,5,4,10};int s=12;
//        for(int i=0;i<a.length;i++){
//            if(a[i]==s)
//                System.out.println("ELEMENT FOUND AT INDEX :"+i);
//            System.exit(0);
//        }
//        System.out.println("ELEMENT NOT FOUND.");

//maximum element;
//
//        int a[]={3,9,7,8,12,6,15,5,4,10};int s=12;
//        int h=0;
//        for(int i=0;i<a.length;i++){
//           h= Math.max(h,a[i]);
//        }
//        System.out.println("MAXIMUM ELEMENT:"+h);

//left rotation array;

//        int a[]={3,9,7,8,12,6,15,5,4,10};int s=12;
//        int t=a[0];
//        for(int i=0;i<a.length-1;i++){
//            a[i]=a[i+1];
//        }
//        a[a.length-1]=t;
//        for(int x:a)
//            System.out.print(x+",");

//right rotation of array;
//
//        int a[]={3,9,7,8,12,6,15,5,4,10};int s=12;
//        int t=a[a.length-1];
//        for(int i=a.length-1;i>0;i--){
//            a[i]=a[i-1];
//        }
//        a[0]=t;
//        for(int x:a)
//            System.out.print(x+",");

//inserting element;

//        int a[]=new int[10];
//        for(int i=0;i<6;i++){
//            a[i]=i;
//        }
//        int ins=15;int ind=2;
//        for(int i=6;i>=2;i--){
//            a[i+1]=a[i];
//        }
//        a[2]=15;
//        for(int x:a)
//            System.out.print(x+",");

//deleting array ;
//
//        int a[]=new int[10];
//        for(int i=0;i<6;i++){
//            a[i]=i;
//        }
//        int ind=2;a[2]=0;
//        for(int i=2;i<6;i++) {
//            a[i] = a[i + 1];
//        }
//        for(int x:a)
//            System.out.print(x+",");

//reverse and copying;

//        int a[]={1,2,3,4,5,6};
//        int b[]=new int [6];
//        for(int i=0;i<a.length;i++){
//            b[i]=a[a.length-i-1];
//        }
//        for(int x:b)
//            System.out.print(x+",");

// increasing array length;

//        int a[]={1,2,3,4,5};
//        int b[]=new int [2*a.length];
//        for(int i=0;i<a.length;i++){
//            b[i]=a[i];
//        }
//        a=b;
//        b=null;
//        for(int x:a)
//            System.out.print(x+",");

// 2d array easy to print;****


//        int a[][]={{1,2,3},{2,4,6},{1,3,5}};
//        for(int x[]:a){
//            for(int y:x){
//                System.out.print(y+" ");
//            }
//            System.out.println();
//        }

//jagged 2d array;***

//        int a[][];
//        a=new int [3][];
//        a[0]=new int[5];
//        a[1]=new int[3];
//        a[2]=new int[8];
//
//        for(int x[]:a){
//            for(int y:x){
//                System.out.print(y+" ");
//            }
//            System.out.println();
//        }

// addition of two matrix;

//        int a[][]={{1,2,3},{2,3,4},{5,6,7}};
//        int b[][]={{1,2,3},{2,3,4},{5,6,7}};
//        int c[][]=new int[3][3];
//        for(int i=0;i<3;i++){
//            for(int j=0;j<3;j++){
//                c[i][j]=a[i][j]+b[i][j];
//            }
//        }
//        for(int x[]:c){
//            for(int y:x){
//                System.out.format("%02d ",y);
//            }
//            System.out.println();
//        }

// multiplication of matrix;

//        int a[][]={{3,5,9},{7,6,2},{4,3,5}};
//        int b[][]={{1,0,0},{0,1,0},{0,0,1}};
//        int c[][]=new int[3][3];
//        for(int i=0;i<3;i++){
//            for(int j=0;j<3;j++){
//                int sum=0;
//                for(int k=0;k<3;k++){
//                    sum=sum+a[i][k]*b[k][j];
//                }
//                c[i][j]=sum;
//            }
//        }
//        for(int x[]:c){
//            for(int y:x){
//                System.out.print(y+" ");
//            }
//            System.out.println();
//        }

// prime or not by method call;

//        Scanner sc=new Scanner(System.in);
//        System.out.println("ENTER THE NUMBER:");
//        int n=sc.nextInt();
//        System.out.println(prime(n));

//greatest common factor or highest common factor (HCF);

//        System.out.println("ENTER TWO NUMBERS TO FIND HCF:");
//        Scanner sc=new Scanner(System.in);
//        int x=sc.nextInt(),y=sc.nextInt();
//        System.out.println("HCF or GCF OF "+x+" and "+y+" :"+hcf(x,y));

// maximum element in array by method call;

//        int a[]={1,2,3,4,5,6,7};
//        System.out.println("MAXIMUM ELEMENT IN A GIVEN ARRAY :"+max(a));

// valid name and age method over load;
//
//            System.out.println("ENTER THE NAME or AGE:");
//            Scanner sc = new Scanner(System.in);
//            int n=sc.nextInt();
////            String s = sc.nextLine();
//            System.out.println(valid(n));

// maximum parameter by variable parameters ;

//            System.out.println("VARIABLE ARGUMENTS:");
//            System.out.println("MAXIMUM PARAMETER:"+max(9,2,3,4,5,6,7));

// sum of parameters by variable parameter method;

//            System.out.println("VARIABLE ARGUMENTS:");
//            System.out.println("SUM OF PARAMETERS :"+sum(1,2,3,4,5,6,7,8,9,10));
//

//  total amount with discount by variable parameter method;

//            System.out.println("VARIABLE ARGUMENTS:");
//            System.out.println("TOTAL AMOUNT WITH DISCOUNT :"+dis(100,300,100,600));\

// sum of the numbers given in String;

//            System.out.println("VARIABLE ARGUMENTS:");
//            System.out.println("SUM :"+str("123","456","7","890","450","ak"));


        }
    }

