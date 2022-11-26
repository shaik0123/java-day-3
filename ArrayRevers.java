package day3;

public class ArrayRevers {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6};
        System.out.println("original array");
        for(int i=0;i< array.length;i++)
        {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        System.out.println("reverse array");
        for(int j=array.length-1;j>=0;j--)
        {
            System.out.print(array[j] + " ");
        }
    }
}
