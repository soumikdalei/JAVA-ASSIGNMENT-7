import java.util.Scanner;
public class andad {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int counts[] = new int[101];
        while (true) {
            int num = sc.nextInt();
            if (num == 0) {
                break;
            }
            if (num >= 1 && num <= 100) {
                counts[num]++;
            } else {
                System.out.println("Invalid input : " + num);
            }
        }
        for (int i=1;i<=100;i++){
            if(counts[i]>0){
                System.out.println(i+" : "+counts[i]);
            }
        }
    }
}
