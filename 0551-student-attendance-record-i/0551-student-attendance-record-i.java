class Solution {
    public boolean checkRecord(String s) {
        int a = 0;
        for(int i = 0 ; i<s.length();i++){
            if(s.charAt(i)=='A'){
                a++;
            }
        }
        return a<2 && !s.contains("LLL");
    }
}