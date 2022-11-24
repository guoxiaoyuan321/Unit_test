package org.apache.commons.lang3;

import junit.framework.TestCase;
import org.junit.Test;

import java.io.IOException;

public class RandomUtilsTest extends TestCase {
    @Test
    public void testnextInt() throws IOException {
        int a = 10;
        int b = 100;
        int c = RandomUtils.nextInt(a, b);
        if (c > b) {
            System.err.println("Error1: Random numbers cross the boundary");
        }
    }

    @Test
    public void testnextInt2() throws IOException {
        int a = 10;
        int b = 1000;
        int c = RandomUtils.nextInt(a, b);
        if (c > b) {
            System.err.println("Error2: Random numbers cross the boundary");
        }
    }
}