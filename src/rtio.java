import java.util.Random;
import java.util.Scanner;

public class rtio {
    public static void main(String[] args) {
        //int a = 9;
        //writePolynome(a);
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number (n): ");
        int n = scan.nextInt();

        int primeCount = countPrimeBeforeN(n);
        System.out.println("Number of prime numbers before  " + n + ": " + primeCount);
        //scan.closed();
    }
    public static boolean IsPrime(int number){
        if(number <= 1){
            return false;
        }
        for(int i = 2; i * i <= number; i++){
            if(number% i == 0){
                return false;
            }
        } return true;
    }
public static int countPrimeBeforeN(int n){
        int count = 0;
        for(int i = 2; i < n; i++){
            if (IsPrime(i)){
                System.out.println();
                count++;
            }
        }return count;
}
//    static void writePolynome(int k){
//       Random rand = new Random(10);
//        for(int i = k; i > 0; i--){
//
//            System.out.print((Double.toString((rand.nextInt() / 10000000)) + "* x ^ " + i + " + " ));
//
//    } System.out.print(Integer.toString(rand.nextInt()));


}
