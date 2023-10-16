import java.util.Arrays;

public class ödev{
    public static void main(String[] args) {
        int[] numbers = {15, 12, 778, 1, -1, -778, 2, 0}; 
        int targetNumber = 5; 
        Arrays.sort(numbers); 
        int smaller = -1;
        int larger = -1;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < targetNumber) {
                smaller = numbers[i];
            } else {
                larger = numbers[i];
                break;
            }
        }
        System.out.println("Girilen sayıdan küçük en yakın sayı: " + smaller);
        System.out.println("Girilen sayıdan büyük en yakın sayı: " + larger);
    }
}
