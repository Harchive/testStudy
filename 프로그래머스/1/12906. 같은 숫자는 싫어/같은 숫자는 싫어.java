import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        List<Integer> list = new ArrayList<>();
        
        for(int i = 0; i<arr.length-1;i++){
            if(arr[i] != arr[i+1]){
                list.add(arr[i]);
            }
        }
        list.add(arr[arr.length-1]);
        int[] answer = new int[list.size()];
        int num = 0;
        for(int i :list){
            answer[num] = i;
            num++;
        }
        return answer;
    }
}
