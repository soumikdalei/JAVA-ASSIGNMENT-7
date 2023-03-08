import java.util.Scanner;
public class Q6 {
    public static double min1(double array[]){
        double a=array[0];
        for(int i=0;i<array.length;i++){
            if(a>array[i]){a=array[i];}
        }
        return a;
    }
    public static double min2(double array[]){
        double a=min1(array);
        double b=array[0];
        for(int i=0;i<array.length;i++){
            if(b>array[i]&&array[i]!=a){
                b=array[i] ;
            }
        }
        return b;
    }
    public static void main(String[] args) {
        double []abc={8.2,8.9,8.0,5.4,5.5};
        System.out.println(min2(abc));
    }

}

