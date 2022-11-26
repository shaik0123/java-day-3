package day3;

public class ArraySortingAscending {
    public static void main(String[] args) {
        int[] array = {6, 2, 5, 3, 1, 4};
        int temp = 0;
        System.out.println("original array");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
        }
        for (int i=0;i<array.length;i++)
            for (int j=i+1;j<array.length; j++) {
                if (array[i] > array[j]) {
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }

            }
        System.out.println();
        System.out.println("after sorting");
        for (int i=0;i<array.length; i++) {
            System.out.print(array[i]);
        }
    }
}