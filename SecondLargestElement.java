package day3;

public class SecondLargestElement {
    public static void main(String[] args) {
        int[] array = {6, 2, 5, 3, 1, 4};
        int temp = 0;
        int size = 0;
        size = array.length;
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
            //System.out.print(array[size-2]);
        }
        System.out.print(array[size-2]);

    }
}
