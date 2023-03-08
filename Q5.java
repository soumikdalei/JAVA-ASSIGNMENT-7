import java.util.Scanner;
public class Q5 {
    public static double min(double[] array){
        double max = array[0];
        for(int i=0;i<array.length;i++){
            if(array[i]>max){
                max=array[i];
            }
        }
        return max;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter array values");
        double array[]= new double[5];
        for(int i=0;i<array.length;i++){
            array[i]=sc.nextDouble();

        }
        double max=min(array);
        System.out.println(max);

    }
}
