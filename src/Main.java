import org.junit.Test;

public class Main {
    @Test
    public void doi() {
        solve();
    }

    public void solve() {
        int N = 501;
        int result = 0;

        int[] array = createArray();

        do {
            int randomNumber = getRandom(1, 10);
            int sum = 0;

            int[] randomNumberHolder = new int[randomNumber];

            for (int i = 0; i < randomNumberHolder.length; i++) {
                randomNumberHolder[i] = array[getRandom(0, 19)];
                sum += randomNumberHolder[i];
            }

            if (sum == N) {
                result = sum;
                for (int elem : randomNumberHolder) {
                    System.out.print(elem + " ");
                }
            }
        } while (result != N);
    }

    public int getRandom(int min, int max) {
        return (int) ((Math.random() * (max - min)) + min);
    }

    int[] createArray() {
        int[] array = new int[20];
        for (int i = 0; i < 20; i++) {
            array[i] = (int) Math.pow(2, i);
        }
        return array;
    }
}
