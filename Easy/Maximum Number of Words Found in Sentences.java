class Solution {
    public int mostWordsFound(String[] sentences) {
        int max=0;
        int n=sentences.length;
        for(String s : sentences){
            int count=1;
            for(int i=0;i<s.length();i++){
                if(s.charAt(i)==' ') count++;
            }
            max=Math.max(max,count);
        }
        return max;
    }
}