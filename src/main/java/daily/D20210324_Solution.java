package daily;

import utils.Assert;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeMap;

/**
 * 给你一个整数数组 nums ，数组中共有 n 个整数。132 模式的子序列 由三个整数 nums[i]、nums[j] 和 nums[k] 组成，并同时满足：i < j < k 和 nums[i] < nums[k] < nums[j] 。
 * <p>
 * 如果 nums 中存在 132 模式的子序列 ，返回 true ；否则，返回 false 。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/132-pattern
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 *
 * @author yanglulu
 */
public class D20210324_Solution {

    public boolean find132pattern(int[] nums) {

        int n = nums.length;
        if (n < 3) {
            return false;
        }

        // 左侧最小值
        int leftMin = nums[0];
        // 右侧所有元素
        TreeMap<Integer, Integer> rightAll = new TreeMap<>();

        for (int k = 2; k < n; ++k) {
            rightAll.put(nums[k], rightAll.getOrDefault(nums[k], 0) + 1);
        }

        for (int j = 1; j < n - 1; ++j) {
            if (leftMin < nums[j]) {
                Integer next = rightAll.ceilingKey(leftMin + 1);
                if (next != null && next < nums[j]) {
                    return true;
                }
            }
            leftMin = Math.min(leftMin, nums[j]);
            rightAll.put(nums[j + 1], rightAll.get(nums[j + 1]) - 1);
            if (rightAll.get(nums[j + 1]) == 0) {
                rightAll.remove(nums[j + 1]);
            }
        }

        return false;
    }

    public static void main(String[] args) {
        D20210324_Solution solution = new D20210324_Solution();

        int[] nums1 = new int[]{1, 2, 3, 4};
        int[] nums2 = new int[]{3, 1, 4, 2};
        int[] nums3 = new int[]{-1, 3, 2, 0};

        Assert.assertFalse(solution.find132pattern(nums1));
//        Assert.assertTrue(solution.find132pattern(nums2));
//        Assert.assertTrue(solution.find132pattern(nums3));

    }

}
