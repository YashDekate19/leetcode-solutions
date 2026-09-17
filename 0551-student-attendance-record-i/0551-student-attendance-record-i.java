class Solution {
    public boolean checkRecord(String s) {
        int a = 0;
        for(int i = 0 ; i<s.length();i++){
            if(s.charAt(i)=='A'){
                a++;
            }
            if(a>1 ){
                return false;
            }
        }
        return !s.contains("LLL");
    }
}