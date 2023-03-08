import java.util.Scanner;
public class reversinginput {

    public static void reverse(int[] arr) {
        int left = 0;
        int right = arr.length - 1;
        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }





        public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no of elements");
        int n=sc.nextInt();
        int array[]=new int[n];
        reverse(array);
        for(int i=0;i<array.length;i++){
            array[i]=sc.nextInt();
            System.out.print(array[i]+" ");


        }




    }
}
