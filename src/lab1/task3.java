package lab1;

public class task3 {
    public static void main(String[] args) {

        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int sum = 0;
        System.out.print("Your array: ");
        for (int i = 0; i < array.length; i++){
            System.out.print(array[i]+" ");
            sum+=array[i];
        }
        System.out.print("\nSum of elements: " + sum
                + "\nArifmetic mean: " + (float)sum/array.length);

    }
}
