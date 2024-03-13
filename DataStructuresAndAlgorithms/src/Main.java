import Array;
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        int arr[] = {1,2,3,4,5,6,9,10};

        Array.StaticArray staticArray = new Array.StaticArray();
        staticArray.printArr(arr, arr.length);
    }
}