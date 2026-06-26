class Solution {
    public int compress(char[] chars) {
        int n = chars.length;
        int i = 0;
        int index = 0;

        while (i < n) {
            char currentChar = chars[i];
            int count = 0;
            while (i < n && chars[i] == currentChar) {
                i++;
                count++;
            }

            chars[index++] = currentChar;
            if (count > 1) {
                String countStr = String.valueOf(count);
                for (char c : countStr.toCharArray()) {    /*  this line will convert the string to char 
                                                        example :- char[] arr = {'1','2'};
                                                            for (int i = 0; i < arr.length; i++) {
                                                        char c = arr[i];
                                                        }   */
                    chars[index++] = c;
                }
            }
        }
        return index;
    }
}