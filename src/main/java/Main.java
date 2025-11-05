public class Main {


    public int lengthOfLongestSubstring(String s) {
        if (s == null || s.isEmpty()) {
            return 0;
        }
        int maxLength = 0;
        int start = 0;
        int[] lastSeen = new int[Character.MAX_VALUE];
        java.util.Arrays.fill(lastSeen, -1);

        for (int end = 0; end < s.length(); end++) {
            char currentChar = s.charAt(end);
            if (lastSeen[currentChar] >= start) {
                start = lastSeen[currentChar] + 1;
            }
            lastSeen[currentChar] = end;
            maxLength = Math.max(maxLength, end - start + 1);
        }
    
        return maxLength;
    }




    public static void main(String[] args) {

    }
}
