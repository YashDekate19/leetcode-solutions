import java.util.ArrayDeque;
import java.util.Deque;

class Solution {
    public String decodeString(String s) {
        Deque<Integer> count = new ArrayDeque<>();
        Deque<StringBuilder> string = new ArrayDeque<>();
        StringBuilder str = new StringBuilder();
        int currentK = 0;

        for (char ch : s.toCharArray()) {
            if (Character.isDigit(ch)) {
                currentK = currentK * 10 + (ch - '0');
            } else if (ch == '[') {
                count.push(currentK);
                string.push(str);
                str = new StringBuilder();
                currentK = 0;
            } else if (ch == ']') {
                StringBuilder str1 = string.pop();
                int r = count.pop();
                for (int i = 0; i < r; i++) {
                    str1.append(str);
                }
                str = str1;
            } else {
                str.append(ch);
            }
        }

        return str.toString();
    }
}
