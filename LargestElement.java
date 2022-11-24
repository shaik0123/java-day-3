package day3;

public class LargestElement {
    public static void main(String[] args) {
        int[] arr ={44,22,55,33,77,};
        int max = arr[0];
        for(int i=0;i<arr.length;i++){
            //System.out.println(arr[i]);
            if(arr[i]>max){
                max=arr[i];
            }
            //System.out.println(max);
        }
        System.out.println(max);
    }
}
