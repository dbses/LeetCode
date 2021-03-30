package daily;

import java.util.HashSet;
import java.util.Set;

public class D20210330_Solution {

    public boolean searchMatrix(int[][] matrix, int target) {

        Set<Integer> set = new HashSet<>();

        for (int[] ints : matrix) {

            for (int j = 0; j < matrix[0].length; j++) {

                set.add(ints[j]);
            }
        }

        return set.contains(target);
    }

    public static void main(String[] args) {



    }

}
