import java.util.Arrays;
import java.util.Scanner;

public class TaskScheduling {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input: Number of tasks
        int n = sc.nextInt();

        // Input: Task durations
        int[] tasks = new int[n];
        for (int i = 0; i < n; i++) {
            tasks[i] = sc.nextInt();
        }

        // Input: Number of workers
        int k = sc.nextInt();

        // Output: Minimum time required
        int result = minTimeRequired(tasks, k);
        System.out.println(result);
    }

    private static int minTimeRequired(int[] tasks, int k) {
        int low = Arrays.stream(tasks).max().getAsInt(); // Start with the maximum task duration
        int high = Arrays.stream(tasks).sum(); // End with the sum of all task durations

        while (low < high) {
            int mid = (low + high) / 2;
            if (isFeasible(tasks, k, mid)) {
                high = mid;
            } else {
                low = mid + 1;
            }
        }

        return low;
    }

    private static boolean isFeasible(int[] tasks, int k, int time) {
        int workers = 1;
        int currentWork = 0;

        for (int task : tasks) {
            if (currentWork + task > time) {
                workers++;
                currentWork = 0;
            }
            currentWork += task;
        }

        return workers <= k;
    }
}
