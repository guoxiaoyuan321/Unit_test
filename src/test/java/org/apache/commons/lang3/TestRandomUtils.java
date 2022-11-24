package org.apache.commons.lang3;

public class TestRandomUtils {
    public static void main(String args[]) {
        int a = 10;
        int b = 100;
        int c = RandomUtils.nextInt(a, b);
        if (c > b) {
            System.err.println("Error: Random numbers cross the boundary");
        }
    }
}
