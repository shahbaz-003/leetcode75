import java.util.*;

public class Solution {

    public static List<List<Integer>> generate(int numRows) {

        List<List<Integer>> result = new ArrayList<>();

        for (int i = 0; i < numRows; i++) {

            List<Integer> currentRow = new ArrayList<>();

            // First element
            currentRow.add(1);

            // Middle elements
            for (int j = 1; j < i; j++) {

                int value = result.get(i - 1).get(j - 1)
                           + result.get(i - 1).get(j);

                currentRow.add(value);
            }

            // Last element
            if (i > 0) {
                currentRow.add(1);
            }

            result.add(currentRow);
        }

        return result;
    }

    public static void main(String[] args) {

        int numRows = 5;

        List<List<Integer>> result = generate(numRows);

        System.out.println("Pascal's Triangle:");

        for (List<Integer> row : result) {
            System.out.println(row);
        }
    }
}