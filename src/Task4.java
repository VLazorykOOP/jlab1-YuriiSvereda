import java.util.Random;

public class Task4 {
    private static char[] removeCharFromArr(char[] arr, int index){
        char[] newArr = new char[arr.length-1];
        for(int i=0; i<index; i++){
            newArr[i] = arr[i];
        }
        for(int i=index; i<newArr.length; i++){
            newArr[i] = arr[i+1];
        }
        return newArr;
    }
    public static void test(){
        String text = "qwert, jbnvm okgnnvj, vmkg adkf.";
        char[] charArray = text.toCharArray();
        for(int i=0; i<charArray.length; i++) {
            if(i == 0 || charArray[i-1] == ' ') {
                if(charArray[i] == 'a' ||
                        charArray[i] == 'e' ||
                        charArray[i] == 'u' ||
                        charArray[i] == 'o' ||
                        charArray[i] == 'i'

                ){
                    for(int j=i; j < charArray.length; j++){
                        if(charArray[j] != ' ' && charArray[j] != ',' && charArray[j] != '.' )
                            charArray[j] = ' ';

                        else
                            break;
                    }
                }
            }
        }
        System.out.println(charArray);
        for(int i=0; i<charArray.length; i++){
            if(charArray[i]==' ' && (charArray[i+1]==' ' || charArray[i+1]==',' || charArray[i+1]=='.')){
                charArray = removeCharFromArr(charArray, i);
                i--;
            }
        }
        System.out.println(charArray);
    }
}
