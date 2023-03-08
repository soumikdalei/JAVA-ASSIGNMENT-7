import java.util.Scanner;
public class Q4 {
    public static double min(double[] array){
        double min = array[0];
        for(int i=0;i<array.length;i++){
            if(array[i]<min){
                min=array[i];
            }
        }
        return min;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter array values");
        double array[]= new double[10];
        for(int i=0;i<array.length;i++){
            array[i]=sc.nextDouble();

        }
        double min=min(array);
        System.out.println(min);


    }
}
