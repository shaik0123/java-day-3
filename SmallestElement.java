package day3;

public class SmallestElement {
    public static void main(String[] args) {
        int[] arr ={44,22,55,33,77,};
        int min = arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        System.out.println(min);
    }
}
