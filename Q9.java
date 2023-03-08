import java.util.Scanner;
public class Q9 {
    public static int linear_search(int a,int []element ){
        int i =0;int n=element.length;int K=0;
        while(i<n){
            if(element[i]!=a) {
                i = i+1;

            }
            else{
                K=i;
                break;
            }

        }
        return K;
    }

    public static void main(String[] args) {
        int element[]={2,7,8,9,0};
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter element to be searched");
        int n=sc.nextInt();
        System.out.println(linear_search(n,element));
    }
}
