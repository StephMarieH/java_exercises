/*
 * Write a while loop that prints out pairs of numbers that show the current value of n and the 
value of n + 30 as long as n is less than 10.
 */

public class LoopingOne {
    public static void main(String[] args) {
        int n = 0;
        while (n < 30) {
            System.out.println("n = " + n);
            n += 10;
        }
    }
}


// javac LoopingOne.JAVA
// java Looping One
