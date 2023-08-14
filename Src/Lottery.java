import java.util.Arrays;
import java.util.Random;

public class Lottery {
    final static int arrLength = 7;

    public static void main(String[] args) {
        Random random = new Random();
        int[] firstArr = new int[arrLength];
        int[] secondArr = new int[arrLength];
        for (int i = 0; i < arrLength; i++) {
            int firstTemp = random.nextInt(9);
            int secondTemp = random.nextInt(9);
            firstArr[i] = firstTemp;
            secondArr[i] = secondTemp;
        }
        Arrays.sort(firstArr);
        System.out.println(Arrays.toString(firstArr));
        Arrays.sort(secondArr);
        System.out.println(Arrays.toString(secondArr));
        int coincidences = 0;

        for (int i = 0; i < arrLength; i++) {
            if (firstArr[i] == secondArr[i]) {
                coincidences++;
            }
        }

        System.out.printf("The number of coincidences are: %d", coincidences);
    }
}
