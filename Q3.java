import java.util.Scanner;
public class Q3 {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int[] counts = new int[101];
            System.out.println("Enter integers between 1 and 100 (end with 0):");
            while (true) {
                int num = scanner.nextInt();
                if (num == 0) {
                    break;
                }
                if (num >= 1 && num <= 100) {
                    counts[num]++;
                    System.out.println(counts[num]);
                } else {
                    System.out.println("Invalid input: " + num);
                }
            }
            System.out.println("Occurrences of each integer:");
            for (int i = 1; i <= 100; i++) {
                if (counts[i] > 0) {
                    System.out.println(i + ": " + counts[i]);
                }
            }
        }
    }


