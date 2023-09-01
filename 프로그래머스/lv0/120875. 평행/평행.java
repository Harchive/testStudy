import java.util.*;

class Solution {
    public int solution(int[][] dots) {
        int answer = 0;
        int x1 = dots[0][0];
        int y1 = dots[0][1];
        int x2 = dots[1][0];
        int y2 = dots[1][1];
        int x3 = dots[2][0];
        int y3 = dots[2][1];
        int x4 = dots[3][0];
        int y4 = dots[3][1];
        
        double line1 = (double) (y2 - y1) / (x2 - x1);
        double line2 = (double) (y4 - y3) / (x4 - x3);
        if (line1 == line2) answer = 1;
        
        line1 = (double) (y3 - y1) / (x3 - x1);
        line2 = (double) (y2 - y4) / (x2 - x4);
        if (line1 == line2) 
            answer = 1;
        
        line1 = (double) (y4 - y1) / (x4 - x1);
        line2 = (double) (y2 - y3) / (x2 - x3);
        if (line1 == line2) 
            answer = 1;
        
        return answer;
    }
}