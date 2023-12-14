import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ElementsDistance {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String[] elements = in.nextLine().split(" ");
        int k = in.nextInt();

        boolean result = hasDuplicateWithinDistance(elements, k);
        System.out.println(result ? "Yes" : "No");
    }

    private static boolean hasDuplicateWithinDistance(String[] elements, int k) {
        Map<String, Integer> lastIndexMap = new HashMap<>();

        for (int i = 0; i < elements.length; i++) {
            String element = elements[i];

            if (lastIndexMap.containsKey(element) && i - lastIndexMap.get(element) <= k) {
                return true;
            }

            lastIndexMap.put(element, i);
        }

        return false;
    }
}
