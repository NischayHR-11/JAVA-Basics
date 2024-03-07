//BIT OPERATIONS

public class ProblemSolving1 {
    public static void main(String[] args) {

        int x = 0b1010, y = 0b0010;
        System.out.println("BEFORE SWAPPING : X :" + x + " ,Y:" + y);

        //SWAPPING BITWISE;
        
        x = x ^ y;
        y = x ^ y;
        x = x ^ y;
        System.out.println("AFTER SWAPPING : X :" + x + " ,Y:" + y);

        //storing 2 numbers in one byte;

        byte a = 9, b = 12;
        byte c;
        c = (byte) (a << 4);
        c = (byte) (c | b);
        System.out.println("merged:" + c);
    }
    
}
