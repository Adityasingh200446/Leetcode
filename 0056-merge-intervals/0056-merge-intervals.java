
import java.util.*;

class Solution {
    public int[][] merge(int[][] intervals) {

        List<int[]> list = new ArrayList<>();

        if (intervals.length == 0) {
            return new int[0][];
        }

        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

        int i = 0;
        int n = intervals.length;

        while (i < n) {

            int[] newint = new int[2];

            newint[0] = intervals[i][0];
            newint[1] = intervals[i][1];

            i++;

            while (i < n && newint[1] >= intervals[i][0]) {

                newint[0] = Math.min(newint[0], intervals[i][0]);
                newint[1] = Math.max(newint[1], intervals[i][1]);

                i++;
            }

            list.add(newint);
        }

        return list.toArray(new int[list.size()][]);
    }
}

