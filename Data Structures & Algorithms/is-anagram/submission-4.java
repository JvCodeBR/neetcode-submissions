class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length())
            return false;
        Map<Character, Integer> countS = new HashMap<>();
        Map<Character, Integer> countT = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char sChar = s.charAt(i);
            char tChar = t.charAt(i);

            if (countS.containsKey(sChar)) {
                countS.put(sChar, countS.get(sChar) + 1);
            } else {
                countS.put(sChar, 1);
            }

            if (countT.containsKey(tChar)) {
                countT.put(tChar, countT.get(tChar) + 1);
            } else {
                countT.put(tChar, 1);
            }
        }

        for (Character i : countS.keySet()) {
            if (!countS.get(i).equals(countT.get(i)))
                return false;
        }

        return true;
    }
}
