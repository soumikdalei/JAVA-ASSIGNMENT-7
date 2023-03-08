public class Q7 {
        public static double max1(double abc[]){
            double a=abc[0];
            for(int i=0;i<abc.length;i++){
                if(a<abc[i]){a=abc[i];}
            }
            return a;
        }

        public static double max2(double abc[]){
            double a=max1(abc);
            double b=abc[0];
            for(int i=0;i<abc.length;i++){
                if(b<abc[i]&&abc[i]!=a){
                    b=abc[i] ;
                }
            }
            return b;
        }


        public static void main(String[] args) {
            double []abc={8.2,8.9,8.0};
            System.out.println(max2(abc));
        }

    }

