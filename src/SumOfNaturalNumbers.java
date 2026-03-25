  import java.util.Scanner;
public class SumOfNaturalNumbers {

 

    public static int NumberSum(int N) {
        int sum = 0;
        for (int i = 1; i <= N; i++) {
            sum += i;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        System.out.println(NumberSum(N));
    }
    
}
