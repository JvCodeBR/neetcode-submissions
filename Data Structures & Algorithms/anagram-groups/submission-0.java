class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> anagramGroups = new ArrayList<>();
        Map<Integer, Boolean> hasGroup = new HashMap<>();
        for (int i = 0; i < strs.length; i++) {
            if (!hasGroup.containsKey(i)) {
                List<String> group = new ArrayList<>();
                group.add(strs[i]);
                hasGroup.put(i, true);
                Map<Character, Integer> currentCount = new HashMap<>();
                for (int c = 0; c < strs[i].length(); c++) {
                    if (currentCount.containsKey(strs[i].charAt(c))) {
                        currentCount.put(
                            strs[i].charAt(c), currentCount.get(strs[i].charAt(c)) + 1);
                    } else {
                        currentCount.put(strs[i].charAt(c), 1);
                    }
                }
                for (int j = 0; j < strs.length; j++) {
                    if (!hasGroup.containsKey(j) && (strs[i].length() == strs[j].length())) {
                        Map<Character, Integer> outerCount = new HashMap<>();
                        for (int c = 0; c < strs[j].length(); c++) {
                            if (outerCount.containsKey(strs[j].charAt(c))) {
                                outerCount.put(
                                    strs[j].charAt(c), outerCount.get(strs[j].charAt(c)) + 1);
                            } else {
                                outerCount.put(strs[j].charAt(c), 1);
                            }
                        }
                        if (outerCount.equals(currentCount)) {
                            hasGroup.put(j, true);
                            group.add(strs[j]);
                        }
                    }
                }
                anagramGroups.add(group);
            }
        }
        return anagramGroups;
    }
}
