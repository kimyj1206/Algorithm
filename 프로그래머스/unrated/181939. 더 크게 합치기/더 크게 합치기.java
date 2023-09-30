class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        
        String strA = String.valueOf(a);
        String strB = String.valueOf(b);
        
        String result1 = strA + strB;
        String result2 = strB + strA;
        
        int resA = Integer.parseInt(result1);
        int resB = Integer.parseInt(result2);
        
        answer = resA > resB? resA: resB;
        
        return answer;
    }
}