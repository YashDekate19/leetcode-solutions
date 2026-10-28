class Solution {
    public int repeatedStringMatch(String a, String b) {
        StringBuilder sb = new StringBuilder(a);
        int c = 1;
        
        while (sb.indexOf(b) == -1) {
            if (sb.length() > 2 * a.length() + b.length()) {
                return -1;
            }
            sb.append(a);
            c++;
        }
        return c;
    }
}
