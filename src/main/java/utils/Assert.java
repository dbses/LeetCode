package utils;

public class Assert {

    public static void assertTrue(boolean assertion) {

        if (!assertion) {
            throw new RuntimeException("assertion error.");
        }
    }

    public static void assertFalse(boolean assertion) {

        assertTrue(!assertion);
    }

    public static void assertEquals(int assertion, int expect) {

        if (assertion != expect) {
            throw new RuntimeException("assertion error. expect: " + assertion + ", actual: " + expect);
        }
    }

}
