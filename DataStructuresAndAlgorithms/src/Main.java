import Array.*;
public class Main {
    public static void main(String[] args) {
        Array.StaticArray staticArray = new Array.StaticArray();
        int arr[] = {1,2,3,4,6,7,8,9,0};

        staticArray.printArr(arr, arr.length);

        staticArray.insertEnd(arr, 10, arr.length -1, arr.length);
        staticArray.printArr(arr, arr.length);

        staticArray.insertMiddle(arr,4, 5, arr.length -1);
        staticArray.printArr(arr, arr.length);

        staticArray.removeEnd(arr, arr.length);
        staticArray.printArr(arr, arr.length);

        staticArray.removeMiddle(arr,4,  arr.length -1);
        staticArray.printArr(arr, arr.length);
    }

}