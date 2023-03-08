import java.util.Scanner;
public class Q2 {
    static boolean is_prime(int n){
        for(int i=2;i<=n/2;i++){
            if(n%i==0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=sc.nextInt();
        int array[]=new int[n];int d=0;
        for(int i=0;i<=array.length-1;i++) {
            array[i]=(int)(1+(100*Math.random()));
            System.out.println(array[i]);

            if(is_prime(array[i])){
                d++;
            }
        }
        System.out.println("THe number of prime numbers are "+d);
    }
}
