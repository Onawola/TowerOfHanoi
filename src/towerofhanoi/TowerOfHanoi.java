package towerofhanoi;

import java.util.Scanner;

public class TowerOfHanoi {
    public static void shift(int n, String startPole, String intermediatePole, String endPole) {
        if (n == 0) {
            return;
        }
        shift(n - 1, startPole, endPole, intermediatePole);

        System.out.println("Disk " + n + " moved from " + startPole + " to " + endPole);

        shift(n - 1, intermediatePole, startPole, endPole);
    }

    public static void main(String[] args) {
        System.out.print("Enter number of discs: ");
        Scanner scanner = new Scanner(System.in);
        int numberOfDiscs = scanner.nextInt();
        long startTime = System.nanoTime();
        shift(numberOfDiscs, "Pole1", "Pole2", "Pole3");
        long endTime = System.nanoTime();
        long duration = (endTime - startTime);  //divide by 1000000 to get milliseconds.
        System.out.println("Elapsed Time for Tower Of Hanoi in nano seconds: " + duration);
        scanner.close();
    }
}