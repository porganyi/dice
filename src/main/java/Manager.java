import java.util.Arrays;
import java.util.Random;

public class Manager {

    public void cube() {
        for (int j = 0; j < 10; j++) {
            int[] arrayN = new int[10];
            for (int i = 0; i < 10; i++) {
                Random random = new Random();
                int n = random.nextInt(10) + 1;
                if (i > 1 && i < 8) {
                    arrayN[i] = n;
                }
                if (i == 9) {
                    arrayN[i] = 9;
                }
                if (i == 10) {
                    int m = random.nextInt(10) + 1;
                    // ha paros
                    if (m == 2 || m == 4 || m == 6 || m == 8 || m == 10) {
                        int o = random.nextInt(10) + 1;
                        if (o == 2 || m == 4 || m == 6 || m == 8) {
                            arrayN[i] = 9;
                        } else if (o == 1 || o == 3) {
                            arrayN[i] = 1;
                        } else if (o == 7 || o == 9) {
                            arrayN[i] = 7;
                        } else if (o == 5) {
                            arrayN[i] = 5;
                        } else if (o == 10) {
                            arrayN[i] = 9;
                        }
                    } else {
                        if (m == 1) {
                            arrayN[i] = 8;
                        } else if (m == 3) {
                            arrayN[i] = 5;
                        } else {
                            arrayN[i] = n * 5;
                        }
                    }
                }
            }
            System.out.println(Arrays.toString(arrayN));
        }
    }

}
