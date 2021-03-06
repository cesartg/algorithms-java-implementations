package org.cesartg.algorithms;

class LongestCommonSubsequence {
    static int calculateLengthLongestSubsequence(String str1, String str2) {
        int[][] lengthArray = new int[str1.length() + 1][str2.length() + 1];
        for (int i = 0; i < str1.length(); i++) {
            for (int j = 0; j < str2.length(); j++) {
                if (str1.charAt(i) == str2.charAt(j)) {
                    lengthArray[i + 1][j + 1] = lengthArray[i][j] + 1;
                } else {
                    lengthArray[i + 1][j + 1] = Math.max(lengthArray[i + 1][j], lengthArray[i][j + 1]);
                }
            }
        }
        return lengthArray[str1.length()][str2.length()];
    }
}
