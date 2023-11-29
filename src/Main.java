public class Main {
    public static void main(String[] args) {
        int[] array = {2, 7, 1, 9, 3, 5, 8, 6};
        int answer = f(array, 9);
        System.out.println("Missed: " + answer);
    }
    private static int f(int[] array, int N) {
        int sum = N * (N + 1) / 2;
        int sum2 = 0;

        for (int number : array) {
            sum2 += number;
        }

        return sum - sum2;
    }
}
