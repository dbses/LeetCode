package daily;

import utils.Assert;

import java.util.Stack;

public class D20210329_Solution {

    // you need treat n as an unsigned value
    public int reverseBits(int n) {

        Stack<Character> stack = new Stack();

        String string = Integer.toBinaryString(n);

        for (int i = 0; i < string.length(); i++) {
            stack.push(string.charAt(i));
        }

        StringBuilder result = new StringBuilder();

        while (!stack.isEmpty()) {
            result.append(stack.pop());
        }

        return Integer.parseInt(result.toString(), 2);
    }

    public static void main(String[] args) {

        D20210329_Solution solution = new D20210329_Solution();

        int n = Integer.parseInt("00000010100101000001111010011100", 2);

        Assert.assertEquals(solution.reverseBits(n), 964176192);
        
    }

}
