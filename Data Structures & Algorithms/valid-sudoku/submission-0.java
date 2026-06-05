class Solution {
    public boolean isValidSudoku(char[][] board) {
        Map<Integer, Set<Character>> lineChars = new HashMap<>();
        Map<Integer, Set<Character>> columnChars = new HashMap<>();
        Map<String, Set<Character>> boxChars = new HashMap<>();

        for (int i = 0; i < 9; i++) {
            String xZone;
            if (i >= 6) {
                xZone = "3";
            } else if (i >= 3) {
                xZone = "2";
            } else {
                xZone = "1";
            }
            for (int j = 0; j < 9; j++) {
                char currentChar = board[i][j];
                if (currentChar == '.')
                    continue;
                String yZone;
                if (j >= 6) {
                    yZone = "3";
                } else if (j >= 3) {
                    yZone = "2";
                } else {
                    yZone = "1";
                }

                String zone = xZone + yZone;

                if (!lineChars.containsKey(i)) {
                    lineChars.put(i, new HashSet<>());
                }
                if (lineChars.get(i).contains(currentChar)) {
                    return false;
                } else {
                    lineChars.get(i).add(currentChar);
                }

                if (!columnChars.containsKey(j)) {
                    columnChars.put(j, new HashSet<>());
                }
                if (columnChars.get(j).contains(currentChar)) {
                    return false;
                } else {
                    columnChars.get(j).add(currentChar);
                }

                if (!boxChars.containsKey(zone)) {
                    boxChars.put(zone, new HashSet<>());
                }
                if (boxChars.get(zone).contains(currentChar)) {
                    return false;
                } else {
                    boxChars.get(zone).add(currentChar);
                }
            }
        }

        return true;
    }
}
