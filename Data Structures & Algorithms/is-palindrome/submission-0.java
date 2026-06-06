class Solution {
    public boolean isPalindrome(String s) {
        String clean = s.replaceAll("[^a-zA-Z0-9]", "");
        for (int i = 0; i < clean.length(); i++) {
            char c1 = clean.charAt(i);
            char c2 = clean.charAt(clean.length() - 1 - i);

            if (c1 >= 'a' && c1 <= 'z') {
                c1 = (char) (c1 - 32); 
            }
            if (c2 >= 'a' && c2 <= 'z') {
                c2 = (char) (c2 - 32); 
            }

            if (c1 != c2) return false;
        }
        return true;
    }
}
