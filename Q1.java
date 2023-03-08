import java.util.Scanner;
public class Q1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=sc.nextInt();
        int array[]=new int[n];int sum=0;
        for(int i=0;i<= array.length-1;i++){
            array[i]=(int)(1+(n*Math.random()));
            System.out.println(array[i]);
            sum=sum+array[i];
        }
        System.out.println("Sum "+sum);
        System.out.println("Average "+(sum/n));

    }

}
