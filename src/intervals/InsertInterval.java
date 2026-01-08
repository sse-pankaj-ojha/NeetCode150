package intervals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//https://leetcode.com/problems/insert-interval/
//57. Insert Interval
public class InsertInterval {
    static void main() {
        int[][] intervals = {{1,3},{6,9}} ;
        int[] newInterval = {2,5};

        int[][] res = insert(intervals, newInterval);
        for(int[] i : res){
            System.out.println(Arrays.toString(i));
        }
    }

    public static int[][] insert(int[][] intervals, int[] newInterval) {

        List<int[]> result = new ArrayList<>();

        //1. Add all values before intervals
       for(int[] i : intervals){
           if(i[1] < newInterval[0]) result.add(i);
       }

        //2. merge overlapping intervals
        for(int[] i : intervals){
            if(i[0]<=newInterval[1] && i[1] >= newInterval[0]){
                newInterval[0] = Math.min(i[0], newInterval[0]);
                newInterval[1] = Math.max(i[1], newInterval[1]);
            }
        }
        result.add(newInterval);

        // 3. Add all values after intervals
        for(int[] i : intervals){
            if(i[0] > newInterval[1]) result.add(i);
        }

        return result.toArray(new int[result.size()][]);
    }
}
