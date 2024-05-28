/*
 * Write a while loop that prints out pairs of numbers that show n and 2n as long as n is 
less than 30
(You don't need to use any predefined function for this, just consider using an 
appropriate operator)
 */
public class LoopingTwo {
    public static void main(String[] args) {
        int n = 0;
        while (n < 30) {
            System.out.println("n = " + n);
            System.out.println("2n = " + (2 * n));
            n += 10;
        }
    }
}
