package intervals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

//https://leetcode.com/problems/merge-intervals/
//56. Merge Intervals
public class MergeIntervals {
    static void main() {
        //int[][] intervals = {{1,3},{2,6},{8,10},{15,18}};
        int[][] intervals = {{4,7},{1,4}};
        //int[][] intervals = {{1,4},{5,6}};
        int[][] result = merge(intervals);
        for(int[] i : result){
            System.out.println(Arrays.toString(i));
        }
    }

    public static int[][] merge(int[][] intervals) {
        if (intervals.length == 0) return new int[0][];
        Arrays.sort(intervals, Comparator.comparingInt(a -> a[0]));

        int start = intervals[0][0];
        int end = intervals[0][1];

        List<int[]> list = new ArrayList<>();

        for(int[] interval : intervals){

            if(end < interval[0]){
                list.add(new int[]{start, end});
                start = interval[0];
                end = interval[1];
            }else{
                end = Math.max(end, interval[1]);
            }
        }
        list.add(new int[]{start, end});


        return list.toArray(new int[list.size()][]);

    }
}
