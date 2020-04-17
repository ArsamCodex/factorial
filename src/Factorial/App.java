package Factorial;

public class App {

    private static long fact(int n){
        if(n == 0){
            return 1;
        }
        else {
            return (n * fact(n-1));
        }
    }

    public static void main (String [] args){
        int n1,n2,n3,temp;
        long sum;
        System.out.print("Result is");
        for(int i = 10 ; i <=200 ;i++){
            n1  = i % 10;
            temp = i / 10;
            n2 = temp % 10;
            temp /= 10;
            n3 = temp   % 10;
            sum = fact(n1 ) + fact(n2)+fact(n3);
            if(sum == i){
                System.out.printf("        %1$s" , i);
            }


        }
    }
}
