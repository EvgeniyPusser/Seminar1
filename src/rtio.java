import java.util.Random;

public class rtio {
    public static void main(String[] args) {
        int a = 9;
        writePolynome(a);

    }

    static void writePolynome(int k){
       Random rand = new Random(10);
        for(int i = k; i > 0; i--){

            System.out.print((Double.toString((rand.nextInt() / 10000000)) + "* x ^ " + i + " + " ));

    } System.out.print(Integer.toString(rand.nextInt()));
}
}
