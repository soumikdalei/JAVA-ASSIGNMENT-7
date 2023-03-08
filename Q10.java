import java.util.Scanner;
public class Q10{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            int[] arr = null;
            int n = 0;
            int choice;

            do {
                System.out.println("\nMenu:");
                System.out.println("1. Create an array of N integers");
                System.out.println("2. Display the array elements");
                System.out.println("3. Insert an element at specific position");
                System.out.println("4. Delete an element at a given position");
                System.out.println("5. Exit");
                System.out.print("Enter your choice: ");
                choice = sc.nextInt();

                switch (choice) {
                    case 1:
                        System.out.print("Enter the size of the array: ");
                        n = sc.nextInt();
                        arr = new int[n];
                        System.out.println("Array created successfully.");
                        break;
                    case 2:
                        if (arr == null) {
                            System.out.println("Error: Array not created yet.");
                        } else {
                            System.out.println("Array elements:");
                            for (int i = 0; i < n; i++) {
                                System.out.print(arr[i] + " ");
                            }
                            System.out.println();
                        }
                        break;
                    case 3:
                        if (arr == null) {
                            System.out.println("Error: Array not created yet.");
                        } else {
                            System.out.print("Enter the position to insert the element: ");
                            int pos = sc.nextInt();
                            if (pos < 1 || pos > n + 1) {
                                System.out.println("Error: Invalid position.");
                            } else {
                                System.out.print("Enter the element to insert: ");
                                int ele = sc.nextInt();
                                for (int i = n - 1; i >= pos - 1; i--) {
                                    arr[i + 1] = arr[i];
                                }
                                arr[pos - 1] = ele;
                                n++;
                                System.out.println("Element inserted successfully.");
                            }
                        }
                        break;
                    case 4:
                        if (arr == null) {
                            System.out.println("Error: Array not created yet.");
                        } else {
                            System.out.print("Enter the position to delete the element: ");
                            int pos = sc.nextInt();
                            if (pos < 1 || pos > n) {
                                System.out.println("Error: Invalid position.");
                            } else {
                                for (int i = pos - 1; i < n - 1; i++) {
                                    arr[i] = arr[i + 1];
                                }
                                n--;
                                System.out.println("Element deleted successfully.");
                            }
                        }
                        break;
                    case 5:
                        System.out.println("Exiting program...");
                        break;
                    default:
                        System.out.println("Error: Invalid choice.");
                }
            } while (choice != 5);
        }
    }


