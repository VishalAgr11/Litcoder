import java.util.Scanner;

public class SecretSharing {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int delay = in.nextInt();
        int forget = in.nextInt();

        int result = numberOfPeople(n, delay, forget);
        System.out.println(result);
    }

    private static int numberOfPeople(int n, int delay, int forget) {
        int[] people = new int[n + 1];

        for (int day = delay; day <= n; day++) {
            people[day] = 1;

            if (day - forget >= 0) {
                people[day] += people[day - forget];
            }

            people[day] += people[day - 1];
        }

        return people[n];
    }
}
