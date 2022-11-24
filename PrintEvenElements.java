package day3;

public class PrintEvenElements {
    public static void main(String[] args) {
        int[] array ={1,2,3,4,5,6};
        System.out.println("array elements on even position");
        for(int i=1;i< array.length;i=i+2){
            System.out.print(array[i] + " ");
        }
    }

}

