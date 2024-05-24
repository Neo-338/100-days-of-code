import java.util.Arrays;
import java.util.Random;

public class SelectionSort {

    public static void main(String[] args) {

        Random rand = new Random();
        int temp;
        int[] randomNumbers = new int[20];
        for (int i = 0; i < randomNumbers.length; i++) {
            randomNumbers[i] = (rand.nextInt(100) + 100);
        }
        System.out.println("Array unsorted: " + Arrays.toString(randomNumbers));

        for (int i = 0; i < randomNumbers.length; i++) {
            int smallest = i;
            for (int j = i + 1; j < randomNumbers.length; j++) {
                if (randomNumbers[j] < randomNumbers[smallest]) {
                    smallest = j;
                }
            }
            if (smallest != i) {
                temp = randomNumbers[smallest];
                randomNumbers[smallest] = randomNumbers[i];
                randomNumbers[i] = temp;
            }
        }
        System.out.println("  Array sorted: " + Arrays.toString(randomNumbers));
    }
}
