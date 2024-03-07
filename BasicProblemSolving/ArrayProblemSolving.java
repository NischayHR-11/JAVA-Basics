public class ArrayProblemSolving {
    public static void main(String[] args) {
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
    }
    
}
