import java.util.Arrays;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        int[] numbers = new int []{1,67,4,5,66,0,23,4,6,23,4,77,4};
           System.out.println(Arrays.toString((changeArray(numbers, 23))));
           }
           public static int[]changeArray(int [] myArray, int number){
        int position = myArray.length - 1;
        for(int i = 0; i < position; i++){
            if(myArray[i] == number){
                while(myArray[position] == number && position > i){
                    position--;
                }int temp = myArray[i];
                myArray[i]= myArray[position];
                myArray[position]= temp;
                position--;
            }
        }return myArray;
    }


}