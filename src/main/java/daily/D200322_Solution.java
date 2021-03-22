package daily;

/**
 * 输入：00000000000000000000000000001011
 * 输出：3
 * 解释：输入的二进制串 00000000000000000000000000001011 中，共有三位为 '1'。
 * <p>
 * 输入：00000000000000000000000010000000
 * 输出：1
 * 解释：输入的二进制串 00000000000000000000000010000000 中，共有一位为 '1'。
 * <p>
 * 输入：11111111111111111111111111111101
 * 输出：31
 * 解释：输入的二进制串 11111111111111111111111111111101 中，共有 31 位为 '1'。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/number-of-1-bits
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 *
 * @author yanglulu
 */
public class D200322_Solution {

    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {

        int count = 0;

        while (n != 0) {
            n &= n - 1;
            count++;
        }

        return count;
    }

    public static void main(String[] args) {
        D200322_Solution solution = new D200322_Solution();
        System.out.println(solution.hammingWeight(Integer.valueOf("00000000000000000000000000001011", 2)));
        System.out.println(solution.hammingWeight(Integer.valueOf("00000000000000000000000010000000", 2)));
//        System.out.println(solution.hammingWeight(Integer.valueOf("11111111111111111111111111111101", 2)));
    }

}
