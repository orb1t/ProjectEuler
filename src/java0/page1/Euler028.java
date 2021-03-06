package java0.page1;

import java0.euler.project.Project;

/**
 * @author Obicere
 */
public class Euler028 extends Project {

    public int number() {
        return 28;
    }

    private static final int SIZE       = 1001;
    private static final int LAST_LIMIT = SIZE * SIZE;

    public String call() {
        int sum = 1;
        int last = 1;
        for (int i = 2; last < LAST_LIMIT; i += 2) {
            //for (int j = 0; j < 4; j++) {
            //    last += i;
            //    sum += last;
            // }
            // x = (n + i) + (n + i + i) + (n + i + i + i) + (n + i + i + i + i)
            // x = 4n + 10i
            sum += 10 * i + 4 * last;
            last += 4 * i;
        }
        return String.valueOf(sum);
    }
}