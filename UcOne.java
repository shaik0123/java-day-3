package day3;

public class UcOne {
    public static void main(String[] args) {
        int IS_PRESENT = 1;
        double check = Math.floor(Math.random() * 10) % 2;
        if(check == 1)
            System.out.println("emp is present");
        else
            System.out.println("emp is absent");

    }
}
