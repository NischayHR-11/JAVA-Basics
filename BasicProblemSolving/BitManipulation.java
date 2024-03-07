public class BitManipulation {
    public static void main(String[] args) {
        
        //------------------------------------- BIT MANIPULATION -------------------------------

        // BIT MASK = 1<<i(position of bit);           { position+1 = nth bit }

        // 1.GET BIT      { used to check which bit is present in that position }       ( AND operator )
        // 2.SET BIT      { used to change (or) set the bit into 1 in that position }   ( OR operator )
        // 3.CLEAR BIT    { used to change (or) set the bit into 0 in that position }   ( NOT(bit mask),AND operator )
        // 4.UPDATE BIT   { used to change the bit from 1 to 0 (or) vise versa }            ( set bit,clear bit )

        //------------------------ GET BIT ---------------------------

//        int n,pos;
//        System.out.println("ENTER THE NUMBER :");
//        Scanner sc=new Scanner(System.in);
//        n=sc.nextInt();
//        System.out.println("ENTER THE POSITION :");
//        pos=sc.nextInt();
//        int bitmask=1<<pos;
//        int NewNumber=bitmask & n;
//        if(NewNumber==0)
//            System.out.println("BIT IS : 0");
//        else
//            System.out.println("BIT IS : 1");

        //------------------------- SET BIT --------------------------


//        int n,pos;
//        System.out.println("ENTER THE NUMBER :");
//        Scanner sc=new Scanner(System.in);
//        n=sc.nextInt();
//        System.out.println("ENTER THE POSITION :");
//        pos=sc.nextInt();
//        int bitmask=1<<pos;
//        int NewNumber=bitmask | n;
//        System.out.println("NEW NUMBER :"+NewNumber);

        //--------------------------- CLEAR BIT ----------------------


//        int n,pos;
//        System.out.println("ENTER THE NUMBER :");
//        Scanner sc=new Scanner(System.in);
//        n=sc.nextInt();
//        System.out.println("ENTER THE POSITION :");
//        pos=sc.nextInt();
//        int bitmask=1<<pos;
//        int newbitmask=~bitmask;
//        int NewNumber=newbitmask & n;
//        System.out.println("NEW NUMBER :"+NewNumber);

        //--------------------------- UPDATE BIT -------------------------
//
//        int n,pos,ch,k;
//        System.out.println("ENTER THE NUMBER :");
//        Scanner sc=new Scanner(System.in);
//        n=sc.nextInt();
//        System.out.println("ENTER THE POSITION :");
//        pos=sc.nextInt();
//        int bitmask=1<<pos;
//        int newbitmask=~bitmask;
//        int NewNumber=bitmask & n;
//        if(NewNumber==0) {
//            k = bitmask | n;
//        }
//        else {
//            k =newbitmask &n ;
//        }
//        System.out.println("NEW NUMBER :"+ k );

        //----------------------------------------------------------------------------

    }
}
