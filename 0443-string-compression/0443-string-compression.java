class Solution {
    public int compress(char[] chars) {
        int w = 0;
        for (int r = 0, c; r < chars.length; r += c) {
            char ch = chars[r];
            for (c = 0; r + c < chars.length && chars[r + c] == ch; c++);
            chars[w++] = ch;
            if (c > 1)
                for (char d : String.valueOf(c).toCharArray())
                    chars[w++] = d;
        }
        return w;
    }
}