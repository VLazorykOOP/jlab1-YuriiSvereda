import java.util.Scanner;

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

    private static String function(String text){
        char[] charArray = text.toCharArray();
        for(int i=0; i<charArray.length; i++) {
            if(i == 0 || charArray[i-1] == ' ') {
                if(
                        charArray[i] == 'a' ||
                                charArray[i] == 'e' ||
                                charArray[i] == 'u' ||
                                charArray[i] == 'o' ||
                                charArray[i] == 'i'

                ){
                    for(int j=i; j < charArray.length; j++) {
                        if (charArray[j] != ' '){
                            charArray = removeCharFromArr(charArray, j);
                            j--;
                        }

                        else{
                            charArray = removeCharFromArr(charArray, j);
                            i--;
                            break;
                        }
                    }
                }
            }
        }
        String newText = new String(charArray);
        return newText;
    }
    public static void test(){
        Scanner scan = new Scanner(System.in);
        System.out.println("enter your text");
        String text = scan.nextLine();
        text = function(text);
        System.out.println(text);
    }
}

