import java.util.Random;

public class Task2 {
    private static int[] getRandomArray(int arrayLength, int minVal, int maxVal){
        int[] randomArray = new int[arrayLength];
        Random random = new Random();

        for (int i = 0; i < arrayLength; i++) {
            randomArray[i] = random.nextInt(minVal, maxVal);
        }
        return  randomArray;
    }


    private static int[] addElementToArr(int[] arr, int newElement ) {
        int[] newArr = null;
        if (arr != null) {
            int newLength = arr.length + 1;
            newArr = new int[newLength];
            for (int i = 0; i < arr.length; i++) {
                newArr[i] = arr[i];
            }
            newArr[newArr.length - 1] = newElement;
        } else {
            newArr = new int[1];
            newArr[0] = newElement;
        }
        return newArr;
    }

    private static int[] arrayDifference(int[] aArr, int[] bArr){
        int [] resultArr = null;
        boolean ifUnic = true;
        for(int i=0; i<aArr.length; i++){
            for(int j=0; j<bArr.length; j++){
            if(aArr[i]==bArr[j])
               ifUnic = false;
            }
            if(ifUnic)
                resultArr = addElementToArr(resultArr, aArr[i]);
            else
                ifUnic = true;
        }
        return  resultArr;
    }

    private static int findMinArrayValue(int[] arr){
        int minValue = arr[0];
        for(int i=0; i<arr.length; i++){
            if(minValue>arr[i])
                minValue = arr[i];
        }
        return minValue;
    }
    private static void printArr(int[] arr){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + "\t");
        }
        System.out.println();
    }
    public static void test(){
        Random rnd = new Random();
        int nLength = rnd.nextInt(400);
        int mLength = rnd.nextInt(200);
        int[] arrayA = getRandomArray(nLength, 0, 100);
        int[] arrayB = getRandomArray(mLength, 0, 100);
        System.out.println("Array A: ");
        printArr(arrayA);
        System.out.println("Array B: ");
        printArr(arrayB);
        int[] diffrenceAB = arrayDifference(arrayA, arrayB);
        System.out.println("Elements that contained in array A and not contained in array B: ");
        printArr(diffrenceAB);
        System.out.println("Smallest of them: " + findMinArrayValue(diffrenceAB));
    }
}
